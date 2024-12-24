package app;

import java.util.*;


public class UserRepository {

    List<User> users = Arrays.asList(
            new User(1,"Jonh","johndoe@mail.com"),
            new User(2,"Sarah","sarahdoe@mail.com"),
            new User(3,"Jamar","jamardoe@mail.com"),
            new User(4,"Kendy","kendydoe@mail.com")
    );


    public Optional<User> findUserById() {
        Scanner scanner = new Scanner(System.in);

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
        return Optional.ofNullable(users);
    }

    public void displayResult(Optional<User> result) {
        System.out.println("Result : " + result);
    }
}
