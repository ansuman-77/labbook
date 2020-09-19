package com.cg.iter.programservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class ProgramEntity {
	@Id
	public String Id;
	public String name;
	public String description;
	public String eligibility;
	public String duration;
	public String degreeCertificateOffered;
	/**
	 * 
	 */
	public ProgramEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProgramEntity [Id=" + Id + ", name=" + name + ", description=" + description + ", eligibility="
				+ eligibility + ", duration=" + duration + ", degreeCertificateOffered=" + degreeCertificateOffered
				+ "]";
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEligibility() {
		return eligibility;
	}
	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDegreeCertificateOffered() {
		return degreeCertificateOffered;
	}
	public void setDegreeCertificateOffered(String degreeCertificateOffered) {
		this.degreeCertificateOffered = degreeCertificateOffered;
	}
	



}
