package com.example.calculadoracombustivel

import androidx.lifecycle.ViewModel

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

    fun calcularCustoPorViagem(combustivelTotal: Double, valorCombustivelPorLitro: String): Double {
        val combustivelTotalDouble = combustivelTotal
        val valorCombustivelPorLitroDouble = valorCombustivelPorLitro.toDouble()
        return combustivelTotalDouble * valorCombustivelPorLitroDouble
    }

    fun calcularCustoPorPessoa(custoPorViagem: Double, quantidadePessoas: String): Double {
        val CustoPorViagemDouble = custoPorViagem
        val quantidadePessoasDouble = quantidadePessoas.toDouble()
        return CustoPorViagemDouble / quantidadePessoasDouble
    }

    fun calcularAutonomia(consumoVeiculo: String, combustivelTotal: String): Double {
        val consumoDouble = consumoVeiculo.toDouble()
        val combustivelTotalDouble = combustivelTotal.toDouble()
        return consumoDouble * combustivelTotalDouble
    }

    fun calcularPrecoCombustivelTotal(combustivelTotal: String, precoCombustivel: String): Double {
        val combustivelTotalDouble = combustivelTotal.toDouble()
        val precoCombustivelDouble = precoCombustivel.toDouble()
        return precoCombustivelDouble * combustivelTotalDouble
    }

}