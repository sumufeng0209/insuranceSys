package org.java.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class init {

    @GetMapping("init")
    public String init(){
        return "index";
    }

}
