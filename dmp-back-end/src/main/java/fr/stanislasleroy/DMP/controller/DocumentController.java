package fr.stanislasleroy.dmp.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.stanislasleroy.dmp.dto.DocumentDTO;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class DocumentController {
	
	@GetMapping(path = "/documents")
	public ResponseEntity<List<DocumentDTO>> getDocuments(){
//		public ResponseEntity<DocumentDTO> getDocuments(){
		System.out.println("GET");
		
		ArrayList<DocumentDTO> documents = new ArrayList<>();
		documents.add(new DocumentDTO("123", "Imagerie médicale", "Radio poumon", new Date(), new Date(), "Dr X", "Radiologue", "IMG"));
		documents.add(new DocumentDTO("686", "Ordonnance", "Ordonnance kinésithérapeuthe", new Date(), new Date(), "Dr X", "Radiologue", "IMG"));
		documents.add(new DocumentDTO("858", "Acte médical", "Infiltration corticoïde", new Date(), new Date(), "Dr X", "Radiologue", "IMG"));
	
		return ResponseEntity.ok(documents);
	}

}
