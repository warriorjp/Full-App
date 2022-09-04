package com.fullApp.userservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

	private long departMentId;
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
	private String departMentName;
	private String departMentAddress;
	private String departMentCode;
}