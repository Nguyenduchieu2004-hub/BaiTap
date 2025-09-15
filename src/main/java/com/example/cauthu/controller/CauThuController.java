package com.example.cauthu.controller;

import com.example.cauthu.service.ICauThuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CauThuController {
    @Autowired
    private ICauThuService cauThuService;
    @GetMapping("/Cauthu")
    public String showList(Model model) {
        model.addAttribute("cauthuList",cauThuService.findAll());
    return "cauthu/List";
    }

}
