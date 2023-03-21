package ru.gubernik.passwordgenerator.service;

/**
 * Интерфейс для работы с паролями
 */
public interface PasswordService {

    /**
     * Сгенерировать случайный пароль
     *
     * @param length длина пароля
     * @return строка, содержащая случайную последовательность символов заданной длины
     */
    String generatePassword(int length);
}
