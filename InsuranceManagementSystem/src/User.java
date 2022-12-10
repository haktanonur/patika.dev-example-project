import java.util.ArrayList;
import java.util.Date;
import java.util.zip.DataFormatException;

public class User {
    private String name;
    private String surname;
    private String email;
    private String psw;
    private String job;
    private int age;
    private ArrayList<Address> addressList;
    private Date lastEntry;
    private Address address;
    private Insurance insurance;
    private ArrayList<Insurance> insuranceList = new ArrayList<>();
    private String membership;

    public User(String name, String surname, String email, String psw, String job, int age, ArrayList<Address> addressList, Date lastEntry, Address address, Insurance insurance, ArrayList<Insurance> insuranceList, String membership) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.psw = psw;
        this.job = job;
        this.age = age;
        this.addressList.add(address);
        this.lastEntry = new Date(System.currentTimeMillis());
        this.address = address;
        this.insurance = insurance;
        this.insuranceList = insuranceList;
        this.membership = membership;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Address> getAddressList() {
        return addressList;
    }
    public void setAddressList(Address addressList) {
        this.addressList.add(addressList);
    }

    public Date getLastEntry() {
        return lastEntry;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(ArrayList<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }

    public String getMembership() {
        return membership;
    }
}
