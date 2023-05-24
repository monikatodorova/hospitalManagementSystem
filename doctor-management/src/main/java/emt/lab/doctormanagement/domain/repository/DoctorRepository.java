package emt.lab.doctormanagement.domain.repository;

import emt.lab.doctormanagement.domain.models.Doctor;
import emt.lab.doctormanagement.domain.models.DoctorId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, DoctorId> {
}
