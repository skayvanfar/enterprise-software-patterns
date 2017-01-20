package BehavioralPatterns.ChainOfResponsibility;

/**
 * Can be Abstract class
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/30/2016.
 */
public abstract class Handler {

    protected Handler nextHandler;

    void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * @param request Command Object
     */
    abstract void calculate(Numbers request);
}
