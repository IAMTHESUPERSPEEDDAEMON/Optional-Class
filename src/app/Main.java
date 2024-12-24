package app;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        UserRepository repository = new UserRepository();

        System.out.println("=== Find user by ID ===");
        repository.displayResult(repository.findUserById());

        System.out.println("=== Find user by email ===");
        repository.displayResult(repository.findUserByEmail("sarahdoe@mail.com"));

        System.out.println("=== List of all users ===");
        repository.findAllUsers().ifPresent(users -> {
            users.forEach(System.out::println);
        });
    }
}
