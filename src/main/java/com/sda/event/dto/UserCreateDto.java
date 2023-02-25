package com.sda.event.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;


public class UserCreateDto {

    @NotBlank
    @Length(max = 50)
    private String firstName;
    @Length(max = 50)
    private String lastName;

    @Email(message = "Invalid email address")
    private String email;
    @Length(min = 8, max = 30)
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {


        this.password = password;
    }

//    BCryptPasswordEncoder passwordEncoder= new BCryptPasswordEncoder();
//        this.password = passwordEncoder.encode(password);


}
