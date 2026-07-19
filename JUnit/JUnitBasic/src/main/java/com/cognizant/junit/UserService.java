package com.cognizant.junit;

public class UserService {

    private final NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void registerUser(String username) {
        System.out.println("User Registered: " + username);
        notificationService.sendNotification("Welcome " + username);
    }
}
