package sb02.oop.pr4.srp;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private final Map<String, String> userDb = new HashMap<>();

    public void saveUser(String userId, String password) {
        userDb.put(userId, password);
    }

    public String getUserPassword(String userId) {
        return userDb.get(userId);
    }

    public boolean existsUser(String userId) {
        return userDb.containsKey(userId);
    }
}
