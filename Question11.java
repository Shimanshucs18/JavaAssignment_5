package Source;



record Student(String name,int id ,int age){
    static int count=0;

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        count=count+1;
    }

}

public class Question11 {
    public static void main(String[] args) {
        Student s1=new Student("Shimanshu Sharma",1001,19);
        Student s2=new Student("Shimanshu Sharma",1002,20);
        System.out.println(s1.equals(s2));
        System.out.println(Student.count);
    }
}