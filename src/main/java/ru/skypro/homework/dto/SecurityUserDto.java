package ru.skypro.homework.dto;

import lombok.Data;
import ru.skypro.homework.constant.Role;


@Data
public class SecurityUserDto {

    private Integer id;

    private String email;

    private String password;

    private Role role;
}

