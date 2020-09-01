package org.exoplatform.jitsi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@Controller
public class AuthController {
  
  // Auth endpoint ( will be open in iframe from eXo for setting the token to local storage )
  @GetMapping("/auth")
  public String index(@RequestHeader("X-Exoplatform-Identity") String identity,
                      @RequestHeader("X-Exoplatform-Auth") String authToken,
                      Model model) {
    System.out.println("IDENTITY: " + identity);
    System.out.println("AUTH: " + authToken);
    return "auth";
  }
}