package com.laioffer.jupiter.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginResponseBody {
    // session_id is not returned here because it's in the header
    @JsonProperty("user_id")
    private final String userId;

    @JsonProperty("name")
    private final String name;

    // JSONCreator not here because here we need to convert Java object to JSON object
    // when returning the response to client
    public LoginResponseBody(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}
