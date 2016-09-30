package CreationalPatterns.Builder.MainForm;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/28/2016
 */
public class Pizza {

    private String dough = "";
    private String sauce = "";
    private String topping = "";

    public void setDough(String dough)     {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
}
