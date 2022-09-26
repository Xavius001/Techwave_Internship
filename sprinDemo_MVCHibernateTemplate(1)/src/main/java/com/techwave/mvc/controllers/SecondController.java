package com.techwave.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("msg")
public class SecondController {
@RequestMapping("third")
public String third()
{
return "third";	
}

}
