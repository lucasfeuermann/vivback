package com.viveiro.viveiro;

import java.sql.Timestamp;
import java.util.Optional;

@Component
public class UsuarioDataLoader implements CommandLineRunner {

    private final UsuarioRepository usuarioRepository;
    private final EnderecoRepository enderecoRepository;
    private final LoginRepository loginRepository;
    private final ContatoRepository contatoRepository;

    public UsuarioDataLoader(UsuarioRepository usuarioRepository,
                             EnderecoRepository enderecoRepository,
                             LoginRepository loginRepository,
                             ContatoRepository contatoRepository) {
        this.usuarioRepository = usuarioRepository;
        this.enderecoRepository = enderecoRepository;
        this.loginRepository = loginRepository;
        this.contatoRepository = contatoRepository;
    }

    public void run(String... args) {
        if (usuarioRepository.count() == 0) {
            @SuppressWarnings("unchecked")
            Login endereco = ((Optional<Login>) enderecoRepository.findById(1)).orElse(null);
            Login login = loginRepository.findById(1).orElse(null);
            @SuppressWarnings("unchecked")
            Login contato = ((Optional<Login>) contatoRepository.findById(1L)).orElse(null);

            if (endereco != null && login != null && contato != null) {
                Usuario usuario = new Usuario();
                usuario.setNome("Tales Filho");
                usuario.setDataDeNascimento(Timestamp.valueOf("2000-01-01 00:00:00"));
                usuario.setEndereco(endereco);
                usuario.setLogin(login);
                usuario.setContato(contato);
                usuarioRepository.save(usuario);
            }
        }
    }
}

