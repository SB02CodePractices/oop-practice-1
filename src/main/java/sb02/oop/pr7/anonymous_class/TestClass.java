package sb02.oop.pr7.anonymous_class;

public class TestClass {

    private final String someString = "hello";

    public void test() {

        System.out.println(this.someString);

        EventListener listener = new EventListener() {

            private final String someString = "world";

            @Override
            public void onEvent(String eventData) {
                System.out.println("이벤트 발생: " + eventData);

                System.out.println(this.someString); // 익명 클래스에 선언된 someString

                System.out.println(TestClass.this.someString); // TestClass에 선언된 someString
            }
        };

        listener.onEvent("event 1");
    }
}
