public class HomeAddress extends AddressId implements Address<HomeAddress>{
    private int addressId;
    private String city;
    private String district;
    private String street;
    private String addressDetail;

    public HomeAddress(String city, String district, String street, String addressDetail) {
        addressId = AddressId.id;
        this.city = city;
        this.district = district;
        this.street = street;
        this.addressDetail = addressDetail;
    }
    @Override
    public void showAddressInfo() {
        System.out.println("Ev adresi : ");
        System.out.println(this.addressId + "- " + "Şehir : " + this.getCity() + "\tİlçe : " +this.getDistrict() + "\tSokak : " + this.getStreet() + "\n"
                + "\tAdres Tarifi : " + this.getAddressDetail());
    }

    public int getAddressId() {
        return addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }


}
