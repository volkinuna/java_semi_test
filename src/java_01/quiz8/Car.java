package java_01.quiz8;

public class Car {

    String company; // 회사명
    String model; // 모델명
    double maxSpeed; // 최고 속도
    Tire tire; // 타이어

    public Car(String company, String model, double maxSpeed) {
        this.company = company;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}
