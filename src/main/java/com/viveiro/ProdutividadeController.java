package com.viveiro;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtividade")
@CrossOrigin(origins = "*")
public class ProdutividadeController {

    @PostMapping("/calcular")
    public ResponseEntity<ProdutividadeResponse> calcular(@RequestBody ProdutividadeRequest request) {
        if (request.getAreaM2() <= 0) {
            return ResponseEntity.badRequest().build();
        }
        double resultado = request.getProducaoTotalKg() / request.getAreaM2();
        return ResponseEntity.ok(new ProdutividadeResponse(resultado));
    }

    // ✅ Agora pública
    public static class ProdutividadeRequest {
        private double producaoTotalKg;
        private double areaM2;

        public double getProducaoTotalKg() {
            return producaoTotalKg;
        }

        public void setProducaoTotalKg(double producaoTotalKg) {
            this.producaoTotalKg = producaoTotalKg;
        }

        public double getAreaM2() {
            return areaM2;
        }

        public void setAreaM2(double areaM2) {
            this.areaM2 = areaM2;
        }
    }

    // ✅ Agora pública
    public static class ProdutividadeResponse {
        private double produtividade;

        public ProdutividadeResponse(double produtividade) {
            this.produtividade = produtividade;
        }

        public double getProdutividade() {
            return produtividade;
        }

        public void setProdutividade(double produtividade) {
            this.produtividade = produtividade;
        }
    }
}
