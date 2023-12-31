package com.example.matholl.Services;

import com.example.matholl.Persistence.Entities.Ingredient;

import java.util.List;

public interface IngredientService {
    Ingredient save(Ingredient ingredient);
    public List<Ingredient> findIngredientsByRecipeId(long id);
}
