package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.app.soap.GetPersonResponse;
import com.app.soap.GetPersonRequest;

@Endpoint
public class PersonEndpoint {
	private static final String NAMESPACE_URI = "http://app.com/soap";
	@Autowired
	private PersonData personData;	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPersonRequest")
	@ResponsePayload
	public GetPersonResponse getCountry(@RequestPayload GetPersonRequest request) {
		GetPersonResponse response = new GetPersonResponse();
		response.setPerson(personData.getPerson(request.getId()));
		return response;
	}
} 
