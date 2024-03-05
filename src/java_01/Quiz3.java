package java_01;

public class Quiz3 {
    public static void main(String[] args) {

        //for문을 이용하여 1~20까지의 정수 중 2의 배수 총합을 구하는 코드를 작성하세요. (10점)

        int sum = 0;

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("1~20까지의 정수 중 2의 배수 총합 : " + sum);
    }
}
