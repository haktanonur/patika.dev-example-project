import java.util.Date;

public class HealthInsurance extends Insurance{
    public HealthInsurance(String insurancaType) {
        super("Sağlık sigortası", new Date(), new Date());
        calculate(insurancaType);
    }

    @Override
    public void calculate(String insuranceType) {
        double price=999.99;
        if(insuranceType.equals("Individual"))
        {
            setInsPrice(price);
        }
        if(insuranceType.equals("Enterprise")){
            setInsPrice(price*0.9);
        }
    }
}
