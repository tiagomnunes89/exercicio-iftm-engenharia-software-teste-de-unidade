import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class MatematicaTest {

    private Matematica matematica;

    @Before
    public void init() {
        matematica = new Matematica();
    }

    @Test
    public void testaFatorialZero() throws MatematicaException {
        BigDecimal resposta = matematica.fatorial(0);
        Assert.assertEquals(resposta, new BigDecimal("1"));
    }

    @Test
    public void testaFatorialUm() throws MatematicaException {
        BigDecimal resposta = matematica.fatorial(1);
        Assert.assertEquals(resposta,  new BigDecimal("1"));
    }

    @Test
    public void testaFatorialCinco() throws MatematicaException {
        BigDecimal resposta = matematica.fatorial(5);
        Assert.assertEquals(resposta,  new BigDecimal("120"));
    }

    @Test
    public void testaFatorialNegativo() throws MatematicaException {
        BigDecimal resposta = matematica.fatorial(-1);
        Assert.assertEquals(resposta,  new BigDecimal("1"));
    }

    @Test
    public void testaFatorialQuinze() throws MatematicaException {
        BigDecimal resposta = matematica.fatorial(15);
        Assert.assertEquals(resposta,  new BigDecimal("1307674368000"));
    }

    @Test
    public void testaFatorialVinteCinco() throws MatematicaException {
        BigDecimal resposta = matematica.fatorial(25);
        Assert.assertEquals(resposta, new BigDecimal("15511210043330985984000000"));
    }
}
