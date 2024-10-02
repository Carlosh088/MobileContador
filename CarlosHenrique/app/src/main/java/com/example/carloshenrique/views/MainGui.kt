package com.example.carloshenrique.views

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.carloshenrique.MainGuiViewsModels
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData


@Composable
fun MainGui(viewModel: MainGuiViewsModels){

    Column{
        Text(text="=====")
        Text(text="=====")
        Text(text="=====")
        Text(text="=====")
        WidgetTextField(viewModel)
        WidgetButton(viewModel)

    }

}
