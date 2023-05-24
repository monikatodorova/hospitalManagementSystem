package emt.lab.patientmanagement.services.impl;

import emt.lab.patientmanagement.domain.exception.PatientNotFoundException;
import emt.lab.patientmanagement.domain.models.Patient;
import emt.lab.patientmanagement.domain.models.PatientId;
import emt.lab.patientmanagement.domain.repository.PatientRepository;
import emt.lab.patientmanagement.services.PatientService;
import emt.lab.patientmanagement.services.form.PatientForm;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    @Override
    public Patient findById(PatientId id) {
        return patientRepository.findById(id).orElseThrow(PatientNotFoundException::new);
    }

    @Override
    public Patient addPatient(PatientForm form) {
        Patient p =Patient.build(form.getPatientName(), form.getContactNumber(), form.getGender(), form.getDateOfBirth());
        patientRepository.save(p);
        return p;
    }

    @Override
    public List<Patient> getAll() {
        return patientRepository.findAll();
    }
}
