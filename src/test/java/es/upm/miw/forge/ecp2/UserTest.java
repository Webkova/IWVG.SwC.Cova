package es.upm.miw.forge.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.forge.ecp2.User;

public class UserTest {
	
    private User u;

    @Before
    public void before() {
        u = new User(1,"Nombre","Apellido");
    }
    
    public void testPuntoIntInt() {
        assertEquals("NOMBRE", u.getNameUpperCase());
    }

}
