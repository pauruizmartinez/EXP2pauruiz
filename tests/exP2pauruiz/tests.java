package exP2pauruiz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class tests {
	@DisplayName ("Examen 2 Trimestre - Prueba 2.1")
	@Test
	void test() {
		LetraDNI l = new LetraDNI();
		char letraEsperada = l.obtenerLetraDNI(43233796);
		assertEquals('Y', letraEsperada);
	}

}
