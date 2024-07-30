package org.theory.hibernate;


import jakarta.persistence.EnumType;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.Type;
import org.theory.hibernate.entity.RegistrationDate;
import org.theory.hibernate.entity.TagEntity;

import java.time.LocalDate;

public class HibernateRunner {
    public static void main(String[] args) {

        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
             Session session = sessionFactory.openSession()) {

            session.beginTransaction();

            TagEntity tagEntity = TagEntity.builder()
                    .name("tag_1")
                    .registrationDate(new RegistrationDate(LocalDate.of(2024, 1, 12)))
                    .build();

            session.persist(tagEntity);

            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
