package emt.lab.patientmanagement.config;

import emt.lab.patientmanagement.domain.models.Gender;
import emt.lab.patientmanagement.domain.models.Patient;
import emt.lab.patientmanagement.domain.repository.PatientRepository;
import emt.lab.patientmanagement.domain.valueobjects.ContactNumber;
import emt.lab.sharedkernel.domain.identity.Name;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Date;

@Component
@AllArgsConstructor
public class DataInitializer {
    private final PatientRepository patientRepository;

    @PostConstruct
    public void initData() {
        Patient p1 = Patient.build(new Name("Monika", "Todorova"), new ContactNumber("071123456"), Gender.FEMALE, new Date());
        Patient p2 = Patient.build(new Name("Filip", "Todorov"), new ContactNumber("071789456"), Gender.MALE, new Date());
        if(patientRepository.findAll().isEmpty()) {
            patientRepository.saveAll(Arrays.asList(p1, p2));
        }
    }
}
