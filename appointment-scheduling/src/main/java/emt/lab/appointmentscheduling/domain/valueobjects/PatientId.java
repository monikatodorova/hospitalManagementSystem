package emt.lab.appointmentscheduling.domain.valueobjects;

import emt.lab.sharedkernel.domain.base.DomainObjectId;

import javax.persistence.Embeddable;

@Embeddable
public class PatientId extends DomainObjectId {

    protected PatientId() {
        super(PatientId.randomId(PatientId.class).getId());
    }

    public PatientId(String uuid) {
        super(uuid);
    }
}
