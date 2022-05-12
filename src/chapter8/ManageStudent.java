package chapter8;

public class ManageStudent {
    // 직접해 봅시다
    public static void main(String args[]){
        Student[] student;
        ManageStudent manageStudent=new ManageStudent();
        student = manageStudent.addStudent();
        manageStudent.printStudents(student);
    }
    public Student[] addStudent() {
        Student[] student=new Student[3];
        student[0]=new Student("Lim");
        student[1]=new Student("Min");
        student[2]=new Student("Sook","Seoul","010xxxxxxxxx","ask@godofjava.com");
        return student;
    }
    public void printStudents(Student[] student){
        for(Student i:student){
            System.out.println(i);
        }
    }

    /*
    정리해 봅시다
    1. 생성자는 반드시 만들어야 하나요?
       : 만들지 않아도 기본 생성자가 호출된다.
    2. 만약 매개 변수가 있는 생성자를 만들고, 매개 변수가 없는 기본 생성자를 호출하면 어떻게 될까요?
       : 오류가 발생한다.
    3. 생성자의 개수는 제한이 있나요?
       : 없다.
    4. 인스턴스의 변수와 매개 변수나 메소드 내에서 생성한 변수와 구분하기 위해서 사용하는 키워드는 무엇인가요?
       : this
    5. 메소드 선언 시 리턴 타입으로 지정한 데이터를 넘겨줄 때 필요한 키워드는 무엇인가요?
       : 리턴할 변수 타입
    6. 메소드 선언 시 아무 데이터도 리턴 타입으로 넘겨주지 않겠다는 것을 지정하는 키워드는 무엇인가요?
       : void
    7. 메소드 선언에 static이 있는 것과 없는 것의 차이는 무엇인가요?
       : static이 있으면 객체를 생성하니 않아도 메소드를 호출할 수 있다. 대신 크래스 변수만 사용할 수 있다.
    8. 필자가 엄청나게 중요하다고 한 것 중 메소드의 이름은 같으나 매개 변수를 다르게 하는 것의 명칭은 무엇인가요?
       : overload
    9. 기본 자료형을 매개 변수로 넘겨줄 때 Pass by value인가요? 아니면 Pass by reference인가요?
       : Pass by value
    1o. 참조 자료형을 매개 변수로 넘겨줄 때 Pass by value인가요? 아니면 Pass by reference인가요/?
       : Pass by reference
    11. 매개 변수의 수가 가변적일 때 메소드 선언 시 타입과 변수 이름 사이에 어떤 것을 적어줘야 하나요?
       :...
    */

}
