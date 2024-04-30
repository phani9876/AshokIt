package com.phanit.request;

import lombok.Data;

@Data
public class SearchResponse {

	private String name;
	private Long phNo;
	private String email;
	private Character gender;
	private Long ssn;
	private String planName;
	private String planStatus;
}
