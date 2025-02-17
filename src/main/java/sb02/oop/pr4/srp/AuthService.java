package sb02.oop.pr4.srp;

public class AuthService {
    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean authenticate(String userId, String password) {
        if (!userRepository.existsUser(userId)) {
            return false;
        }
        return userRepository.getUserPassword(userId).equals(password);
    }

    public boolean checkAdminPrivileges(String userId) {
        return "admin".equals(userId);
    }
}
