package com.example.SahilProjectTest.vo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;


public class RequestClass {
	
	public List<String> temp = new ArrayList<String>();

	@Override
	public String toString() {
		return "RequestBody [temp=" + temp.toString() + "]";
	}

	public List<String> getTemp() {
		return temp;
	}

	public void setTemp(List<String> temp) {
		this.temp = temp;
	}
	
}
