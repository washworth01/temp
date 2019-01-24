package com.ashworth.william.springboot.database.americanFootball.americanFootballSpringBootDatabaseApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashworth.william.springboot.database.americanFootball.americanFootballSpringBootDatabaseApp.model.AmericanFootballSpringBootModel;

@Repository
public interface AmericanFootballSpringBootRepository extends JpaRepository<AmericanFootballSpringBootModel, Long>
{
	List<AmericanFootballSpringBootModel> findByTitle(String filmTitle);
	List<AmericanFootballSpringBootModel> findByCategory(String filmCategory);
	List<AmericanFootballSpringBootModel> findByRating(String filmRating);
}
