package com.cordona.recipeproject.controllers;

import com.cordona.recipeproject.domain.Category;
import com.cordona.recipeproject.domain.UnitOfMeasure;
import com.cordona.recipeproject.repositories.CategoryRepository;
import com.cordona.recipeproject.repositories.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String indexPage(Model model) {

        return "index";
    }
}
