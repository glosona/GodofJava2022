package chaper3;

public class CarManager {
    public static void main(String args[]) {
        Car dogCar=new Car();
        Car cowCar=new Car();   // 각자의 객체 생성
        // new는 예약어, 클래스 생성자 지정(호출)할 때 사용
        dogCar.speedUp();
        dogCar.speedUp();
        System.out.println(dogCar.getCurrentSpeed());
        dogCar.breakDown();
        System.out.println(dogCar.getCurrentSpeed());
    }
}
