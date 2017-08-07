package edu.berliner.crabbywebpagepretty.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController
{
    @GetMapping("/crabbywebpage")
    public String showPage()
{
    return "crabbywebpage";
}
}
