package com.phanit.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "ELIGIBILITY_DETAILS")
public class EligibilityDetails {

	@Id
	//@Column(name = "ELIGIBILITY_ID")
	private Integer eligId;

	//@Column(name = "ELIGIBILITY_NAME")
	private String name;

	//@Column(name = "MOBILE")
	private Long mobile;

	//@Column(name = "EMAIL")
	private String email;

	//@Column(name = "GENDER")
	private Character gender;

	//@Column(name = "SOCAL_SERVICE_NO")
	private Long ssn;

	//@Column(name = "PLAN_NAME")
	private String planName;

	//@Column(name = "PLAN_STATUS")
	private String planStatus;

	//@Column(name = "PLAN_START_DATE")
	private LocalDate planStartDate;

	//@Column(name = "PLAN_END_DATE")
	private LocalDate planEndDate;

	//@Column(name = "CREATE_DATE")
	private LocalDate createDate;

	//@Column(name = "UPDATE_DATE")
	private LocalDate updateDate;

	//@Column(name = "CREATED_BY")
	private LocalDate createdBy;

	//@Column(name = "UPDATED_BY")
	private LocalDate updatedBy;

}
