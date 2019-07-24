package JV1_Phone;

public class PhoneNumber {
    String name;
    String phone;

    public PhoneNumber(String name, String phone) {
        this.setName("nguyen van a");
        this.setPhone("0156456");
    }

    public PhoneNumber() {
        this.setName("nguyen van a");
        this.setPhone("548542111");
        System.out.println("Name:"+this.getName());
        System.out.println("phone:"+this.getPhone());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
