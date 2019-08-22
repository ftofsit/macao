package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class search {
    @RequestMapping("/search")
    public String search(Model model) {
        model.addAttribute("content", "1");
        return "search";
    }
}
