package emt.lab.appointmentscheduling.domain.models;

import emt.lab.appointmentscheduling.domain.valueobjects.DoctorId;
import emt.lab.appointmentscheduling.domain.valueobjects.Money;
import emt.lab.appointmentscheduling.domain.valueobjects.PatientId;
import emt.lab.sharedkernel.domain.base.AbstractEntity;
import emt.lab.sharedkernel.domain.identity.Name;
import lombok.Getter;
import org.springframework.lang.NonNull;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name="appointments")
@Getter
public class Appointment extends AbstractEntity<AppointmentId> {
    private AppointmentType appointmentType;
    private Money price;
    private LocalDateTime scheduledAt;

    @AttributeOverride(name = "id", column = @Column(name = "patient_id", nullable = false))
    private PatientId patientId;

    @AttributeOverride(name = "id", column = @Column(name = "doctor_id", nullable = false))
    private DoctorId doctorId;

    protected Appointment() {
        super(AppointmentId.randomId(AppointmentId.class));
    }

    public static Appointment build(@NonNull PatientId patientId, @NonNull DoctorId doctorId,
                                    AppointmentType appointmentType, Money price, LocalDateTime scheduledAt) {
        Appointment p = new Appointment();
        p.patientId = patientId;
        p.doctorId = doctorId;
        p.appointmentType = appointmentType;
        p.price = price;
        p.scheduledAt = scheduledAt;
        return p;
    }
}
