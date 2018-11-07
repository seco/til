package self.javaWebProgrammingSchool.basic;

public class PhoneInfo {
    private String name;
    private String phoneNumber;
    private String birthday;

    public PhoneInfo(String name, String num, String birth) {
        this.name = name;
        this.phoneNumber = num;
        this.birthday = birth;
    }
    public PhoneInfo(String name, String num) {
        this.name = name;
        this.phoneNumber = num;
        this.birthday = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void showPhoneInfo(){
        System.out.println("이름 : "+getName());
        System.out.println("전화번호 : " + getPhoneNumber());
        System.out.println("생일" + getBirthday());
    }
}
