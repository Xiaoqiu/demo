package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kate
 * @create 2019/12/2
 * @since 1.0.0
 */
@RestController
public class DemoController {

  @GetMapping(value = "/getName")
  public String getName(){
    return "i'm kate";
  }
}