package com.example.cocktail_bar

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel(private val cocktailDao: CocktailDao) : ViewModel() {

    val id = 1

/*    fun onAddCocktail() {
        viewModelScope.launch {
            cocktailDao.insert(
                Cocktail(
                    id = id,
                    title =
                )
            )
        }
    }*/
}