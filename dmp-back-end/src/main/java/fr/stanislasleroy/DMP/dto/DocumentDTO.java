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
public class DocumentDTO {

	String id;
	String type;
	String title;
	Date start;
	Date end;
	String author;
	String profession;
	String content;
}
