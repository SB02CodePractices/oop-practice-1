package sb02.oop.pr1;

public class PersonalUser extends User {
    private String personalEmail;

    public PersonalUser(String userId, String name, String personalEmail) {
        super(userId, name);
        this.personalEmail = personalEmail;
    }

    @Override
    public void printUserInfo() {
        super.printUserInfo();
        name = "[PERSONAL] " + name;
        System.out.println("개인 이메일: " + personalEmail);
    }

    public void printUserInfo(String additionalInfo) {
        printUserInfo();
        System.out.println("부가 정보: " + additionalInfo);
    }
}
