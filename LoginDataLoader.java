package com.viveiro.viveiro;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LoginDataLoader implements CommandLineRunner {

    private final LoginRepository loginRepository;

    public LoginDataLoader(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public void run(String... args) {
        if (loginRepository.count() == 0) {
            Login login = new Login();
            login.setEmail("tales.filho@gmail.com");
            login.setSenha("512369810");
            loginRepository.save(login);
        }
    }
}

