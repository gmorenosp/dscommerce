package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Payment;

import javax.persistence.Column;
import java.time.Instant;

public class PaymentDTO {

    private long id;
    private Instant moment;

    public PaymentDTO(long id, Instant moment) {
        this.id = id;
        this.moment = moment;
    }

    public PaymentDTO(Payment entity) {
        id = entity.getId();
        moment = entity.getMoment();
    }

    public long getId() {
        return id;
    }

    public Instant getMoment() {
        return moment;
    }
}
