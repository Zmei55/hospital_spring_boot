package com.hospital.patient.model;

import com.hospital.service.model.Service;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Patient {
    @Schema(description = "name of the patient")
    private String patientName;
    @Schema(description = "patient's date of birth")
    private String birthDate;
    @Schema(description = "patient medical card number")
    private String cardNumber;
    @Schema(description = "patient gender")
    private String gender;
    @Schema(description = "patient phone number")
    private String phoneNumber;
    @Schema(description = "patient identification document")
    private String identityDocument;
    @Schema(description = "services selected for the patient")
    private Service services;
    @Schema(description = "containers")
    private ArrayList containers;
    @Schema(description = "patient email")
    private String email;
    @Schema(description = "patient's residence address")
    private Addresse residenceAddress;
}
