public class Child {

    private String name;
    private String parentsName;
    private  String cpr;
    private String address;
    private String phoneNumber;

    //hejhej

    public void fillInChildInformation(String name, String parentsName, String cpr, String address, String phoneNumber){
        this.name = name;
        this.parentsName =parentsName;
        this.cpr = cpr;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Child(String name, String parentsName, String address, String cpr, String phoneNumber) {
    }

    public Child() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentsName() {
        return parentsName;
    }

    public void setParentsName(String parentsName) {
        this.parentsName = parentsName;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //skal lige rettes
    @Override
    public String toString() {
        return  "Barns navn: " + name + "\n" + "Værges navn: " + parentsName + '\n' +
                "CPR: " + cpr + "\n" + "Adresse: " + address + '\n' +
                "Telefonnummer: " + phoneNumber + "\n";
    }
}
