package com.viveiro.viveiro;

import java.util.Optional;

@Component
public class ViveiroDataLoader implements CommandLineRunner {

    private final ViveiroRepository viveiroRepository;
    private final UsuarioRepository usuarioRepository;
    private final CicloRepository cicloRepository;

    public ViveiroDataLoader(ViveiroRepository viveiroRepository, UsuarioRepository usuarioRepository, CicloRepository cicloRepository) {
        this.viveiroRepository = viveiroRepository;
        this.usuarioRepository = usuarioRepository;
        this.cicloRepository = cicloRepository;
    }

    @SuppressWarnings("unchecked")
    public void run(String... args) {
        Ciclo usuario = ((Optional<Ciclo>) usuarioRepository.findById(1L)).orElse(null);
        Ciclo ciclo = ((Optional<Ciclo>) cicloRepository.findById(1)).orElse(null); // Corrija para o ID correto

        if (usuario != null && ciclo != null) {
            Viveiro viveiro = new Viveiro();
            viveiro.setArea(150.5);
            viveiro.setCiclo(ciclo);
            viveiro.setUsuario(usuario);

            viveiroRepository.save(viveiro);
        }
    }
}

