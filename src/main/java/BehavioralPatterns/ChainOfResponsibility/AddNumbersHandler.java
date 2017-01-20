package BehavioralPatterns.ChainOfResponsibility;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/30/2016.
 */
public class AddNumbersHandler extends Handler {

    @Override
    public void calculate(Numbers request) {
        if (request.getCalculationWanted().equals("add")) {
            System.out.println(request.getNumber1() + " + " + request.getNumber2()
                 + " = " + (request.getNumber1() + request.getNumber2()));
        } else {
            nextHandler.calculate(request);
        }
    }
}
