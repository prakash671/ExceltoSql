package com.cts.hibernate.xlSql.pojo;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Business_employment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Datapojo {

	
	
	private String series_reference;
	private String Period;
	@Id
	private double Data_value;
	
	private String Status;
	
	private String Units;
	private double Magnitude;
	private String subject;
	private String group;
	private String seriest1;
	private String seriest2;
	private String seriest3;
	
	
	
	
	
	
	
	
	
}
