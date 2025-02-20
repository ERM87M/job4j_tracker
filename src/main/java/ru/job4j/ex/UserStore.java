package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("Пользователь не найден: " + login);
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("Пользователь не валиден: " + user.getUsername());
        }
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("Имя пользователя слишком короткое: " + user.getUsername());
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("Anton", true),
                new User("Igor", false)
        };

        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (UserInvalidException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}