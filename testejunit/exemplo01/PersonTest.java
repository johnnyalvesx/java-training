package exemplo01;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void show_full_name() {
	Person p = new Person("Paul", "McCartney");
	assertEquals("Paul McCartney", p.fullname());
    }
}
