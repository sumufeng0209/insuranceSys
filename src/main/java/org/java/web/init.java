package org.java.web;

import org.java.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.websocket.server.PathParam;
import java.util.Map;

@Controller
public class init {
    @Autowired
    private LoginService loginService;

    @GetMapping("init")
    public String init(){

        return "login";
    }


    @GetMapping("index")
    public String index(Model model, String user , String pwd){
        Map<String,String> map=loginService.login(user, pwd);
        System.out.println(map);
        model.addAttribute("user",map);
        return "index";
    }

}
