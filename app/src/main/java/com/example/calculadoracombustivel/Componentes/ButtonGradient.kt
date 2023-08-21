package com.example.calculadoracombustivel.Componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt

import com.example.calculadoracombustivel.ui.theme.ShapeButton

@Composable
fun GradientButton(
    onClick: () -> Unit,
    text: String,
    color1: Color,
    color2: Color,
    color3: Color,

) {
    Button(
        onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .background(
                Brush.horizontalGradient(
                    colors = listOf(
                        color1,
                        color2,
                        color3,
                    )
                ),
                shape = ShapeButton.large,
            ),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent,

        ),
        elevation = ButtonDefaults.elevation(
            defaultElevation = 0.dp,
            pressedElevation = 0.dp,
            hoveredElevation = 0.dp,
        )

    ) {
        Text(text = text, fontSize = 18.sp, color = Color.Black, fontWeight = FontWeight.Bold)

    }

}

@Preview
@Composable
fun GradientButtonPreview(){


}