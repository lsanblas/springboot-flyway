package dev.flyway.migration.repository;

import dev.flyway.migration.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
