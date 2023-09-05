package com.cursochat.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController("/health-check")
public class HealthCheckController {

    private final static Logger LOGGER = Logger.getLogger(HealthCheckController.class.getName());

    @GetMapping("/v1")
    void healthCheck() {
        LOGGER.info("health check");
    }
}
