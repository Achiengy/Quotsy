package com.quotsy.myfavequotsy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuotsyController {

    @GetMapping("/quotsy")
    public String word(){
         return "Remember to live every day to the fullest!";
}
}
