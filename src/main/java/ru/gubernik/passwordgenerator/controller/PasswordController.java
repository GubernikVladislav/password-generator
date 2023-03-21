package ru.gubernik.passwordgenerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.gubernik.passwordgenerator.service.PasswordService;

@Controller
@RequestMapping("/password")
public class PasswordController {

    private final PasswordService passwordService;

    @Autowired
    public PasswordController(PasswordService passwordService) {
        this.passwordService = passwordService;
    }

    @GetMapping("/generate")
    public String generate(@RequestParam int length, Model model) {
        String generatedPassword = passwordService.generatePassword(length);
        model.addAttribute("password", "Ваш пароль: " + generatedPassword);
        return "generated";
    }
}
