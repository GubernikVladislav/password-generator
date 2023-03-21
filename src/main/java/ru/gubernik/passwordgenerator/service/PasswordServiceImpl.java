package ru.gubernik.passwordgenerator.service;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gubernik.passwordgenerator.dao.PasswordDao;
import ru.gubernik.passwordgenerator.model.PasswordData;

import java.util.Date;

@Service
public class PasswordServiceImpl implements PasswordService {

    private final PasswordDao passwordDao;

    @Autowired
    public PasswordServiceImpl(PasswordDao passwordDao) {
        this.passwordDao = passwordDao;
    }

    @Override
    public String generatePassword(int length) {

        boolean correct = false;

        String password = "";

        while (!correct) {
            password = RandomStringUtils.randomAlphabetic(length);
            if (passwordDao.findByPassword(password) == null) {

                PasswordData passwordData = new PasswordData();
                passwordData.setPassword(password);
                passwordData.setCreateDate(new Date());

                passwordDao.save(passwordData);
                correct = true;
            }
        }

        return password;
    }
}
