package java_02.quiz1_quiz2;

public class Student {

    String name = "김철수"; //학생 이름
    int ban = 1; //반
    int no = 10; //번호
    int kor = 90; //국어점수
    int eng = 70; //영어점수
    int math = 85; //수학점수

    // quiz1
    int getTotal() {
        int sum = kor + eng + math;
        return sum;
    }

    double getAverage() {
        double avg = (double) (getTotal() / 3);
        return avg;
    }

    // quiz2
    @Override
    public String toString() {
        return "이름: " + name + ", 반: " + ban + ", 번호 : " + no;
    }
}
