package com.departmentservice.departmentservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long departMentId;
	private String departMentName;
	public long getDepartMentId() {
		return departMentId;
	}
	public void setDepartMentId(long departMentId) {
		this.departMentId = departMentId;
	}
	public String getDepartMentName() {
		return departMentName;
	}
	public void setDepartMentName(String departMentName) {
		this.departMentName = departMentName;
	}
	public String getDepartMentAddress() {
		return departMentAddress;
	}
	public void setDepartMentAddress(String departMentAddress) {
		this.departMentAddress = departMentAddress;
	}
	public String getDepartMentCode() {
		return departMentCode;
	}
	public void setDepartMentCode(String departMentCode) {
		this.departMentCode = departMentCode;
	}
	private String departMentAddress;
    private String departMentCode;	

}
