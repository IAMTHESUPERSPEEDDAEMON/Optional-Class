package app;


public class Main {
    public static void main(String[] args) {
        UserRepository repository = new UserRepository();

        System.out.println("=== Find user by ID ===");
        repository.displayResult(repository.findUserById().orElse(null));

        System.out.println("=== Find user by email ===");
        repository.displayResult(repository.findUserByEmail("sarahdoe@mail.com").orElse(null));

        System.out.println("=== List of all users ===");
        repository.findAllUsers().ifPresent(users -> users.forEach(System.out::println));
    }
}
