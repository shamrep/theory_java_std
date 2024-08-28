package org.theory.junit5.service;

import org.theory.junit5.dto.User;

import java.util.*;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

public class UserService {
    private final List<User> users = new ArrayList<>();

    public List<User> getAllUsers() {
        return users;
    }

    public void add(User... users) {
        this.users.addAll(Arrays.asList(users));
    }

    public Optional<User> login(String username, String password) {
        return users.stream().filter(user -> user.getUsername().equals(username)).filter(user -> user.getPassword().equals(password)).findFirst();
    }

    public Map<Long, User> getAllConvertedById() {
        return users.stream().collect(toMap(User::getId, identity()));
    }
}
