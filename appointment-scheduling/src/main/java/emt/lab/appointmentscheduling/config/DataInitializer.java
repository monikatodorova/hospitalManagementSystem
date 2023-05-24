package emt.lab.appointmentscheduling.config;

import emt.lab.appointmentscheduling.domain.models.Appointment;
import emt.lab.appointmentscheduling.domain.models.AppointmentType;
import emt.lab.appointmentscheduling.domain.repository.AppointmentRepository;
import emt.lab.appointmentscheduling.domain.valueobjects.Currency;
import emt.lab.appointmentscheduling.domain.valueobjects.Money;
import emt.lab.sharedkernel.domain.identity.Name;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Arrays;

@Component
@AllArgsConstructor
public class DataInitializer {
    private final AppointmentRepository appointmentRepository;

    @PostConstruct
    public void initData() {
//        Appointment p1 = Appointment.build(AppointmentType.Cardiology, Money.valueOf(Currency.MKD, 500), LocalDateTime.now());
//        Appointment p2 = Appointment.build(AppointmentType.Dermatology, Money.valueOf(Currency.MKD, 1500), LocalDateTime.now());
//        if(appointmentRepository.findAll().isEmpty()) {
//            appointmentRepository.saveAll(Arrays.asList(p1, p2));
//        }
    }
}
