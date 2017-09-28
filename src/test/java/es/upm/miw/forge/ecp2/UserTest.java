package es.upm.miw.forge.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.forge.ecp2.User;

public class UserTest {
    
    private User u;
    private String name;
    private String familyName;


    @Before
    public void before() {
        u = new User(1,"Nombre","Apellido");
        name = "Nombre";
        familyName = "Apellido";
    }
    
    @Test
    public void testFullName() {
        u = new User(2, name, familyName); 
        assertEquals("Nombre Apellido", u.fullName());
    }
    
    @Test
    public void testGetName() {
        u = new User(2, name, familyName);
        assertEquals("Nombre", u.getName());
    }
    
    @Test
    public void testGetFamilyName() {
        u = new User(2, name, familyName);
        assertEquals("Apellido", u.getFamilyName());
    }

    @Test
    public void testInitials() {
            u = new User(2, name, familyName); 
        assertEquals("N.", u.initials());
    }
    
    
    public void testPuntoIntInt() {
        assertEquals("NOMBRE", u.getNameUpperCase());
    }
    
}