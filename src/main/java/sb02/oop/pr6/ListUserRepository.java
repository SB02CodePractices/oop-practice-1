package sb02.oop.pr6;

import java.util.LinkedList;
import java.util.List;

public class ListUserRepository implements UserRepository {
    private final List<User> userDb = new LinkedList<>();

    @Override
    public void saveUser(String userId, String password) {
        userDb.add(new User(userId, password));
    }

    @Override
    public String getUserPassword(String userId) {
        String found = null;
        for (User user : userDb) {
            if (user.userId().equals(userId)) {
                found = user.password();
                break;
            }
        }
        return found;
    }

    @Override
    public boolean existsUser(String userId) {
        for (User user : userDb) {
            if (user.userId().equals(userId)) {
                return true;
            }
        }
        return false;
    }
}
