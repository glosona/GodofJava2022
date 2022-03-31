package chapter6;

public class ControlSwitch {
    public static void main(String args[]){
        ControlSwitch control = new ControlSwitch();
        control.switchStatement2(1);
        control.switchStatement2(2);
        control.switchStatement2(3);
        control.switchStatement2(4);
        control.switchStatement2(6);
    }
    public void switchStatement(int numberOfWheel){
        switch (numberOfWheel) {
            case 1:
                System.out.println(numberOfWheel+":It is one foot bicycle.");
                break;
            case 2:
                System.out.println(numberOfWheel+":It is a motor cycle or bicycle.");
                break;
            case 3:
                System.out.println(numberOfWheel+":It is a three wheel car.");
                break;
            case 4:
                System.out.println(numberOfWheel+":It is a car.");
                break;
            default:
                System.out.println(numberOfWheel+":It is an expensive car.");
                break;
        }
    }
    public void switchStatement2(int numberOfWheel){
        switch (numberOfWheel) {
            // 다음 break가 올 때까지 계속 실행함
            case 1:
                System.out.println(numberOfWheel+":It is one foot bicycle.");
                // break;
            case 2:
                System.out.println(numberOfWheel+":It is a motor cycle or bicycle.");
                // break;
            case 3:
                System.out.println(numberOfWheel+":It is a three wheel car.");
                break;
            case 4:
                System.out.println(numberOfWheel+":It is a car.");
                break;
            default:
                System.out.println(numberOfWheel+":It is an expensive car.");
                break;
        }
    }
}
