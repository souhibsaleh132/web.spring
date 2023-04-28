package com.example.web;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;

public class CustomError implements ErrorController {

    private static final String ERROR_PATH = "/error";

    @GetMapping(value=ERROR_PATH)
    public String error() {
        return "Error Custom";
    }

   // @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }

    @GetMapping("/errorCustom")
    String errorHeaven() {
        return "You have reached the hell of errors!!!";
    }
}
