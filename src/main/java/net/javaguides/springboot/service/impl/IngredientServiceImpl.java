package net.javaguides.springboot.service.impl;

import net.javaguides.springboot.model.Ingredient;
import net.javaguides.springboot.repository.IngredientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImpl {

    IngredientDAO ingredientDAO;

    @Autowired
    public void setIngredientDAO(IngredientDAO ingredientDAO) {
        this.ingredientDAO = ingredientDAO;
    }

    public List<Ingredient> findAllByName(String name){
        return ingredientDAO.findAllByName(name);
    }

}
