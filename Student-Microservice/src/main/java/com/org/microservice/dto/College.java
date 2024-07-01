package com.org.microservice.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class College {
	@Id
	@GeneratedValue
	private int collegeregId;
	private String name;
	private String location;
	private String univercityName;
	private int studentCount;

}
