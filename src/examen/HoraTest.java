package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HoraTest {

	Hora h=new Hora();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		
		
		@AssertsFalse(h.validarHora(0,0,-1));
	}

	@Test
	void test2() {
		@AssertsFalse(h.validarHora(1,1,24));
	}
	@Test
	void test3() {
		@AssertsFalse(h.validarHora(0,-1,3));
	}
	@Test
	void test4() {
		@AssertTrue(h.validarHora(20,20,20));
	}

	
	

}
