package chapter8;

public class ReferenceOverloading {
    public static void main(String args[]){
        ReferenceOverloading reference = new ReferenceOverloading();
    }
    public void print(int data){}
    public void print(String data){}
    public void print(int intData, String stringData){}
    public void print(String stringData, int intData){}
    // 이름 같지만 매개변수 다르면 overload한 것임
}
