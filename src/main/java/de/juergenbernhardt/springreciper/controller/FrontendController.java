package de.juergenbernhardt.springreciper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import de.juergenbernhardt.springreciper.service.RecipeService;

@Controller
public class FrontendController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("recipes", recipeService.getAllRecipeEntities());
        return "recipe";
    }

}
