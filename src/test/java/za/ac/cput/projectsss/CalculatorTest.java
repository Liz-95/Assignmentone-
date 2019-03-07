package za.ac.cput.projectsss;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void add(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(14, calculator.add(6,8));
    }
    @Test
    public void sub(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(24, calculator.sub(36,12));
    }
    @Test
    public void div(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(6, calculator.div(30,5));
    }
    @Test
    public void multi(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(15, calculator.multi(3,5));
    }
}
//END OF TEST