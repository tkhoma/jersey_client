package com.client.rest.entity;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private int id;
    @JsonProperty("first_name")
    private String firstName;
    private String lastName;
    private UserLinks userLinks;

    @JsonProperty("_links")
    private void unpackNestedLinks(Map<String, Map<String, String>> links) {
        userLinks = new UserLinks();
        Map<String, String> self = links.get("self");
        userLinks.setSelf(self.get("href"));
        Map<String, String> edit = links.get("edit");
        userLinks.setEdit(edit.get("href"));
        Map<String, String> avatar = links.get("avatar");
        userLinks.setAvatar(avatar.get("href"));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
