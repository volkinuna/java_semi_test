package java_02.quiz5_quiz6;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child(); // 자동타입변환

        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        /*
        parent.field2 = "data2"; //(불가능)
        parent.method3(); //(불가능)
        */
        
        // quiz6. 강제타입변환 후 사용
        Child child = (Child) parent;

        child.field2 = "data2";
        child.method3();

        /*
        quiz5. 자동타입변환이 일어나면 부모 클래스에 있는 필드와 메소드만 사용할 수 있다.
               자식 클래스에서 오버라이드 된 메소드는 해당 메소드를 사용한다.
        */
    }
}
