package com.jeflette.simplefoodapp.util

import com.jeflette.simplefoodapp.R
import com.jeflette.simplefoodapp.data.model.Food

object FoodList {
    fun provideFoodList(): List<Food> {
        return listOf(
            Food("Bread", R.drawable.bread),
            Food("Burger", R.drawable.burger),
            Food("Laksa", R.drawable.laksa),
            Food("Lasagna", R.drawable.lasagna),
            Food("Pizza", R.drawable.pizza),
            Food("Spaghetti", R.drawable.spaghetti),
            Food("Steak", R.drawable.steak),
            Food("Sushi", R.drawable.sushi),
            Food("Tomyam", R.drawable.tomyam),
            Food("Tteokbokki", R.drawable.tteokbokki),
        )
    }
}