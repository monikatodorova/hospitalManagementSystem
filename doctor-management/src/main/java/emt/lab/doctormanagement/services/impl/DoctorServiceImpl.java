package emt.lab.doctormanagement.services.impl;

import emt.lab.doctormanagement.domain.exception.DoctorNotFoundException;
import emt.lab.doctormanagement.domain.models.Doctor;
import emt.lab.doctormanagement.domain.models.DoctorId;
import emt.lab.doctormanagement.domain.repository.DoctorRepository;
import emt.lab.doctormanagement.services.DoctorService;
import emt.lab.doctormanagement.services.form.DoctorForm;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository doctorRepository;

    @Override
    public Doctor findById(DoctorId id) {
        return doctorRepository.findById(id).orElseThrow(DoctorNotFoundException::new);
    }

    @Override
    public Doctor addDoctor(DoctorForm form) {
        Doctor d = Doctor.build(form.getDoctorName(), form.getContactNumber(), form.getSpecialization(), form.getEmail());
        doctorRepository.save(d);
        return d;
    }

    @Override
    public List<Doctor> getAll() {
        return doctorRepository.findAll();
    }
}
