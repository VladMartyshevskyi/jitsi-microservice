package org.exoplatform.jitsi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
  
    // Auth endpoint ( will be open in iframe from eXo for setting the token to local storage )
    @GetMapping("/auth")
    public String index(Model model) {
        return "auth";
    }
}