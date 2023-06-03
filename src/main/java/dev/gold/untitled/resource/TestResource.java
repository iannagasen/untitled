package dev.gold.untitled.resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestResource {

  @CrossOrigin
  @GetMapping
  public String test() {
    return "test";
  }
}
