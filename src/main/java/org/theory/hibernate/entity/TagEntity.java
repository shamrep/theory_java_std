package org.theory.hibernate.entity;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.theory.hibernate.type.JsonType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tag")
public class TagEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

//    @Convert(converter = RegistrationDateConverter.class)
    @Column(name = "registration_date")
    private RegistrationDate registrationDate;

//  @Type(value = JsonType.class)
    private String info;
}
