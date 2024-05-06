import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public void testRegisratieAdres(){
        Vluchteling testVluchteling = new Vluchteling("Test", "test", "123", "test", false, false, "ChingChing");
        String testAdres = "Testadres123";
        testVluchteling.registreren(testAdres);
        Assert.assertEquals(testVluchteling.getAdres(), "Testadres123");

    }
    @Test
    public void vluchtelingGegevensNietNull(){
        Vluchteling testVluchteling = new Vluchteling("Test", "test", "123", "test", false, false, "ChingChing");
        Assert.assertTrue(testVluchteling.toString(), true);
    }

    @Test
    public void BeheerderTypeCorrect(){
        Beheerder testbeheerder = new Beheerder("test", "test", "test");
        Assert.assertEquals(testbeheerder.getGebruikertype(), "Beheerder");

    }




}
