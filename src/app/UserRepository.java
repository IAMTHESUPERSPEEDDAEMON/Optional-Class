package app;

import java.util.*;


public class UserRepository {

    Scanner scanner = new Scanner(System.in);
    private final List<User> users = Arrays.asList(
            new User(1,"Jonh","johndoe@mail.com"),
            new User(2,"Sarah","sarahdoe@mail.com"),
            new User(3,"Jamar","jamardoe@mail.com"),
            new User(4,"Kendy","kendydoe@mail.com")
    );


    public Optional<User> findUserById() {
        System.out.println("Type user ID: ");
        int typedId = scanner.nextInt();

        return users.stream()
                .filter(user -> user.getId() == typedId)
                .findFirst();
    }

    public Optional<User> findUserByEmail(String email) {
        return users.stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst();
    }

    public Optional<List<User>> findAllUsers() {
        return Optional.of(users);
    }

    public void displayResult(User result) {
        if (result != null) {
            System.out.println("Result: " + result);
        } else {
            System.out.println("User not found");
        }
    }
}
