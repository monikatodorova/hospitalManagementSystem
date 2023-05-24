package emt.lab.appointmentscheduling.services.form;

import emt.lab.appointmentscheduling.domain.models.AppointmentType;
import emt.lab.appointmentscheduling.domain.valueobjects.DoctorId;
import emt.lab.appointmentscheduling.domain.valueobjects.Money;
import emt.lab.appointmentscheduling.domain.valueobjects.PatientId;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AppointmentForm {
    private AppointmentType appointmentType;
    private Money price;
    private LocalDateTime scheduledAt;
    private PatientId patientId;
    private DoctorId doctorId;
}
