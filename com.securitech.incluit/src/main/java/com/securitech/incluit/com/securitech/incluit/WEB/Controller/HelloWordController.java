package com.securitech.incluit.com.securitech.incluit.WEB.Controller;

import com.securitech.incluit.com.securitech.incluit.WEB.Services.HelloWordServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HelloWordController {
    @Autowired
    private HelloWordServices helloWordServices;


    @RequestMapping(value = "/")
        public String gethelloWord(ModelMap model){
            model.put("message", helloWordServices.getMessage());
            return"Hellow-word";
        }
    }


