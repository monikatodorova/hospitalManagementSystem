package emt.lab.patientmanagement.services;

import emt.lab.patientmanagement.domain.models.Patient;
import emt.lab.patientmanagement.domain.models.PatientId;
import emt.lab.patientmanagement.services.form.PatientForm;

import java.util.List;

public interface PatientService {
    Patient findById(PatientId id);
    Patient addPatient(PatientForm form);
    List<Patient> getAll();
}
