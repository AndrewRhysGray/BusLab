import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    public Bus bus;
    public Person person;

    @Before
    public void before(){
        bus = new Bus("Edinburgh", 5);

    }

    @Test
    public void passengerListEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void cannotAddPassengerIfNotCapacity(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(5, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(1, bus.passengerCount());
    }


}
