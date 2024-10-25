package org.example.controller;

import org.example.model.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserContoller {
    @Autowired
    private UserService userService;
    @GetMapping("/liste")
    public String getMembers(Model model) {
        List<User> members = userService.getAllUsers();
        model.addAttribute("members", members);
        return "home"; // This will resolve to /WEB-INF/views/members.jsp
    }
}
