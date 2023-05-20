package com.hospital.user.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Login {
    @Schema(description = "name of the account")
    private String logName;
    @Schema(description = "password of the account")
    private String password;
    @Schema(description = "workplace of the user")
    private String station;
}
