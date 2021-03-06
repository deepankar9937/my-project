package com.te.lms.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class MockDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mockId;
	
	private int mockNo;
	
	private String technology;
	
	private String panel;
	
	private Date dateAndTime;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "batchId")
	private BatchDetails batchDetails;
}
