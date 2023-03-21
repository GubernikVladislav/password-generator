package ru.gubernik.passwordgenerator.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gubernik.passwordgenerator.model.PasswordData;

@Repository
public interface PasswordDao extends JpaRepository<PasswordData, Integer> {

    PasswordData findByPassword(String password);
}
