package com.jeflette.simplefoodapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.jeflette.simplefoodapp.adapter.FoodAdapter
import com.jeflette.simplefoodapp.databinding.ActivityMainBinding
import com.jeflette.simplefoodapp.util.FoodList

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Call the object class function to provide food list
        val foodList = FoodList.provideFoodList()

        // Set the recycler view with the food list & set the layout manager to linear layout
        binding.rvFood.layoutManager = LinearLayoutManager(this)
        binding.rvFood.adapter = FoodAdapter(foodList)
        binding.rvFood.addItemDecoration(
            DividerItemDecoration(
                this,
                LinearLayoutManager.VERTICAL
            )
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}