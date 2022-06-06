package com.tacos.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tacos.data.TacoRepository;
import com.tacos.model.Taco;

@RestController
@RequestMapping(path = "/rest", produces = "application/json")
public class TacoControllerApi {
	
	@Autowired
	private TacoRepository tacoRepo;
	
	@GetMapping("/{id}")
	public ResponseEntity<Taco> tacoById(@PathVariable("id") Long id) {
		Optional<Taco> findedTaco = tacoRepo.findById(id);
		if(findedTaco.isPresent())return new ResponseEntity<>(findedTaco.get(),HttpStatus.OK);
		return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
	}
	
	@PostMapping(path="/takos", consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public Taco postTaco(@RequestBody Taco nuevoTaco) {
		return tacoRepo.save(nuevoTaco);
		
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteTaco(@PathVariable("id") Long id) {
		tacoRepo.deleteById(id);
	}
	

	@GetMapping(path = "/recent")
	public Iterable<Taco> getAllTacos(){
		PageRequest page = PageRequest.of(0, 3,Sort.by("createdAt").descending());
		return tacoRepo.findAll(page).getContent();
	}

}
