package com.tacos.web;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import lombok.extern.slf4j.Slf4j;

import com.tacos.data.IngredientRepository;
import com.tacos.data.TacoRepository;
import com.tacos.model.Ingredient;
import com.tacos.model.Ingredient.Type;
import com.tacos.model.Order;
import com.tacos.model.Taco;

@Slf4j
@Controller
@RequestMapping("/design")
@SessionAttributes("order")
public class DesignController {

	@Autowired
	private IngredientRepository repo;
	
	@Autowired
	private TacoRepository tacoRepo;
	
	List<Ingredient> ingredients;
	
	@GetMapping
	public String showDesignForm(Model model) {	
		ingredients = new ArrayList<Ingredient>();
		repo.findAll().forEach(i -> ingredients.add(i));
		addData(model);
		model.addAttribute("tktn",(new Taco()));
		return "design";
	}
	
	
	@ModelAttribute(name="order")
	public Order order() {
		return new Order();
	}
	
	@PostMapping
	public String processDesign(@Valid @ModelAttribute(name="tktn") Taco design, Errors errors, Model model, @ModelAttribute Order order) {	
		ingredients = new ArrayList<Ingredient>();
		repo.findAll().forEach(i -> ingredients.add(i));
		
		if(errors.hasErrors()) {
			log.info("Ha habido un error al crear el taco");
			addData(model);
			return "design";
		}
		Taco savedTaco = tacoRepo.save(design);
		order.addDesign(design);
		log.info(savedTaco.toString());
		log.info("Taco recibido, preparando comanda....." + design);
		return "redirect:/orders/current";	
	}
	
	private void addData(Model model) {
		Type[] types = Ingredient.Type.values();
		for(Type type : types) model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients,type));
	}

	private List<Ingredient> filterByType(List<Ingredient> ingredients, Type type) {
		// TODO Auto-generated method stub
		return ingredients
				.stream()
				.filter(x -> x.getType().equals(type))
				.collect(Collectors.toList());
	}
}
