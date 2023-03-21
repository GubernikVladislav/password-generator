package ru.gubernik.passwordgenerator.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "PASSWORD_DATA")
public class PasswordData {

    /**
     * Идентификатор
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Данные пароля
     */
    @Column(name = "PASSWORD_STRING")
    private String password;

    /**
     * Дата создания пароля
     */
    @Column(name = "CREATE_DATE")
    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "PasswordData{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
