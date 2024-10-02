package com.example.carloshenrique.views

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.LiveData
import com.example.carloshenrique.MainGuiViewsModels


@Composable
fun WidgetButton(viewModel: MainGuiViewsModels){

    val contador: Int by viewModel.contador.observeAsState(0);

    Button(onClick = {
        viewModel.incrementaContador()
    }) {
        Text(text = "Quantidade de clicks " + contador)
    }
}