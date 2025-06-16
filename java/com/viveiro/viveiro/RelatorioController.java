package com.viveiro.viveiro;

import java.util.Map;

import org.springframework.http.ResponseEntity;

@RestController
public class RelatorioController {

    @PostMapping("/relatorio")
    public ResponseEntity<Map<String, String>> gerarRelatorio(@RequestBody Map<String, Object> dados) {
        try {
            @SuppressWarnings("unused")
            double producao = Double.parseDouble(dados.get("producaoTotalKg").toString());
            double area = Double.parseDouble(dados.get("areaM2").toString());
            double larvas = Double.parseDouble(dados.get("larvas").toString());
            double quantidadeFinal = Double.parseDouble(dados.get("quantidadeFinal").toString());

            if (area <= 0 || larvas <= 0) {
                return ResponseEntity.badRequest().body(
                    Map.of("erro", "Área ou número de larvas inválido")
                );
            }

            double densidade = larvas / area;
            double sobrevivencia = (quantidadeFinal / larvas) * 100;

            return ResponseEntity.ok(
                Map.of(
                    "densidade", String.format("%.2f", densidade),
                    "sobrevivencia", String.format("%.2f", sobrevivencia) + "%"
                )
            );

        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body(
                Map.of("erro", "Erro ao processar os dados")
            );
        }
    }
}

