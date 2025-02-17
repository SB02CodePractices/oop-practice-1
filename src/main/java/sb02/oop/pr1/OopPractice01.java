package sb02.oop.pr1;

public class OopPractice01 {
    public static void main(String[] args) {


        PersonalUser pu = new PersonalUser(
                "u001",
                "CodeIt",
                "codeit@codeit.com"
        );
        pu.printUserInfo();
        System.out.println("-----");
        pu.printUserInfo("코드잇 수강생입니다.");
    }
}
