package emt.lab.appointmentscheduling.services.impl;

import emt.lab.appointmentscheduling.domain.exception.AppointmentNotFound;
import emt.lab.appointmentscheduling.domain.models.Appointment;
import emt.lab.appointmentscheduling.domain.models.AppointmentId;
import emt.lab.appointmentscheduling.domain.repository.AppointmentRepository;
import emt.lab.appointmentscheduling.services.AppointmentService;
import emt.lab.appointmentscheduling.services.form.AppointmentForm;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;

    @Override
    public Appointment findById(AppointmentId id) {
        return appointmentRepository.findById(id).orElseThrow(AppointmentNotFound::new);
    }

    @Override
    public Appointment addAppointment(AppointmentForm form) {
        Appointment a = Appointment.build(form.getPatientId(), form.getDoctorId(), form.getAppointmentType(), form.getPrice(), form.getScheduledAt());
        appointmentRepository.save(a);
        return a;
    }

    @Override
    public List<Appointment> getAll() {
        return appointmentRepository.findAll();
    }
}
