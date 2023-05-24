package emt.lab.patientmanagement.xport.rest;

import emt.lab.patientmanagement.domain.models.Patient;
import emt.lab.patientmanagement.services.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
@AllArgsConstructor
public class PatientResource {
    private final PatientService patientService;

    @GetMapping
    public List<Patient> getAll() {
        return patientService.getAll();
    }
}
