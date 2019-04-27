package java2_asm6;

import java.util.ArrayList;

public interface DAOInterface {
    ArrayList<User> getUsers();
    boolean createUser(User user);
    boolean updateUser(User user);
    boolean deleteUser(User user);
}