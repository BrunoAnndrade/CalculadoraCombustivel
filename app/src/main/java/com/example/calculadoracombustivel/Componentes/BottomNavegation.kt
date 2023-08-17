package com.example.calculadoracombustivel.Componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigationDefaults
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BottomNavigation(
    backgroundColor: Color = Color.Blue,





){
    Text(text = "isso", color = Color.White)


}


@Preview
@Composable
fun BottomNavegationPreview() {
    BottomNavigation(Color.Blue)
}