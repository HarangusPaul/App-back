package com.example.app.controller.request;

import jakarta.persistence.Column;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountCredentialsRequest {
    @NotNull
    private String email;

    @NotNull
    private String username;

    @NotNull
    private String password;
}
