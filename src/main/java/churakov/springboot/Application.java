package churakov.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}


/*
Для создания таблицы.

CREATE TABLE users (
                       id SERIAL PRIMARY KEY,
                       name VARCHAR(50) NOT NULL CHECK (char_length(name) >= 2),
                       lastname VARCHAR(50) NOT NULL CHECK (char_length(lastname) >= 2),
                       age INT NOT NULL CHECK (age > 0)
);

 */