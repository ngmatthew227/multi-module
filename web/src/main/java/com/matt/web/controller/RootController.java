package com.matt.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.matt.utils.TestUtils;

@RestController
public class RootController {

  // TestUtils testUtils;

  // public RootController(TestUtils testUtils) {
  //   this.testUtils = testUtils;
  // }

  @GetMapping("/test-util")
  public String testUtil(@RequestParam String name) {
    return TestUtils.testFunc(name);

  }
}
