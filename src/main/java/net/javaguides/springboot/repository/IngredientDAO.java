package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IngredientDAO extends JpaRepository<Ingredient, Long> {
    List<Ingredient> findAllByName(String name);

}
