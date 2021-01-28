package fr.stanislasleroy.dmp.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.stanislasleroy.dmp.dto.HistoryDTO;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class HistoryController {
	
	@GetMapping(path = "/histories")
	public ResponseEntity<List<HistoryDTO>> getHistories(){
//		public ResponseEntity<DocumentDTO> getDocuments(){
		System.out.println("GET");
		
		ArrayList<HistoryDTO> histories = new ArrayList<>();
		histories.add(new HistoryDTO("123", new Date(), "Stanislas LEROY", "a consulté : Volontés et droits du patients", "Normal"));
		histories.add(new HistoryDTO("123", new Date(), "Stanislas LEROY", "a ouvert le DMP avec un navigateur internet", "Normal"));
		histories.add(new HistoryDTO("123", new Date(), "Stanislas LEROY", "a consulté l'historique des accès", "Normal"));
		histories.add(new HistoryDTO("123", new Date(), "Stanislas LEROY", "a consulté la liste des PS/ES autorisés", "Normal"));
		histories.add(new HistoryDTO("123", new Date(), "Stanislas LEROY", "accès refusé. Code d'accès à usage unique incorrect", "Normal"));
		
		return ResponseEntity.ok(histories);
	}

}
