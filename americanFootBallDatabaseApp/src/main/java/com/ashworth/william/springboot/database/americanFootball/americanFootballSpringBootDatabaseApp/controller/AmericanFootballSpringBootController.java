package com.ashworth.william.springboot.database.americanFootball.americanFootballSpringBootDatabaseApp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashworth.william.springboot.database.americanFootball.americanFootballSpringBootDatabaseApp.exception.ResourceNotFoundException;
import com.ashworth.william.springboot.database.americanFootball.americanFootballSpringBootDatabaseApp.model.AmericanFootballSpringBootModel;
import com.ashworth.william.springboot.database.americanFootball.americanFootballSpringBootDatabaseApp.repository.AmericanFootballSpringBootRepository;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class AmericanFootballSpringBootController 
{
	@Autowired
	AmericanFootballSpringBootRepository americanFootballRepository;
	
	//Method to create a vehicle
	@PostMapping("/film")
	public AmericanFootballSpringBootModel createFilm(@Valid @ RequestBody AmericanFootballSpringBootModel bSDM)
	{
		return americanFootballRepository.save(bSDM);
	}
	
	//Method to get a vehicle by id
	@GetMapping("/film/{id}")
	public AmericanFootballSpringBootModel getFilmID(@PathVariable("id")Long filmID)
	{
		return americanFootballRepository.findById(filmID).orElseThrow(()-> new ResourceNotFoundException("AmericanFootballSpringBootModel", "id", filmID));
	}
	
	//Method to get a vehicle by type
	@GetMapping("/film/title/{title}")
	public List<AmericanFootballSpringBootModel> getFilmTitle(@PathVariable(value ="title")String filmTitle)
	{	
		if(americanFootballRepository.findByTitle(filmTitle) == null)
		{
			throw new ResourceNotFoundException("AmericanFootballSpringBootModel", "title", filmTitle);
		}
		
		return americanFootballRepository.findByTitle(filmTitle);
		
	}
	//Method to get a film by category
	@GetMapping("/film/category/{category}")
	public List<AmericanFootballSpringBootModel> getFilmCategory(@PathVariable(value ="category")String filmCategory)
	{
		if(americanFootballRepository.findByCategory(filmCategory) == null)
		{
			throw new ResourceNotFoundException("AmericanFootballSpringBootModel", "category", filmCategory);
		}
		
		return americanFootballRepository.findByCategory(filmCategory);
	}
	
	//Method to get a film by rating
	@GetMapping("/film/rating/{rating}")
	public List<AmericanFootballSpringBootModel> getFilmRating(@PathVariable(value ="rating")String filmRating)
	{
		if(americanFootballRepository.findByRating(filmRating) == null)
		{
			throw new ResourceNotFoundException("AmericanFootballSpringBootModel", "category", filmRating);
		}
		
		return americanFootballRepository.findByRating(filmRating);
	}

	//Method to get all vehicle
	@GetMapping("/film")
	public List<AmericanFootballSpringBootModel> getAllFilm()
	{
		return americanFootballRepository.findAll();
	}
 
	//Method to update a vehicle
	@PutMapping("/film/{id}")
	public AmericanFootballSpringBootModel updateFilm(@PathVariable("id")Long filmID, @Valid @RequestBody AmericanFootballSpringBootModel filmDetails)
	{
		AmericanFootballSpringBootModel bSDM = americanFootballRepository.findById(filmID).orElseThrow(()-> new ResourceNotFoundException("AmericanFootballSpringBootModel", "id", filmID));
		 
		bSDM.setTitle(filmDetails.getTitle());
		bSDM.setDescription(filmDetails.getDescription());
		bSDM.setCategory(filmDetails.getCategory());
		bSDM.setPrice(filmDetails.getPrice());
		bSDM.setLength(filmDetails.getLength());
		bSDM.setRating(filmDetails.getRating());
		
		AmericanFootballSpringBootModel updateData = americanFootballRepository.save(bSDM);
		return updateData;
	}
	
	//Method to remove a vehicle
	@DeleteMapping("/film/{id}")
	public ResponseEntity<?> deleteVehicle(@PathVariable("id")Long vehicleID)
	{
		AmericanFootballSpringBootModel bSDM = americanFootballRepository.findById(vehicleID).orElseThrow(()-> new ResourceNotFoundException("AmericanFootballSpringBootModel", "id", vehicleID));
	
		americanFootballRepository.delete(bSDM);
		return ResponseEntity.ok().build();
	}
}

