package com.viveiro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/viveiro")
public class ViveiroController {

    // Cálculo de densidade: quantidade / área
    @PostMapping("/densidade")
    public ResponseEntity<Double> calcularDensidade(@RequestParam double quantidade, @RequestParam double area) {
        if (area <= 0) return ResponseEntity.badRequest().body(0.0);
        double densidade = quantidade / area;
        return ResponseEntity.ok(densidade);
    }

    // Cálculo de produtividade: produção / área
    @PostMapping("/produtividade")
    public ResponseEntity<Double> calcularProdutividade(@RequestParam double producaoKg, @RequestParam double area) {
        if (area <= 0) return ResponseEntity.badRequest().body(0.0);
        double produtividade = producaoKg / area;
        return ResponseEntity.ok(produtividade);
    }

    // Taxa de sobrevivência: sobreviventes / total inicial × 100
    @PostMapping("/sobrevivencia")
    public ResponseEntity<Double> calcularSobrevivencia(@RequestParam int totalInicial, @RequestParam int sobreviventes) {
        if (totalInicial <= 0) return ResponseEntity.badRequest().body(0.0);
        double taxa = (double) sobreviventes / totalInicial * 100;
        return ResponseEntity.ok(taxa);
    }

    // Gerar gráfico de pizza (exemplo simples)
    @GetMapping("/grafico")
    public ResponseEntity<String> gerarGrafico() {
        // Você pode retornar dados que o frontend transforma em gráfico
        String dados = """
                {
                    "labels": ["Espécie A", "Espécie B", "Espécie C"],
                    "valores": [40, 35, 25]
                }
                """;
        return ResponseEntity.ok(dados);
    }

    // Gerar relatório (formato texto)
    @PostMapping("/relatorio")
    public ResponseEntity<String> gerarRelatorio(
            @RequestParam double quantidade,
            @RequestParam double area,
            @RequestParam double producaoKg,
            @RequestParam int totalInicial,
            @RequestParam int sobreviventes
    ) {
        double densidade = quantidade / area;
        double produtividade = producaoKg / area;
        double taxa = (double) sobreviventes / totalInicial * 100;

        String relatorio = String.format("""
                RELATÓRIO DE DESEMPENHO DO VIVEIRO

                Quantidade de animais: %.2f
                Área do viveiro (m²): %.2f
                Produção total (kg): %.2f
                Total inicial: %d
                Sobreviventes: %d

                Densidade: %.2f animais/m²
                Produtividade: %.2f kg/m²
                Taxa de sobrevivência: %.2f %%
                """, quantidade, area, producaoKg, totalInicial, sobreviventes, densidade, produtividade, taxa);

        return ResponseEntity.ok(relatorio);
    }
}