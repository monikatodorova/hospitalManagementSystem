package emt.lab.appointmentscheduling.domain.valueobjects;

import emt.lab.sharedkernel.domain.base.DomainObjectId;

import javax.persistence.Embeddable;

@Embeddable
public class DoctorId extends DomainObjectId {

    protected DoctorId() {
        super(DoctorId.randomId(DoctorId.class).getId());
    }

    public DoctorId(String uuid) {
        super(uuid);
    }
}
