package com.app.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.app.soap.Person;
@Component
public class PersonData {
	private Map<Integer,Person> personMap = new HashMap<Integer,Person>();
	public PersonData(){
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("edy");
		p1.setCountry("Peru");
		personMap.put(1, p1);		
	}
	public Person getPerson(int id){
		return personMap.get(id);
	}
} 