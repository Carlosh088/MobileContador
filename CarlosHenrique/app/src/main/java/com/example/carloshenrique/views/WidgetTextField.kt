package com.example.carloshenrique.views

import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.LiveData
import com.example.carloshenrique.MainGuiViewsModels

@Composable
fun WidgetTextField(viewModel: MainGuiViewsModels){
    val contador: Int by viewModel.contador.observeAsState(0);

    TextField(value = contador.toString(), onValueChange = {})

}