package com.ht.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewRecipeController {

	@RequestMapping({"", "/", "/viewRecipe"})
	public String viewRecipe() {
		return "index";
	}
	
}
