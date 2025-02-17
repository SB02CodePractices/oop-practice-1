package sb02.oop.pr4.legacy;

public class OopPractice04 {
    public static void main(String[] args) {
        LegacyUserService userService = new LegacyUserService();
        userService.register("codeit", "codeit123");
        userService.register("codeit2", "codeit123!!");
        userService.register("admin", "admin@@1234");

        String somePassword = userService.getUserPassword("codeit3");
        System.out.println("Some pw: " + somePassword);

        boolean noUserLogIn = userService.login("codeit3", "codeit123");
        System.out.println("Login result 0: " + noUserLogIn);

        boolean codeitLogIn = userService.login("codeit", "codeit123");
        System.out.println("Login result 1: " + codeitLogIn);

        boolean codeitLogIn2 = userService.login("codeit2", "codeit123");
        System.out.println("Login result 2: " + codeitLogIn2);
    }
}
