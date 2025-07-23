import java.util.Scanner;

public class ForthProgram{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totalMarks=sc.nextInt();
        if(totalMarks<100){
            System.out.println("Fail");
        }else if(totalMarks>100 && totalMarks<150){
            System.out.println("Grade C");
        }else if(totalMarks>=150 && totalMarks<175){
            System.out.println("Grade B");
        }else if(totalMarks>175){
            System.out.println("Grade A");
        }else{
            System.out.println("you are not eligable");
        }
        }
    }
