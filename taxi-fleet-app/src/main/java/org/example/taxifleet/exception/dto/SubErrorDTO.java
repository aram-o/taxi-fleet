package org.example.taxifleet.exception.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class SubErrorDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("path")
    private String path;

    @JsonProperty("message")
    private String message;
}
