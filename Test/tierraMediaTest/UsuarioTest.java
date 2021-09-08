package tierraMediaTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import tierraMedia.Usuario;

public class UsuarioTest {

	Usuario usuario1;
	
	
	
	@Test
	public void CrearUsuarioTest() {
		usuario1 = new Usuario( "Juan", "Aventura", 4.5, 20);
		assertNotNull(usuario1);
	}
	
	@Test
	public void pruebaDeGettersYSetters() {
		usuario1 = new Usuario( "Juan", "Aventura", 4.5, 20);
		assertEquals("Juan", usuario1.getNombre());
		assertEquals("Aventura", usuario1.getTipoAtraccionPreferida());
		assertEquals(4.5, usuario1.getTiempoDisponible());
		assertEquals(20, usuario1.getPresupuesto());
	}

}
