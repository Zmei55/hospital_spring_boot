package com.hospital.user.controller;

import com.hospital.shared.controller.Error;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/auth")
@Tag(name = "auth", description = "Authorization of the user")
public class LogoutController {
    @Operation(summary = "Logout", description = "Logout", tags = {"auth"})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "204",
                    description = "204 No Content"),
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
                    )),
            @ApiResponse(
                    responseCode = "500",
                    description = "500 Internal Server Error",
                    content = @Content(
                            schema = @Schema(implementation = Error.class)
                    ))
    })
    @GetMapping(value = "/logout")
    public void logout() {}
}
