package ASM8;

public class Main {
    public static void main(String args []){
        PhoneBook phoneBook = new PhoneBook();
        for (PhoneNumber pN:phoneBook.PhoneList){
            System.out.println(pN.getName()+":" +pN.getPhone());
        }
    }
}
