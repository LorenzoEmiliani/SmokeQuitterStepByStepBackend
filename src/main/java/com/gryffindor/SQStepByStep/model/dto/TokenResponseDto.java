package com.gryffindor.SQStepByStep.model.dto;

public class TokenResponseDto {

    private String token;

    private String errorMessage;

    public TokenResponseDto(){}

    public TokenResponseDto(String token, String errorMessage) {
        this.token = token;
        this.errorMessage = errorMessage;
    }

    public String getToken() {
        return token;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
