package emt.lab.doctormanagement.domain.models;

import org.springframework.lang.NonNull;
import emt.lab.sharedkernel.domain.base.DomainObjectId;

public class DoctorId extends DomainObjectId {
    private DoctorId() {
        super(DoctorId.randomId(DoctorId.class).getId());
    }

    public DoctorId(@NonNull String uuid) {
        super(uuid);
    }

    public static DoctorId of(String uuid) {
        DoctorId p = new DoctorId(uuid);
        return p;
    }
}
