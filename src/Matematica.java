import java.math.BigDecimal;

public class Matematica {

    public BigDecimal fatorial(int n) throws MatematicaException{
        if(n<0){
            throw new MatematicaException("Não existe fatorial de número negativo ==>> "+n);
        }
        if (n == 1 || n == 0) {
            return new BigDecimal(1);
        }
        return BigDecimal.valueOf(n).multiply(fatorial(n-1));
    }
}