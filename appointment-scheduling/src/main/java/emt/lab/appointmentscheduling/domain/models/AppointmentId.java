package emt.lab.appointmentscheduling.domain.models;

import emt.lab.sharedkernel.domain.base.DomainObjectId;
import org.springframework.lang.NonNull;

public class AppointmentId extends DomainObjectId {

    private AppointmentId() {
        super(AppointmentId.randomId(AppointmentId.class).getId());
    }

    public AppointmentId(@NonNull String uuid) {
        super(uuid);
    }

    public static AppointmentId of(String uuid) {
        AppointmentId p = new AppointmentId(uuid);
        return p;
    }
}
