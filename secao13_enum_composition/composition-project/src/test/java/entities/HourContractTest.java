package entities;

import java.util.Date;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class HourContractTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public HourContractTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( HourContractTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
      Date date = new Date();
      HourContract hc = new HourContract(date,2.50, 8 );
      assertEquals("TESTE: ", 20.0, hc.totalValue());
    }
}

