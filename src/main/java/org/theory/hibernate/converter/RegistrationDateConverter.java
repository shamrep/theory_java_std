package org.theory.hibernate.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.theory.hibernate.entity.RegistrationDate;

import java.sql.Date;
import java.util.Optional;

@Converter(autoApply = true)
public class RegistrationDateConverter implements AttributeConverter<RegistrationDate, Date> {
    @Override
    public Date convertToDatabaseColumn(RegistrationDate registrationDate) {
        return Optional.ofNullable(registrationDate).map(RegistrationDate::registrationDate).map(Date::valueOf).orElse(null);
    }

    @Override
    public RegistrationDate convertToEntityAttribute(Date date) {
        return Optional.ofNullable(date).map(Date::toLocalDate).map(RegistrationDate::new).orElse(null);
    }
}
