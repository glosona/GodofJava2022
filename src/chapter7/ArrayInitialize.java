package chapter7;

public class ArrayInitialize {
    static String [] month={"January","February","March","April","May","June","July","August","September"
            ,"October","November","December"};   //     변하지 않는 값은 클래스의 변수로
    public static void main(String args[]) {
        ArrayInitialize array=new ArrayInitialize();
        array.otherInit();
    }
    public void otherInit() {
        int [] lottoNumbers={5,12,23,25,38,41,2};   // 선언과 함께 초기화
        // int []lottoNumbers2;
        // lottoNumbers2 = {5,12,23,25,38,41,2};   // compile error, 중괄호를 사용하여 초기화 할 때에는 변수 선언 및 초기화가 같이 일어나야 함
        // 보통 절대 변경되지 않는 값 => 중괄호
    }
    public String getMonth(int monthInt){
        return month[monthInt+1];
    }
}
