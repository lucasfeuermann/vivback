package com.viveiro.viveiro;

@Component
public class LoginDataLoader implements CommandLineRunner {

    private final LoginRepository loginRepository;

    public LoginDataLoader(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public void run(String... args) {
        if (loginRepository.count() == 0) {
            Login login = new Login();
            login.setEmail("tales.filho@gmail.com");
            login.setSenha("512369810");
            loginRepository.save(login);
        }
    }
}

