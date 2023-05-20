package com.hospital.user.controller;

import com.hospital.shared.controller.Error;
import com.hospital.user.model.Login;
import com.hospital.user.model.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/auth")
@Tag(name = "auth", description = "Authorization of the user")
public class LoginController {
    @Operation(summary = "Login", description = "User authorization", tags = {"auth"})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "201",
                    description = "201 Created",
                    content = @Content(
                            schema = @Schema(implementation = User.class)
                    )
            ),
            @ApiResponse(
                    responseCode = "401",
                    description = "401 Unauthorized",
                    content = @Content(
                            schema = @Schema(implementation = Error.class)
                    )),
            @ApiResponse(
                    responseCode = "404",
                    description = "404 Not found",
                    content = @Content(
                            schema = @Schema(implementation = Error.class)
                    )
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "500 Internal Server Error",
                    content = @Content(
                            schema = @Schema(implementation = Error.class)
                    ))
    })
    @PostMapping(value = "/login")
    public Login login(
            @Parameter(description = "User authorization", required = true,
            schema = @Schema(implementation = Login.class))
            @Valid @RequestBody Login login
    ) {
        return login;
    }
}
