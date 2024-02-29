package com.example.app.controller.request;

import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountCredentialsRequestValidation {
    @NotNull
    private String email;

    @NotNull
    private String password;
}
