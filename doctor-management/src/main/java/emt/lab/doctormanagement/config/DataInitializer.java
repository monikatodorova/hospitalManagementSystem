package emt.lab.doctormanagement.config;

import emt.lab.doctormanagement.domain.models.Doctor;
import emt.lab.doctormanagement.domain.models.Specialization;
import emt.lab.doctormanagement.domain.repository.DoctorRepository;
import emt.lab.doctormanagement.domain.valueobjects.ContactNumber;
import emt.lab.sharedkernel.domain.identity.Name;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Date;

@Component
@AllArgsConstructor
public class DataInitializer {
    private final DoctorRepository doctorRepository;

    @PostConstruct
    public void initData() {
        Doctor p1 = Doctor.build(new Name("Tamara", "Trajcova"), new ContactNumber("071123456"), Specialization.Cardiology, "doctor1@email.com");
        Doctor p2 = Doctor.build(new Name("Ivan", "Stojcev"), new ContactNumber("071789456"), Specialization.Dermatology, "doctor2@email.com");
        if(doctorRepository.findAll().isEmpty()) {
            doctorRepository.saveAll(Arrays.asList(p1, p2));
        }
    }
}
