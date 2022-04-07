package chapter8;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;
    public MemberDTO(){
        // 아무 정보도 모를 때
    }
    public MemberDTO(String name){
        // 이름만 알 때
        this.name=name;
    }
    public MemberDTO(String name, String phone){
        // 이름, 전화번호 알 때
        this.name=name;
        this.phone=phone;
    }
    public MemberDTO(String name, String phone, String email){
        // 모든 정보 알 때
        this.name=name;
        this.phone=phone;
        this.email=email;
    }



    public MemberDTO getMemberDTO(){
        MemberDTO dto=new MemberDTO();
        return dto;
    }
}
