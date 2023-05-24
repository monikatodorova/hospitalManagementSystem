package emt.lab.doctormanagement.services;

import emt.lab.doctormanagement.domain.models.Doctor;
import emt.lab.doctormanagement.domain.models.DoctorId;
import emt.lab.doctormanagement.services.form.DoctorForm;

import java.util.List;

public interface DoctorService {
    Doctor findById(DoctorId id);
    Doctor addDoctor(DoctorForm form);
    List<Doctor> getAll();
}
