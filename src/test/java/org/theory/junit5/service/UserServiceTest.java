package org.theory.junit5.service;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.theory.junit5.dto.User;

import java.util.Map;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    private static final User MIKE = User.of(2L, "Mike", "1111");
    private static final User POL = User.of(3L, "Pol", "0000");
    private static final User JOHN = User.of(1L, "John", "1234");
    private UserService userService;

    @BeforeEach
    void prepare() {
        System.out.println("Before each " + this);
        userService = new UserService();
    }

    @Test
    void get_usersNotExists_empty() {
        System.out.println("Test 1 " + this);
//        var userService = new UserService();
        var users = userService.getAllUsers();

        assertTrue(users.isEmpty());
    }

    @Test
    void userSizeIfUserAdded() {
        System.out.println("Test 2 " + this);
//        var userService = new UserService();
        userService.add(JOHN);
        userService.add(MIKE);
        userService.add(POL);

        var users = userService.getAllUsers();

        assertEquals(3, users.size());

        assertThat(users).hasSize(3);
    }

    @Test
    void loginSuccessIfUserExists() {
        userService.add(MIKE);
        Optional<User> maybeUser
                = userService.login(MIKE.getUsername(), MIKE.getPassword());

        assertTrue(maybeUser.isPresent());
        assertThat(maybeUser).isPresent();

        maybeUser.ifPresent(user -> assertEquals(MIKE, user));
        maybeUser.ifPresent(user -> assertThat(user).isEqualTo(MIKE));

    }

    @Test
    void usersConvertedToMapById() {
        userService.add(MIKE, POL);

        Map<Long, User> users = userService.getAllConvertedById();

        assertAll(
                () -> assertThat(users).containsKeys(MIKE.getId(), POL.getId()),
                () -> assertThat(users).containsValues(MIKE, POL)
        );

    }

    @Test
    void loginFailIfPasswordIsNotCorrect() {
        userService.add(MIKE);
        var maybeUser = userService.login(MIKE.getUsername(), "1212");

        assertTrue(maybeUser.isEmpty());
    }

    @Test
    void loginFailIfUserDoesNotExist() {
        userService.add(MIKE);
        var maybeUser = userService.login("dummy", MIKE.getPassword());

        assertTrue(maybeUser.isEmpty());
    }


    @AfterEach
    void deleteDataFromDatabase() {
        System.out.println("After each " + this);
    }

}
