package com.example.calculadoracombustivel

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigation
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculadoracombustivel.Componentes.GradientButton
import com.example.calculadoracombustivel.ui.theme.AmareloClaro
import com.example.calculadoracombustivel.ui.theme.CalculadoraCombustivelTheme
import com.example.calculadoracombustivel.ui.theme.Laranja
import com.example.calculadoracombustivel.ui.theme.Marrom
import com.example.calculadoracombustivel.ui.theme.RoxoClarinho
import com.example.calculadoracombustivel.ui.theme.RoxoClaro
import com.example.calculadoracombustivel.ui.theme.RoxoEscuro

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    @Composable
    fun Gastos() {

        var consumoVeiculo by remember { mutableStateOf("") }
        var combustivel by remember { mutableStateOf("") }
        var precoCombustivel by remember { mutableStateOf("") }
        val resultState = remember { mutableStateOf(0.0) }

        Scaffold(topBar = {
            TopAppBar(backgroundColor = RoxoEscuro,

                title = {
                    Text(
                        text = "Calculadora de Combustível",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                    )
                })
        }, bottomBar = {
            BottomAppBar(
                modifier = Modifier.fillMaxWidth(),
                backgroundColor = Color.Black,


                ) {
                BottomNavigation {

                }

            }
        }


        ) {



            Column(
                modifier = Modifier
                    .background(Color.Gray)
                    .fillMaxWidth()
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,


                ) {

                Spacer(modifier = Modifier.height(16.dp))

                TextField(
                    value = consumoVeiculo.take(5),
                    onValueChange = { consumoVeiculo = it },
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                    textStyle = TextStyle(color = Color.Red),
                    modifier = Modifier
                        .width(70.dp)
                        .height(50.dp)
                )
                TextField(
                    value = combustivel.take(5),
                    onValueChange = { combustivel = it },
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                    textStyle = TextStyle(color = Color.Red),
                    modifier = Modifier
                        .width(70.dp)
                        .height(50.dp)
                )
                TextField(
                    value = precoCombustivel.take(5),
                    onValueChange = { precoCombustivel = it },
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                    textStyle = TextStyle(color = Color.Red),
                    modifier = Modifier
                        .width(70.dp)
                        .height(50.dp)
                )

                Spacer(modifier = Modifier.height(16.dp))



                Text("Resultado: ${resultState.value}")

                Spacer(modifier = Modifier.height(16.dp))


                GradientButton(
                    onClick = {
                        val result = calcularConsumo(consumoVeiculo, combustivel)
                        resultState.value = result

                    }, text = "Calcular", color1 = Laranja, color2 = AmareloClaro, color3 = Marrom
                )
            }

        }
    }

    @Preview
    @Composable
    fun PrimeiraTelaPreview() {
        Gastos()
    }
}

private fun calcularConsumo(consumoVeiculo: String, combustivel: String): Double {
    val consumoDouble = consumoVeiculo.toDoubleOrNull() ?: 0.0
    val combustivelDouble = combustivel.toDoubleOrNull() ?: 0.0
    return consumoDouble * combustivelDouble
}


