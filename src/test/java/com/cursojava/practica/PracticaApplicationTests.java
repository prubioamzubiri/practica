package com.cursojava.practica;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cursojava.practica.dominio.Persona;

@SpringBootTest
class PracticaApplicationTests {


	@Test
	void testHBirthday()
	{
		Persona p = new Persona("0001", "Pepe", 7);

		int expected = 8;

		p.hBirthday();

		assertEquals(expected, p.getAge());

	}

}
