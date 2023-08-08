package com.example.cocktail_bar

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cocktail")
data class Cocktail(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int,
    @ColumnInfo(name = "image")
    val image: String,
    @ColumnInfo(name = "title")
    val title: String,
    @ColumnInfo(name = "description")
    val description: String,
    @ColumnInfo(name = "recipe")
    val recipe: String,
    @ColumnInfo(name = "ingredients")
    val ingredients: String
)
