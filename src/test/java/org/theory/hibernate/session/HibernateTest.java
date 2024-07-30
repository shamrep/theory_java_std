package org.theory.hibernate.session;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import org.junit.jupiter.api.Test;
import org.theory.hibernate.entity.TagEntity;

import java.lang.reflect.Field;

import static java.util.Arrays.stream;
import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.joining;

public class HibernateTest {

    @Test
    void checkMapping() {

        String sql = """
                INSERT 
                INTO 
                %s
                (%s)
                VALUES
                (%s)
                """;

        TagEntity tagEntity = TagEntity.builder().id(1L).name("Tag 1").build();

        String tableName = ofNullable(tagEntity.getClass().getAnnotation(Table.class))
                .map(tableAnnotation -> tableAnnotation.name())
                .orElse(tagEntity.getClass().getName());

        System.out.println(tagEntity.getClass().getName());

        Field[] declaredFields = tagEntity.getClass().getDeclaredFields();

        String columnNames = stream(declaredFields).map(field -> ofNullable(field.getAnnotation(Column.class))
                        .map(Column::name)
                        .orElse(field.getName()))
                .collect(joining(", "));

        String columnValues = stream(declaredFields)
                .map(field -> "?")
                .collect(joining(", "));

        System.out.printf((sql) + "%n", tableName, columnNames, columnValues);
    }
}
