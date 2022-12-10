public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax(){
        double tax = 0;
        if (this.salary >= 1000){
           return this.salary * 0.03;
        }
        return tax;
    }
    double bonus(){
        double bonus = 0;
        if (this.workHours > 40){
            return (this.workHours - 40)*30;
        }
        return bonus;
    }
    double raiseSalary(){
        double raiseSalary = 0;
        int currentYear = 2021;
        if ((currentYear - this.hireYear < 10) && (currentYear - this.hireYear > 0)){
            return this.salary * 0.05;
        }
        else if ((currentYear - this.hireYear >= 10) && (currentYear - this.hireYear < 20)){
            return this.salary * 0.10;
        }
        else {
            return this.salary * 0.15;
        }
    }
    double salaryWithBonusandTax(){
        return  (this.salary + bonus() - tax());
    }
    double totalSalary(){
        return  (this.salary + bonus() - tax() + raiseSalary());
    }

    @Override
    public String toString() {
        String info = "Adı : " + this.name +"\n" +
                "Maaşı : " + this.salary + "\n" +
                "Çalışma Saati : " + this.workHours + "\n" +
                "Başlangıç Yılı : " + this.hireYear + "\n" +
                "Vergi : " + tax() + "\n" +
                "Bonus : " + bonus() + "\n" +
                "Maaş Artışı : " + raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + salaryWithBonusandTax() + "\n" +
                "Toplam Maaş : " + totalSalary();
        System.out.println(info);
        return info;
    }
}
