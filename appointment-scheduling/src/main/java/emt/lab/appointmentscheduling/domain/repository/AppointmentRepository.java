package emt.lab.appointmentscheduling.domain.repository;

import emt.lab.appointmentscheduling.domain.models.Appointment;
import emt.lab.appointmentscheduling.domain.models.AppointmentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, AppointmentId> {
}
