package com.test.util;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
public class HomeController {

    @RequestMapping("/")

    public ModelAndView helloWorld() {
        return new
                ModelAndView("welcome","message","Hello World");
    }

    @RequestMapping("/userform")
    public ModelAndView userform(){

        return new ModelAndView("form","inst","Please fill out the form: ");
    }

    @RequestMapping("/formhandler")
    public ModelAndView formhandler(@RequestParam("name") String name,
                                    @RequestParam("bday") int bday,
                                    @RequestParam("email") String email,
                                    @RequestParam("username") String username,
                                    @RequestParam("password") String password)

    {
        ModelAndView mv = new ModelAndView("formresponse");
        mv.addObject("name", name);
        mv.addObject("bday",bday);
        mv.addObject("email",email);
        mv.addObject("username", username);
        mv.addObject("password", password);

        return mv;
    }

}
