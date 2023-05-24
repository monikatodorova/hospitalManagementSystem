package emt.lab.appointmentscheduling.services;

import emt.lab.appointmentscheduling.domain.models.Appointment;
import emt.lab.appointmentscheduling.domain.models.AppointmentId;
import emt.lab.appointmentscheduling.services.form.AppointmentForm;

import java.util.List;

public interface AppointmentService {
    Appointment findById(AppointmentId id);
    Appointment addAppointment(AppointmentForm form);
    List<Appointment> getAll();
}
