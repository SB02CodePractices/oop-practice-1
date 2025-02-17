package sb02.oop.pr6;

public class DipTest {
    public static void main(String[] args) {
        ListUserRepository listUserRepository = new ListUserRepository();

        UserService userService = new UserService(listUserRepository);

        userService.registerUser("codeit", "codeit123");

        String foundPassword = userService.findPassword("codeit");
        System.out.println(foundPassword);
    }
}
