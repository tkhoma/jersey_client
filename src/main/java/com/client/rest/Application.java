package com.client.rest;

public class Application {

	public static void main(String[] args) {
		RestClient client = new RestClient();
		client.getUsers();
	}

}
