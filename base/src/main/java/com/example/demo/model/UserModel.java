package com.example.demo.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserModel {

    @NotBlank
    private int id;
    @NotBlank
    private String username;
    private String password;
    private boolean admin;
}