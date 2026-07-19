package com.cognizant.junit;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    void testNotificationSent() {

        NotificationService mockService = mock(NotificationService.class);

        UserService userService = new UserService(mockService);

        userService.registerUser("Samruddhi");

        verify(mockService).sendNotification("Welcome Samruddhi");
    }
}
