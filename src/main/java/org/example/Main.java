package org.example;

import org.example.model.User;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        UserRepository userRepository = context.getBean(UserRepository.class);
        UserService userService = context.getBean(UserService.class);

//        Saving User
        User user1 = new User();
        user1.setNumeroAdhesion(1001);
        user1.setNom("Dupont");
        user1.setPrenom("Jean");
        user1.setPieceIdentification("ID123456");
        user1.setNationalite("French");
        user1.setDateAdhesion(LocalDate.now());
        user1.setDateExpirationLicence(LocalDate.now().plusYears(1));

        // Create second user
        User user2 = new User();
        user2.setNumeroAdhesion(1002);
        user2.setNom("Martin");
        user2.setPrenom("Marie");
        user2.setPieceIdentification("ID789012");
        user2.setNationalite("French");
        user2.setDateAdhesion(LocalDate.now());
        user2.setDateExpirationLicence(LocalDate.now().plusYears(1));

        // Create third user
        User user3 = new User();
        user3.setNumeroAdhesion(1003);
        user3.setNom("Smith");
        user3.setPrenom("John");
        user3.setPieceIdentification("ID345678");
        user3.setNationalite("British");
        user3.setDateAdhesion(LocalDate.now().minusMonths(2));
        user3.setDateExpirationLicence(LocalDate.now().plusMonths(10));

        // Save users
        userService.saveUser(user1);
        userService.saveUser(user2);
        userService.saveUser(user3);

//        userRepository.save(member);

//        Deleting User
/*        User user = new User();
        user.setId(2L);
        userService.deleteUser(user.getId());*/

//        Updating User
        /*User user = new User();
        user.setId(9L); // Set the ID of the user you want to update
        user.setUsername("UpdatedUsername");
        user.setEmail("updated@example.com");
        user.setPassword("newPassword");
        userService.updateUser(user);
        System.out.println(user);*/


        System.out.println("Number of members: " + userRepository.count());

        System.out.println("Number of members: " + userRepository.count());
        Runtime.Version version = Runtime.version();
        System.out.println("version :" + version);
    }
}