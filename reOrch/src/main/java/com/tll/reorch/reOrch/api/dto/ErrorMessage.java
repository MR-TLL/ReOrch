package com.tll.reorch.reOrch.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.annotation.ParametersAreNonnullByDefault;


@NoArgsConstructor
@Getter
@ParametersAreNonnullByDefault
public class ErrorMessage {

    private String message;

    // map the value of json 'message' field to local message variable
    public ErrorMessage(@JsonProperty("message") String message) {
        this.message = message;
    }

}
