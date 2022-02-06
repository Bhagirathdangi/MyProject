package com.nt.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Adress111")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer aId;
	private String street;
	private String city;
	private Integer zip;
	private String State;
	private String country;
	
	@OneToMany
	@JoinColumn(name="emp_id")
	public List<Employee> emmp_id;
}
