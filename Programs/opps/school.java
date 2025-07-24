import java.util.Scanner;

class Student {
    public void details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = sc.nextLine();
        System.out.println("Enter Your Class:");
        String classes = sc.nextLine();
        System.out.println("My name is " + name + " and I read in class " + classes);
        sc.close();
    }
}

class Teacher {
    public String facultyName(String name) {
        return name;
    }
}

public class School {
    public static void main(String[] args) {
        Student st = new Student();
        st.details();
        Teacher ts = new Teacher();
        String teacherName = ts.facultyName("Swarup"); 
        System.out.println("Teacher Name Is " + teacherName); 
    }
}