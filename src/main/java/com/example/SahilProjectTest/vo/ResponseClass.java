package com.example.SahilProjectTest.vo;

import java.util.List;

public class ResponseClass {

	private String status;
	private String user_id;
	private String email;
	private String oll_number;
	private List<String> numbers;
	private List<String> alphabets;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOll_number() {
		return oll_number;
	}
	public void setOll_number(String oll_number) {
		this.oll_number = oll_number;
	}
	public List<String> getNumbers() {
		return numbers;
	}
	public void setNumbers(List<String> numbers) {
		this.numbers = numbers;
	}
	public List<String> getAlphabets() {
		return alphabets;
	}
	public void setAlphabets(List<String> alphabets) {
		this.alphabets = alphabets;
	}	
	
}
