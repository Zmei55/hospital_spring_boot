package com.hospital.service.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Service {
    @Schema(description = "service name")
    private String serviceName;
    @Schema(description = "service code")
    private String codeService;
    @Schema(description = "name of the laboratory providing this service")
    private String labor;
    @Schema(description = "is this service completed")
    private boolean completed;
    @Schema(description = "result of the service")
    private ArrayList result;
}
