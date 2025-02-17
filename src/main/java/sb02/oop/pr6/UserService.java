package sb02.oop.pr6;


public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(String userId, String password) {
        // 유효성 검사, 비즈니스 로직 등
        userRepository.saveUser(userId, password);
        System.out.println("사용자 [" + userId + "] 등록 완료.");
    }

    public String findPassword(String userId) {
        if (!userRepository.existsUser(userId)) {
            throw new IllegalArgumentException("사용자 [" + userId + "]는 존재하지 않습니다.");
        }
        return userRepository.getUserPassword(userId);
    }
}
