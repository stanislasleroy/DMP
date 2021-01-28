package fr.stanislasleroy.dmp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.stanislasleroy.dmp.dto.AlertDTO;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class AlertController {
	
	@GetMapping(path = "/alerts")
	public ResponseEntity<List<AlertDTO>> getDocuments(){
//		public ResponseEntity<DocumentDTO> getDocuments(){
		System.out.println("GET");
		
		ArrayList<AlertDTO> documents = new ArrayList<>();
		documents.add(new AlertDTO("123", "Connexion", "Dernière connexion le 18/01/2021 à 13:14:11"));
		documents.add(new AlertDTO("124", "Connexion", "Dernière connexion le 19/01/2021 à 13:14:11"));
		documents.add(new AlertDTO("125", "Connexion", "Dernière connexion le 20/01/2021 à 13:14:11"));
		
		return ResponseEntity.ok(documents);
	}

}
