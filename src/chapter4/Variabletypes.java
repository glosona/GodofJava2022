package chapter4;

public class Variabletypes {
    int instanceVariable;   // 메소드 밖, 클래스 안에 선언된 건 인스턴스 변수
    static int classVariable;   // 인스턴스 변수에 static 붙이면 클래스 변수
    public void method(int parameter) {   // 메소드에 넘겨주는 변수는 매개 변수
        int localVariable;   // 중괄호 내에서 선언되면 지역 변수
    }
    public void anotherMethod() {
        if(true) {
            int localVariable;   // 위랑은 다른 변수임
        }
        if(true){
            int localVariable;   // 위랑은 또 다른 중괄호이기 때문에 또다른 변수임
        }
    }
}
