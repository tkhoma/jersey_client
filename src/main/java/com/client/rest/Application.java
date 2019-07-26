package com.client.rest;

import com.client.rest.entity.User;
import com.client.rest.entity.UsersResponse;

public class Application {

    public static void main(String[] args) {
        RestClient client = new RestClient();
        UsersResponse usersResponse = client.getUsers();
        System.out.println("There are " + usersResponse.getResult().size() + " users.");
        User user = usersResponse.getResult().stream().findFirst().get();
        System.out.println("user id: " + user.getId());
        System.out.println("first name: " + user.getFirstName());
        System.out.println("last name: " + user.getLastName());
    }

}
