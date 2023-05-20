package com.hospital.user.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Registration {
    private User user;
    @Schema(description = "password of the account")
    private String password;
}
