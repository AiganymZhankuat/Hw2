package com.example.pizza_item

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.ArrayList

abstract class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var itemAdapter: ItemAdapter
    private lateinit var foodList: ArrayList<Item>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.setLayoutManager(LinearLayoutManager(this))
        foodList = ArrayList()

        foodList.add(Item(R.drawable.fourcheese, "Four cheese pizza"))
        foodList.add(Item(R.drawable.pepperoni, "Pepperoni pizza"))
        foodList.add(Item(R.drawable.margarita, "Margarita pizza"))
        foodList.add(Item(R.drawable.chicken, "Chicken pizza"))
        foodList.add(Item(R.drawable.italian, "Italiano pizza"))
        foodList.add(Item(R.drawable.vegeterian, "Vegetarian pizza"))
        foodList.add(Item(R.drawable.beefburger, "Beef burger"))
        foodList.add(Item(R.drawable.chickensburger, "Chicken burger"))
        foodList.add(Item(R.drawable.potato, "Potato fries"))
        foodList.add(Item(R.drawable.wedges, "Potato wedges"))
        foodList.add(Item(R.drawable.cola, "Coca-Cola"))
        foodList.add(Item(R.drawable.fanta, "Fanta"))
        foodList.add(Item(R.drawable.sprite, "Sprite"))

        itemAdapter = ItemAdapter(foodList)
        recyclerView.adapter = itemAdapter

    }



}