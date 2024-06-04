package dev.flyway.migration.repository;

import dev.flyway.migration.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
