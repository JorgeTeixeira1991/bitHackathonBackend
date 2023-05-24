package net.javaguides.springboot.service;

import net.javaguides.springboot.model.Ingredient;

import java.util.List;

public interface IngredientService {

    List<Ingredient> findAllByName(String name);

}
