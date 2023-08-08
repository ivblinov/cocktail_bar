package com.example.cocktail_bar

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface CocktailDao {

    @Query("SELECT * FROM cocktail")
    fun getAll(): Flow<List<Cocktail>>

    @Insert
    suspend fun insert(cocktail: Cocktail)

    @Delete
    suspend fun delete(cocktail: Cocktail)
}