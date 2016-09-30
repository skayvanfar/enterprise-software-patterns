package BehavioralPatterns.ChainOfResponsibility;

/**
 * Request
 * Command Object
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/30/2016.
 */
public class Numbers {

    private int number1;
    private int number2;

    private String calculationWanted;

    public Numbers(int number1, int number2, String calculationWanted) {
        this.number1 = number1;
        this.number2 = number2;
        this.calculationWanted = calculationWanted;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public String getCalculationWanted() {
        return calculationWanted;
    }
}
