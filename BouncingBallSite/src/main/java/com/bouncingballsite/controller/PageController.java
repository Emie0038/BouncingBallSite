package com.bouncingballsite.controller;


import com.bouncingballsite.model.Images;
import com.bouncingballsite.services.ImagesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @Autowired
    private ImagesServices imagesServices;

    @GetMapping("/")
    public String index (Model model){
        return "index";
    }
}
