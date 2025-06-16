package com.viveiro;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtividade")
@CrossOrigin(origins = "*") // Permite acesso do front-end
public class ProdutividadeController {

    @PostMapping("/calcular")
    public ResponseEntity<ProdutividadeResponse> calcular(@RequestBody ProdutividadeRequest request) {
        if (request.getAreaM2() <= 0) {
            return ResponseEntity.badRequest()
                .body(new ProdutividadeResponse("Área deve ser maior que zero."));
        }

        double resultado = request.getProducaoTotalKg() / request.getAreaM2();
        return ResponseEntity.ok(new ProdutividadeResponse(resultado));
    }

    // ✅ Classe interna para requisição
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

    // ✅ Classe interna para resposta
    public static class ProdutividadeResponse {
        private double produtividade;
        private String mensagem;

        public ProdutividadeResponse(double produtividade) {
            this.produtividade = produtividade;
            this.mensagem = "Cálculo realizado com sucesso!";
        }

        public ProdutividadeResponse(String mensagemErro) {
            this.mensagem = mensagemErro;
        }

        public double getProdutividade() {
            return produtividade;
        }

        public void setProdutividade(double produtividade) {
            this.produtividade = produtividade;
        }

        public String getMensagem() {
            return mensagem;
        }

        public void setMensagem(String mensagem) {
            this.mensagem = mensagem;
        }
    }
}
