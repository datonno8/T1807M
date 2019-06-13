namespace ASM4.Properties
{
    public interface Phone
    {
        void insertPhone(string name, string phone);
        void removePhone(string name);
        void updatePhone(string name, string newPhone);
        void searchPhone(string name);
        void sortPhone();
    }
}