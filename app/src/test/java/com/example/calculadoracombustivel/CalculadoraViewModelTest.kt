package com.example.calculadoracombustivel

import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class CalculadoraViewModelTest {

    private lateinit var calculadoraViewModel: CalculadoraViewModel

    //inicializando o viewmodel
    @Before
    fun setUp() {
        calculadoraViewModel = CalculadoraViewModel.create()
    }


    @Test
    fun testCalcularLitrosPorViagem() {

        // GIVEN
        val distancia = "100.0"
        val consumoVeiculo = "10.0"

        //WHEN
        val resultado = calculadoraViewModel.calcularLitrosPorViagem(distancia, consumoVeiculo)

        // THEN
        assertEquals(10.0, resultado)
    }

    @Test
    fun testeCalcularCustoPorviagem() {
        //GIVEN
        val combustivelTotal = 20.0
        val valorCombustivelPorLitro = "5.0"

        //WHEN
        val resultado = calculadoraViewModel.calcularCustoPorViagem(combustivelTotal,valorCombustivelPorLitro)

        //THEN
        assertEquals(100.0,resultado)
    }

    @Test
    fun testeCalcularCustoPorPessoa() {
        //GIVEN
        val custoPorViagem = 500.0
        val quantidadePessoas = "4.0"

        //WHEN
        val resultado = calculadoraViewModel.calcularCustoPorPessoa(custoPorViagem,quantidadePessoas)

        //THEN
        assertEquals(125.0,resultado)
    }

    @Test
    fun testeCalcularAutonomia() {
        //GIVEN
        val consumoVeiculo = "10.0"
        val combustivelTotal = "20.0"

        //WHEN
        val resultado = calculadoraViewModel.calcularAutonomia(consumoVeiculo,combustivelTotal)

        //THEN
        assertEquals(200.0,resultado)
    }

    @Test
    fun testeCalcularPrecoCombustivelTotal() {
        //GIVEN
        val combustivelTotal = "20"
        val precoCombustivel = "5"

        //WHEN
        val resultado = calculadoraViewModel.calcularPrecoCombustivelTotal(combustivelTotal,precoCombustivel)

        //THEN
        assertEquals(100.0,resultado)
    }

}