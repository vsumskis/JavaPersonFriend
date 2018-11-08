package lt.swedbank.vsumskis;

import static org.junit.Assert.*;

public class PersonTest {

    @org.junit.Test
    public void getName() {
        Person person = new Person("Alex");
        assertEquals("Alex", person.getName());

    }

    @org.junit.Test
    public void getFriend() {
        Person person = new Person("Adam");
        Person second = new Person(person,"John");
        assertNull(person.getFriend());
        assertEquals(person,second.getFriend());
    }
}