package dev.flyway.migration;

import dev.flyway.migration.repository.BookRepository;
import dev.flyway.migration.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MigrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MigrationApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(final PersonRepository repository, final BookRepository bookRepository) {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				System.err.println(repository.findAll());
				System.err.println(bookRepository.findAll());
			}

		};
	}
}
