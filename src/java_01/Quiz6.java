package java_01;

public class Quiz6 {
    public static void main(String[] args) {

        //아래 주어진 배열의 총합과 평균(소수점 자리 출력)을 출력하는 코드를 작성하세요. (10점)

        int[] scores = {83, 90, 87};

        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        double avg = 0;
        avg = (double) sum / scores.length;

        System.out.println("scores 배열의 총합 : " + sum);
        System.out.println("scores 배열의 평균 : " + avg);
        
    }
}
