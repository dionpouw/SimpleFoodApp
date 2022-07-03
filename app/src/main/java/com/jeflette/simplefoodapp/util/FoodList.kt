package com.jeflette.simplefoodapp.util

import com.jeflette.simplefoodapp.data.model.Food

object FoodList {
    fun provideFoodList(): List<Food> {
        return listOf(
            Food("Bread", "bread.webp"),
            Food("Burger", "burger.webp"),
            Food("Laksa", "laksa.webp"),
            Food("Lasagna", "lasagna.webp"),
            Food("Pizza", "pizza.webp"),
            Food("Spaghetti", "spaghetti.webp"),
            Food("Steak", "steak.webp"),
            Food("Sushi", "sushi.webp"),
            Food("Tomyam", "tomyam.webp"),
            Food("Tteokbokki", "tteokbokki.webp"),
        )
    }
}