package fr.stanislasleroy.dmp.controller;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.stanislasleroy.dmp.dto.AccountDTO;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class AccountController {

	@GetMapping(path = "/account")
	public ResponseEntity<AccountDTO> getAccount() {
//		public ResponseEntity<DocumentDTO> getDocuments(){
		System.out.println("GET");

		AccountDTO account = new AccountDTO("123", "stanislas", "azerty", "Stanislas", "LEROY", new Date(), 16925485,
				"0698988758", "mail@test.fr", new Date());

		return ResponseEntity.ok(account);
	}

}
