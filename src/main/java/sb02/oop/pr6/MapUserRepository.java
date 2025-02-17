package sb02.oop.pr6;

import java.util.HashMap;
import java.util.Map;

public class MapUserRepository implements UserRepository {
    private final Map<String, String> userDb = new HashMap<>();

    @Override
    public void saveUser(String userId, String password) {
        userDb.put(userId, password);
    }

    @Override
    public String getUserPassword(String userId) {
        return userDb.get(userId);
    }

    @Override
    public boolean existsUser(String userId) {
        return userDb.containsKey(userId);
    }
}
