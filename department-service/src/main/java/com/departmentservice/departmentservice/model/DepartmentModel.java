package com.departmentservice.departmentservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class DepartmentModel {

	public long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
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
	private long departmentId;
	private String departMentName;
	private String departMentAddress;
    private String departMentCode;
}
