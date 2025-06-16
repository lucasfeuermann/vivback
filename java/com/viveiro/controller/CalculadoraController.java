package com.viveiro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CalculadoraController {

    @GetMapping("/teste")
    public String testarConexao() {
        return "✅ API do Viveiro funcionando!";
    }

    @GetMapping("/densidade")
    public String calcularDensidade() {
        // Simulação de cálculo
        return "Resultado do cálculo de densidade.";
    }

    @GetMapping("/produtividade")
    public String calcularProdutividade() {
        return "Resultado do cálculo de produtividade.";
    }

    @GetMapping("/sobrevivencia")
    public String calcularSobrevivencia() {
        return "Resultado do cálculo de taxa de sobrevivência.";
    }

}
