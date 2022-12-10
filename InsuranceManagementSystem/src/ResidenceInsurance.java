import java.util.Date;

public class ResidenceInsurance extends Insurance{
    public ResidenceInsurance(String insuranceType) {
        super("Konut sigortası",new Date(),new Date());
        calculate(insuranceType);
    }

    @Override
    public void calculate(String insuranceType) {
        double price = 526.99;
        if(insuranceType.equals("Individual"))
        {
            setInsPrice(price);
        }
        if(insuranceType.equals("Enterprise")){
            setInsPrice(price*0.9);
        }
    }
}
