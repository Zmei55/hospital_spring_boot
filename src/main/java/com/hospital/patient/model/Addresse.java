package com.hospital.patient.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Addresse {
    @Schema(description = "name of the street where the patient lives")
    private String street;
    @Schema(description = "the number of the house where the patient lives")
    private String houseNumber;
    @Schema(description = "the name of the city where the patient lives")
    private String city;
    @Schema(description = "the postcode of the residence where the patient lives")
    private String postcode;
}
