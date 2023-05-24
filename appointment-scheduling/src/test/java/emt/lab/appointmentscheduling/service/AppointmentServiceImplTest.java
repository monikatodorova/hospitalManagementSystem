package emt.lab.appointmentscheduling.service;

import emt.lab.appointmentscheduling.domain.models.Appointment;
import emt.lab.appointmentscheduling.domain.models.AppointmentType;
import emt.lab.appointmentscheduling.domain.valueobjects.*;
import emt.lab.appointmentscheduling.services.AppointmentService;
import emt.lab.appointmentscheduling.services.form.AppointmentForm;
import emt.lab.appointmentscheduling.xport.doctor.DoctorClient;
import emt.lab.appointmentscheduling.xport.patient.PatientClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class AppointmentServiceImplTest {

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private PatientClient patientClient;

    @Autowired
    private DoctorClient doctorClient;

    @Test
    public void testMakeAppointmentWithRealData() {
        List<Patient> patientList = patientClient.findAll();
        Patient p1 = patientList.get(0);

        List<Doctor> doctorList = doctorClient.findAll();
        Doctor d1 = doctorList.get(0);

        AppointmentForm appointmentForm = new AppointmentForm();
        appointmentForm.setPrice(Money.valueOf(Currency.MKD, 500));
        appointmentForm.setAppointmentType(AppointmentType.Dermatology);
        appointmentForm.setScheduledAt(LocalDateTime.now());
        appointmentForm.setDoctorId(d1.getId());
        appointmentForm.setPatientId(p1.getId());

        Appointment appointment = appointmentService.addAppointment(appointmentForm);

        Assertions.assertEquals(appointment.getPatientId(),p1.getId());
    }
}
