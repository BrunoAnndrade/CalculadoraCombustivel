package com.example.calculadoracombustivel

import androidx.compose.foundation.layout.Column
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


@Composable
fun DialogCustoCompose(result: Double, onClose: () -> Unit) {
    AlertDialog(
        onDismissRequest = {
            onClose()
        },
        title = {
            Text(
                text = "Resultado do Cálculo",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.Black
            )
        },
        text = {
            Column {
                Text(
                    text = "O resultado do cálculo é:",
                    fontSize = 16.sp,
                    color = Color.Black
                )
                Text(
                    text = "%.2f".format(result),
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color.Black
                )
            }
        },
        confirmButton = {
            Button(
                onClick = {
                    onClose()
                }
            ) {
                Text(text = "Fechar")
            }
        }
    )
}


