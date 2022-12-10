import java.util.Date;
import java.util.Calendar;

public abstract class Insurance {

    Calendar calendar = Calendar.getInstance();
    private String insName;
    private double insPrice;
    private Date startDate;
    private Date finishDate;

    public Insurance(String insName, Date startDate, Date finishDate) {
        this.insName = insName;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public String getInsName() {
        return insName;
    }

    public void setInsName(String insName) {
        this.insName = insName;
    }

    public double getInsPrice() {
        return insPrice;
    }

    public void setInsPrice(double insPrice) {
        this.insPrice = insPrice;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public abstract void calculate(String insuranceType);


}
