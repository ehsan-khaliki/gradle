package test;

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import source.*;

import static junit.framework.TestCase.*;

/**
* ParkingLot Tester. 
* 
* @author <Authors name> 
* @since <pre>Aug 18, 2015</pre> 
* @version 1.0 
*/ 
public class ParkingLotTest {
    int LOT_SIZE = 30;
    ParkingLot lot = new ParkingLot(LOT_SIZE);
@Before
public void before() throws Exception {

} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: parkCar() 
* 
*/ 
@Test
public void testParkCar() throws Exception { 
//TODO: Test goes here...
    for(int i=0; i<LOT_SIZE; i++)
        assertTrue(lot.parkCar());
    assertFalse(lot.parkCar());
}

/** 
* 
* Method: takeCar() 
* 
*/ 
@Test
public void testTakeCar() throws Exception { 
//TODO: Test goes here...
    assertFalse(lot.takeCar());
    lot.parkCar();
    assertTrue(lot.takeCar());
} 


} 
