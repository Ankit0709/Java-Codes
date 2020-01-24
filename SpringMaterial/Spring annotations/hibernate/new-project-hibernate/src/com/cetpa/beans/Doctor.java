package com.cetpa.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="doctor_details")
@Entity
public class Doctor 
{
	private int doctorId;
	private String doctorName, doctorSpec, doctorAddress;
	private float doctorExp;
	private int doctorFee;

	@Id
	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	@Column()
	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	@Column//(name="doc_spec")
	public String getDoctorSpec() {
		return doctorSpec;
	}

	public void setDoctorSpec(String doctorSpec) {
		this.doctorSpec = doctorSpec;
	}

	@Column//(name="doc_address")
	public String getDoctorAddress() {
		return doctorAddress;
	}

	public void setDoctorAddress(String doctorAddress) {
		this.doctorAddress = doctorAddress;
	}

	@Column//(name="doc_exp")
	public float getDoctorExp() {
		return doctorExp;
	}

	public void setDoctorExp(float doctorExp) {
		this.doctorExp = doctorExp;
	}

	@Column//(name="doc_fee")
	public int getDoctorFee() {
		return doctorFee;
	}

	public void setDoctorFee(int doctorFee) {
		this.doctorFee = doctorFee;
	}

	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public Doctor(int doctorId, String doctorName, String doctorSpec, String doctorAddress, float doctorExp,
			int doctorFee) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorSpec = doctorSpec;
		this.doctorAddress = doctorAddress;
		this.doctorExp = doctorExp;
		this.doctorFee = doctorFee;
	}

}
