import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class TestMenstrualCycleCalculation {
    @Test

    public void testToGetTheNextCycle(){
        MyMenstrualCycleCalculator menstrualCycle = new MyMenstrualCycleCalculator();
          String[] collect =menstrualCycle.getLastPeriodDate("2024/03/07");
          assertArrayEquals(collect,new String[]{"2024","03","07"});



    }
    @Test

    public void testforIsValidCycle(){
        MyMenstrualCycleCalculator menstrualCycle = new MyMenstrualCycleCalculator();
           assertTrue(menstrualCycle.isValidCycle(2024,7,8));

    }
    @Test

    public void testForOvulationMinimumRange(){
        MyMenstrualCycleCalculator menstrualCycle =  new MyMenstrualCycleCalculator();
            String[] dates = {"2024", "03", "21"};
            menstrualCycle.ovulationMinimumRange(dates);
            assertEquals(menstrualCycle.ovulationMinimumRange(dates),"2024 - MARCH - 30" );
            }

    @Test

    public void testOvulationMaximumRange(){
        MyMenstrualCycleCalculator menstrualCycle =new MyMenstrualCycleCalculator();
        String[] dates = {"2024", "03", "02"};
        menstrualCycle.ovulationMinimumRange(dates);
        assertEquals(menstrualCycle.ovulationMaximumRange(dates),"2024 - MARCH - 16" );
    }

        }


    

