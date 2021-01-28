package fr.stanislasleroy.dmp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.stanislasleroy.dmp.dto.InformationDTO;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class InformationController {
	
	@GetMapping(path = "/informations")
	public ResponseEntity<List<InformationDTO>> getDocuments(){
//		public ResponseEntity<DocumentDTO> getDocuments(){
		System.out.println("GET");
		
		ArrayList<InformationDTO> documents = new ArrayList<>();
		documents.add(new InformationDTO("123", "Radio poumon", "IMG"));
		documents.add(new InformationDTO("686", "Ordonnance kinésithérapeuthe", "PDF"));
		documents.add(new InformationDTO("858", "Acte médical", "Infiltration corticoïde"));
		
		return ResponseEntity.ok(documents);
	}

}
