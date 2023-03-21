package ru.gubernik.passwordgenerator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Контроллер для обработки главной страницы
 */
@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping
    public String mainPage() {
        return "index";
    }
}
