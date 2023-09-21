package br.com.matuzalem.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {
    @GetMapping("/create")
    public String create(){
        return "create";
    }
}
