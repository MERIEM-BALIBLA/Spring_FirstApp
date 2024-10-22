package org.example;

import org.example.model.User;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        UserRepository userRepository = context.getBean(UserRepository.class);
        UserService userService = context.getBean(UserService.class);

//        Saving User
      /*  User member = new User();
        member.setUsername("Ito");
        member.setEmail("Ito");
        member.setPassword("Ito");
        userRepository.save(member);*/

//        Deleting User
        /*user.setId(2L);
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