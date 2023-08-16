package com.example.calculadoracombustivel

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.calculadoracombustivel.Componentes.GradientButton
import com.example.calculadoracombustivel.ui.theme.AmareloClaro
import com.example.calculadoracombustivel.ui.theme.CalculadoraCombustivelTheme
import com.example.calculadoracombustivel.ui.theme.Laranja
import com.example.calculadoracombustivel.ui.theme.Marrom

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    @Composable
    fun PrimeiraTela() {
        Scaffold(
            topBar = {
                TopAppBar(
                    backgroundColor = Color.Black,
                    title = {
                        Text(
                            text = "Calculadora de Combustível",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                )
            }


        ) {
            Column(
                modifier = Modifier
                    .background(Color.Black)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,


                ) {

                Text(text = "texto1",color = Color.White)
                Text(text = "texto2",color = Color.White)

                GradientButton(onClick = {

                }, text = "Cadastrar", color1 = Laranja, color2 = AmareloClaro, color3 = Marrom)
            }

        }
    }

    @Preview
    @Composable
    fun PrimeiraTelaPreview() {
        PrimeiraTela()
    }
}

