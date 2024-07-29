package nogueira.springGOF;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 *
 * @author 5qU4llV777
 */

@EnableFeignClients
@SpringBootApplication
public class SpringGofApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGofApplication.class, args);
	}

}
