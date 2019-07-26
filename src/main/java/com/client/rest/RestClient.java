package com.client.rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientConfig;

import com.client.rest.entity.UsersResponse;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

public class RestClient {
	private static final String REST_URI = "https://gorest.co.in/public-api/users?access-token=gCFb_GCcnGeyyWlBtF_rjnryq07YweBwIFyL";
    private Client client = ClientBuilder.newClient(new ClientConfig(JacksonJsonProvider.class));
    
    public UsersResponse getUsers() {
    	UsersResponse response = client.target(REST_URI).request(MediaType.APPLICATION_JSON).get(UsersResponse.class);
    	return response;
    }
}
