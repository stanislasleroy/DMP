package fr.stanislasleroy.dmp.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class AccountDTO {

	private String id;
	private String login;
	private String password;
	private String firtstname;
	private String lastname;
	private Date birthdate;
	private int ssNumber;
	private String phoneNumber;
	private String emailAddress;
	private Date dmpCreated;
}
