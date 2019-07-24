package JV1_Phone;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public  class PhoneBook extends Phone {
    public ArrayList<PhoneNumber>PhoneList = new ArrayList<>();

    @Override
    public void removePhone(String name) {
        for (PhoneNumber pn:this.PhoneList){
            if (pn.getName().equals(name)){
                this.PhoneList.remove(pn);
                System.out.println("done");

            }
        }
    }

    @Override
    public void updatePhone(String name, String newPhone) {
        for (PhoneNumber pn:this.PhoneList) {
            if (pn.getName().equals(name)) {
                pn.setPhone(newPhone);
                System.out.println("done");
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneNumber pn:this.PhoneList) {
            if (pn.getName().equals(name)) {
                System.out.println(pn.getName()+" "+pn.getPhone());
            }
        }
    }

    @Override
    public void sort() {
        Collections.sort(this.PhoneList,new Comparator<PhoneNumber>(){
            public int compare(PhoneNumber o1,PhoneNumber o2){
                return o1.getName().compareTo(o2.getName());
            }
        });
    }


    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber pn:this.PhoneList){
            if (pn.getName().equals(name)){
                if(pn.getPhone().equals(phone)){
                    System.out.println("đã tồn tại");
                    return;
                }
                pn.setPhone(pn.getPhone()+ ":" + phone);
                return;
            }
        }
        this.PhoneList.add(new PhoneNumber(name,phone));
        System.out.println(this.PhoneList);
    }
}