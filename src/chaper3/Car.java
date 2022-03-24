package chaper3;

public class Car {
    // 변수 지정으로 클래스 "상태" 정함
    int speed;
    int distance;
    String color;

    public Car() {    // 생성자(Constructor)
    }

    // 메소드로 클래스 상태 변경하는 "행위" 지정
    public void speedUp() {
        speed+=5;
    }
    public void breakDown() {
        speed-=10;
    }
    public int getCurrentSpeed() {
        return speed;
    }
}
