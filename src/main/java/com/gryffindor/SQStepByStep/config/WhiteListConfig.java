package com.gryffindor.SQStepByStep.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WhiteListConfig {
    @Value("${security.whitelist.urls}")
    private String[] whiteListUrls;

    public String[] getWhiteListUrls() {
        return whiteListUrls;
    }
}
