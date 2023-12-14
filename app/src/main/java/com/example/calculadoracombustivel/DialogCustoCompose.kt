package com.example.calculadoracombustivel

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculadoracombustivel.ui.theme.AzulDark
import com.example.calculadoracombustivel.ui.theme.RoxoClaro
import com.example.calculadoracombustivel.ui.theme.RoxoEscuro
import com.example.calculadoracombustivel.ui.theme.ShapeButton

@Composable
fun DialogCustoCompose(
    litrosPorViagem: MutableState<Double>,
    custoPorViagem: MutableState<Double>,
    custoPorPessoa: MutableState<Double>,
    autonomia: MutableState<Double>,
    combustivelTotal: MutableState<Double>,
    onDismissRequest: () -> Unit

) {

    AlertDialog(
        onDismissRequest = onDismissRequest,
        modifier = Modifier.fillMaxWidth(),


        title = {
            Text(
                text = "Distância",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(AzulDark, ShapeButton.small)
                    .padding(5.dp)
            )
        },

        text = {
            Column(
                Modifier
                    .fillMaxWidth()
            ) {

                Spacer(modifier = Modifier.height(40.dp))

                Row {
                    Image(
                        painter = painterResource(id = R.drawable.veiculo),
                        contentDescription = "Simbolo veiculo",
                    )

                    Text(
                        text = "Autonomia:",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = RoxoEscuro,
                        textAlign = TextAlign.Start,
                        modifier = Modifier
                            .align(CenterVertically)

                    )

                    Text(
                        text = "%.2f".format(autonomia.value) + " km",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 18.sp,
                        color = RoxoClaro,
                        textAlign = TextAlign.Start,
                        modifier = Modifier
                            .align(CenterVertically)

                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                Row {

                    Image(
                        painter = painterResource(id = R.drawable.fuel_gas02_station),
                        contentDescription = "Simbolo gasolina",
                    )

                    Text(
                        text = "Litros por viagem:",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = RoxoEscuro,
                        textAlign = TextAlign.Start,
                        modifier = Modifier
                            .align(CenterVertically)

                    )

                    Text(
                        text = "%.2f".format(litrosPorViagem.value) + " litros",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 18.sp,
                        color = RoxoClaro,
                        textAlign = TextAlign.Start,
                        modifier = Modifier
                            .align(CenterVertically)


                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                Row {

                    Image(
                        painter = painterResource(id = R.drawable.coin_svgrepo_com_1),
                        contentDescription = "Simbolo veiculo",
                    )

                    Text(
                        text = "Combustível:",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = RoxoEscuro,
                        textAlign = TextAlign.Start,
                        modifier = Modifier
                            .align(CenterVertically)


                    )

                    Text(
                        text = "%.2f".format(combustivelTotal.value) + " litros",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 18.sp,
                        color = RoxoClaro,
                        textAlign = TextAlign.Start,
                        modifier = Modifier
                            .align(CenterVertically)


                    )
                }



                Spacer(modifier = Modifier.height(10.dp))

                Row {

                    Image(
                        painter = painterResource(id = R.drawable.coin_svgrepo_com_1),
                        contentDescription = "Simbolo moeda",
                    )

                    Text(
                        text = "Custo da viagem:",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = RoxoEscuro,
                        textAlign = TextAlign.Start,
                        modifier = Modifier
                            .align(CenterVertically)


                    )

                    Text(
                        text = "%.2f".format(custoPorViagem.value) + " reais",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 18.sp,
                        color = RoxoClaro,
                        textAlign = TextAlign.Start,
                        modifier = Modifier
                            .align(CenterVertically)


                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                Row {

                    Image(
                        painter = painterResource(id = R.drawable.coin_svgrepo_com_1),
                        contentDescription = "Simbolo moeda",

                        )

                    Text(
                        text = "Custo por pessoa:",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = RoxoEscuro,
                        textAlign = TextAlign.Start,
                        modifier = Modifier
                            .align(CenterVertically)


                    )

                    Text(
                        text = "%.2f".format(custoPorPessoa.value) + " reais",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 18.sp,
                        color = RoxoClaro,
                        textAlign = TextAlign.Start,
                        modifier = Modifier
                            .align(CenterVertically)


                    )
                }
            }
        },
        confirmButton = {
            Button(
                onClick = { onDismissRequest() },
                shape = ShapeButton.large,
                colors = ButtonDefaults.buttonColors(RoxoClaro),
            ) {
                Text(
                    text = "Fechar",
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold
                )
            }
        }
    )
}


@Preview
@Composable
fun PrimeiraTelaPreview() {

    val resultAutonomia = remember { mutableStateOf(123.45) }
    val resultCombustivel = remember { mutableStateOf(123.45) }
    val resultLitrosPorviagem = remember { mutableStateOf(123.45) }
    val resultCustoPorViagem = remember { mutableStateOf(123.45) }
    val resultCustoPorPessoa = remember { mutableStateOf(123.45) }

    DialogCustoCompose(
        litrosPorViagem = resultLitrosPorviagem,
        custoPorPessoa = resultCustoPorPessoa,
        custoPorViagem = resultCustoPorViagem,
        autonomia = resultAutonomia,
        combustivelTotal = resultCombustivel,
        onDismissRequest = { },
    )
}
