package com.example.calculadoracombustivel

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigation
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculadoracombustivel.ui.theme.AzulDark
import com.example.calculadoracombustivel.ui.theme.RoxoClaro
import com.example.calculadoracombustivel.ui.theme.RoxoEscuro
import com.example.calculadoracombustivel.ui.theme.ShapeButton

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
            TopAppBar(backgroundColor = AzulDark,

                title = {
                    Text(
                        text = "Calculadora de Combustível",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
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
                    .background(Color.White)
                    .fillMaxWidth()
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {

                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    modifier = Modifier
                        .background(Color.White)
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Start

                ) {

                    Image(
                        painter = painterResource(id = R.drawable.fuel_gas02_station),
                        contentDescription = "Simbolo gasolina",
                        modifier = Modifier
                            .padding(end = 10.dp)
                    )

                    Text(
                        text = "Consumo (km/L):",
                        modifier = Modifier
                            .padding(end = 50.dp)
                        ,
                        color = RoxoEscuro,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    )

                    TextField(
                        value = consumoVeiculo.take(5),
                        onValueChange = { consumoVeiculo = it },
                        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                        colors = TextFieldDefaults.textFieldColors(
                            textColor = Color.Red,
                            backgroundColor = Color.White
                        ),
                        modifier = Modifier
                            .width(70.dp)
                            .height(50.dp)
                    )
                }

                Row(
                    modifier = Modifier
                        .background(Color.White)
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Start

                ) {

                    Image(
                        painter = painterResource(id = R.drawable.fuel_gas02_station),
                        contentDescription = "Simbolo gasolina",
                        modifier = Modifier
                            .padding(end = 10.dp)

                    )

                    Text(
                        text = "Combustível (Litros):",
                        modifier = Modifier
                            .padding(end = 9.5.dp),
                        color = RoxoEscuro,
                        textAlign = TextAlign.End,
                        style = TextStyle(
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    )

                    TextField(
                        value = combustivel.take(5),
                        onValueChange = { combustivel = it },
                        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                        colors = TextFieldDefaults.textFieldColors(
                            textColor = Color.Red,
                            backgroundColor = Color.White
                        ),
                        modifier = Modifier
                            .width(70.dp)
                            .height(50.dp)

                    )
                }

                Row(
                    modifier = Modifier
                        .background(Color.White)
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Start

                ) {

                    Image(
                        painter = painterResource(id = R.drawable.coin_svgrepo_com) ,
                        contentDescription = "simbolo moeda",
                        modifier = Modifier
                            .padding(end = 10.dp)
                    )


                    Text(
                        text = "Preço por litro R$:",
                        modifier = Modifier
                            .padding(end = 40.dp),
                        color = RoxoEscuro,
                        textAlign = TextAlign.End,
                        style = TextStyle(
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    )

                    TextField(
                        value = precoCombustivel.take(5),
                        onValueChange = { precoCombustivel = it },
                        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                        colors = TextFieldDefaults.textFieldColors(
                            textColor = Color.Red,
                            backgroundColor = Color.White
                        ),
                        modifier = Modifier
                            .width(70.dp)
                            .height(50.dp)
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    "Resultado: ${resultState.value}",
                    textAlign = TextAlign.Center,
                )

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = {
                    val result = calcularConsumo(consumoVeiculo, combustivel)
                    resultState.value = result },
                    shape = ShapeButton.large,
                    colors = ButtonDefaults.buttonColors(RoxoClaro)

                ) {
                    Text(
                        text = "CALCULAR",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        color = Color.White,
                        modifier = Modifier
                            .padding(10.dp)
                    )

                }
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


