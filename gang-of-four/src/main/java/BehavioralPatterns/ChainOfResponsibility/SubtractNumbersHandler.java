package BehavioralPatterns.ChainOfResponsibility;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/30/2016.
 */
public class SubtractNumbersHandler extends Handler {


    @Override
    public void calculate(Numbers request) {
        if (request.getCalculationWanted().equals("sub")) {
            System.out.println(request.getNumber1() + " - " + request.getNumber2()
                    + " = " + (request.getNumber1() - request.getNumber2()));
        } else {
            nextHandler.calculate(request);
        }
    }
}
