import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import yazilimfinalodev.Ortalama;


public class OrtTest {

    private Ortalama Ortalama;
    
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        Ortalama = new Ortalama();
        
    }
    
    @Test
    public void AA() {
        Assert.assertEquals("AA", Ortalama.OrtHesaplama(100,96));
    }
    
    @Test
    public void BA() {
        Assert.assertEquals("BA",Ortalama.OrtHesaplama(89, 87));
    }
    
    @Test
    public void BB() {
        Assert.assertEquals("BB",Ortalama.OrtHesaplama(80, 84));
    }
    
    @Test
    public void CB() {
        Assert.assertEquals("CB",Ortalama.OrtHesaplama(79, 76));
    }
    @Test
    public void CC() {
        Assert.assertEquals("CC",Ortalama.OrtHesaplama(71, 71));
    }
    @Test
    public void FD() {
        Assert.assertEquals("FD",Ortalama.OrtHesaplama(61, 61));
    }
    @Test
    public void FF() {
        Assert.assertEquals("FF",Ortalama.OrtHesaplama(0, 0));
    }
    @Test
    public void ERROR() {
        Assert.assertEquals("ERROR",Ortalama.OrtHesaplama(256, 399));
    }
    
    @After
    public void tearDown() {
        Ortalama = null;
    }

}
