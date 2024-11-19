package com.sam.book.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationRequest {

    @NotEmpty(message = "Firstname is mandatory")
    @NotEmpty(message = "Firstname is mandatory")
    private String firstname;
    @NotEmpty(message = "Lirstname is mandatory")
    @NotEmpty(message = "Lirstname is mandatory")
    private String lastname;
    @Email(message = "email is not valid")
    private String email;
    @Size(min=8, message = "password is wrong")
    private String password;


}
