public class Student {

    private String studentNo;
    private String name;
    private String kana;
    private String gender;
    private String status;

    public Student(){}

    public Student(String studentNo,String name,String kana,String gender,String status){

        this.studentNo = studentNo;
        this.name = name;
        this.kana = kana;
        this.gender = gender;
        this.status = status;

    }

    public String getStudentNo() {
        return studentNo;
    }

    public String getName() {
        return name;
    }

    public String getKana() {
        return kana;
    }

    public String getGender() {
        return gender;
    }

    public String getStatus() {
        return status;
    }

}