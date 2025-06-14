package com.deepseek_chat_interface.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeepseekUIController {

    @GetMapping
    public String home() {
        return "index";
    }
}
