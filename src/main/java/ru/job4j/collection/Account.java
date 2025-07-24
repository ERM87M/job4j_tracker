package ru.job4j.collection;

import java.util.Objects;

public class Account {
    private String passport;
    private String userName;
    private String deposit;

    public Account(String passport, String userName, String deposit) {
        this.passport = passport;
        this.userName = userName;
        this.deposit = deposit;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Account account = (Account) object;
        return Objects.equals(passport, account.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(passport);
    }

    @Override
    public String toString() {
        return "Account{" +
                "passport='" + passport + '\'' +
                ", userName='" + userName + '\'' +
                ", deposit='" + deposit + '\'' +
                '}';
    }
}
