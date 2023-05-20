package com.hospital.user.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
    @Schema(description = "first and last name of the user")
    private UserName userName;
    @Schema(description = "name of the account")
    private String logName;
    @Schema(description = "workplace of the user")
    private String station;
    @Schema(description = "token")
    private String token;
}
