package org.theory.hibernate.entity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public record RegistrationDate(LocalDate registrationDate) {
    public long getAge() {
        return ChronoUnit.YEARS.between(registrationDate, LocalDate.now());
    }
}
