package com.example.calculadoracombustivel

import androidx.lifecycle.ViewModel

class CalculadoraViewModel : ViewModel() {


    companion object {
        fun create(): CalculadoraViewModel {
            return CalculadoraViewModel()
        }
    }


    fun calcularLitrosViagem(distancia: String, consumoVeiculo: String): Double {
        val distanciaDouble = distancia.toDouble()
        val consumoVeiculoDouble = consumoVeiculo.toDouble()
        return distanciaDouble / consumoVeiculoDouble

    }

    fun calcularAutonomia(consumoVeiculo: String, combustivel: String): Double {
        val consumoDouble = consumoVeiculo.toDouble()
        val combustivelDouble = combustivel.toDouble()
        return consumoDouble * combustivelDouble
    }

    fun calcularCombustivelTotal(combustivel: String, precoCombustivel: String): Double {
        val combustivelDouble = combustivel.toDouble()
        val precoCombustivelDouble = precoCombustivel.toDouble()
        return precoCombustivelDouble * combustivelDouble
    }
}