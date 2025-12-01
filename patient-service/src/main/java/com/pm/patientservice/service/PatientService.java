package com.pm.patientservice.service;

import com.pm.patientservice.repository.PatientRepository;

public class PatientService {
    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
}
