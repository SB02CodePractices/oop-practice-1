package sb02.oop.pr6;

public interface UserRepository {
    void saveUser(String userId, String password);
    String getUserPassword(String userId);
    boolean existsUser(String userId);
}
