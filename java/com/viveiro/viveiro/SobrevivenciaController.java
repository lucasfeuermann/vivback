package com.viveiro.viveiro;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;

@RestController
public class SobrevivenciaController {

    @PostMapping("/sobrevivencia")
    public ResponseEntity<Map<String, String>> calcularSobrevivencia(@RequestBody Map<String, Object> dados) {
        try {
            double quantidadeInicial = Double.parseDouble(dados.get("quantidadeInicial").toString());
            double quantidadeFinal = Double.parseDouble(dados.get("quantidadeFinal").toString());

            if (quantidadeInicial == 0) {
                Map<String, String> erro = new HashMap<>();
                erro.put("erro", "Quantidade inicial não pode ser zero");
                return ResponseEntity.badRequest().body(erro);
            }

            double taxaSobrevivencia = (quantidadeFinal / quantidadeInicial) * 100;

            Map<String, String> resposta = new HashMap<>();
            resposta.put("taxaSobrevivencia", String.format("%.2f", taxaSobrevivencia));

            return ResponseEntity.ok(resposta); // ✅ Aqui estava o erro

        } catch (NumberFormatException e) {
            Map<String, String> erro = new HashMap<>();
            erro.put("erro", "Erro ao processar os dados: valores inválidos");
            return ResponseEntity.badRequest().body(erro);
        }
    }
}






    
