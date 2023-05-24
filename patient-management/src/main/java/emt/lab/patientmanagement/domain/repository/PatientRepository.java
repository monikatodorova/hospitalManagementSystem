package emt.lab.patientmanagement.domain.repository;

import emt.lab.patientmanagement.domain.models.Patient;
import emt.lab.patientmanagement.domain.models.PatientId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, PatientId> {
}
