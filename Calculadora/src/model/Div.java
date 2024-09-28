package model;

/**
 *
 * @author unifamussio
 */
public class Div extends OperacaoMath{
    public double calcular(double a, double b){
        if (b != 0){
            return a/b;
        }else{
            return 0;
        }
    }
}