package com.example.ktshoppinglistapp.ui

import com.example.ktshoppinglistapp.data.db.entities.ShoppingItem


interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}