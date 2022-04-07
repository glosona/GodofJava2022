package chapter7;

public class ArrayPrint {
    public static void main(String args[]){
        ArrayPrint array=new ArrayPrint();
        array.printSting();
        array.printPrimitiveArray();
    }
    public void printSting(){
        System.out.println("strings="+new String[0]);
        System.out.println("array="+new ArrayPrint[0]);
    }
    public void printPrimitiveArray(){
        System.out.println("byteArray="+new byte[1]);
        System.out.println("shortArray="+new short[1]);
        System.out.println("intArray="+new int[1]);
        System.out.println("longArray="+new long[1]);
        System.out.println("floatArray="+new float[1]);
        System.out.println("doubleArray="+new double[1]);
        System.out.println("charArray="+new char[1]);
        System.out.println("booleanArray="+new boolean[1]);
        // new int[1];과 같이 new라는 예약어 사용하고, 타입과 크기 지정해서 배열 선언
    }
}
