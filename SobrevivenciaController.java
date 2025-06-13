package com.viveiro.viveiro;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SobrevivenciaController {

    @PostMapping("/sobrevivencia")
    public ResponseEntity<String> calcularSobrevivencia(@RequestBody Map<String, Object> dados) {
        try {
            double quantidadeFinal = Double.parseDouble(dados.get("quantidadeFinal").toString());
            double quantidadeInicial = Double.parseDouble(dados.get("quantidadeInicial").toString());

            if (quantidadeInicial == 0) {
                return ResponseEntity.badRequest().body("0");
            }

            double taxa = (quantidadeFinal / quantidadeInicial) * 100;
            String resultado = String.format("%.2f", taxa);
            return ResponseEntity.ok(resultado);

        } catch (NumberFormatException e) {
            return ResponseEntity.status(400).body("erro");
        }
    }
}



    
