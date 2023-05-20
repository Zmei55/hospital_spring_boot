package com.hospital.user.controller;

import com.hospital.shared.controller.Error;
import com.hospital.user.model.Registration;
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
public class RegistrationController {
    @Operation(summary = "Registration", description = "New user registration", tags = {"auth"})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "201",
                    description = "201 Created",
                    content = @Content(
                            schema = @Schema(implementation = User.class)
                    )
            ),
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
    @PostMapping(value = "/register", produces = {"application/json"})
    public Registration registration(
            @Parameter(description = "User to add", required = true,
            schema = @Schema(implementation = Registration.class))
            @Valid @RequestBody Registration registration
    ) {
        return registration;
    }
}
