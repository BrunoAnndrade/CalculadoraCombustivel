package com.example.calculadoracombustivel

import android.view.View
import androidx.lifecycle.ViewModel
import com.google.android.material.snackbar.Snackbar

class CalculadoraViewModel : ViewModel() {


    companion object {
        fun create(): CalculadoraViewModel {
            return CalculadoraViewModel()
        }
    }


    fun calcularLitrosPorViagem(distancia: String, consumoVeiculo: String): Double {
        val distanciaDouble = distancia.toDouble()
        val consumoVeiculoDouble = consumoVeiculo.toDouble()
        return distanciaDouble / consumoVeiculoDouble
    }

    fun calcularcustoPorViagem(combustivelTotal: Double, valorCombustivelPorLitro: String): Double {
        val combustivelTotalDouble = combustivelTotal
        val valorCombustivelPorLitroDouble = valorCombustivelPorLitro.toDouble()
        return combustivelTotalDouble * valorCombustivelPorLitroDouble
    }

    fun calcularCustoPorPessoa(combustivelTotal: String, quantidadePessoas: String): Double {
        val CombustivelTotalDouble = combustivelTotal.toDouble()
        val quantidadePessoasDouble = quantidadePessoas.toDouble()
        return CombustivelTotalDouble / quantidadePessoasDouble
    }

    fun calcularAutonomia(consumoVeiculo: String, combustivelTotal: String): Double {
        val consumoDouble = consumoVeiculo.toDouble()
        val combustivelTotalDouble = combustivelTotal.toDouble()
        return consumoDouble * combustivelTotalDouble
    }

    fun calcularCombustivelTotal(combustivelTotal: String, precoCombustivel: String): Double {
        val combustivelTotalDouble = combustivelTotal.toDouble()
        val precoCombustivelDouble = precoCombustivel.toDouble()
        return precoCombustivelDouble * combustivelTotalDouble
    }

    fun showmessege(view: View, mensagem:String) {
        Snackbar.make(view, mensagem, Snackbar.LENGTH_LONG)
            .setAction("Action", null)
            .show()
    }
}