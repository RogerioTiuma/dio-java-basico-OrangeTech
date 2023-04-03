package dio.primeirospassos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);

		Calculadora calculadora = new Calculadora();
		System.out.println("O resultado é "+calculadora.somar(2,7));
	}

}
