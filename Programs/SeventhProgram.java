import java.util.Scanner;

public class SeventhProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int numb =sc.nextInt();
        int i=1;
        while (i<=10) {
             System.out.println(numb*i);
            i++;
        }
    }
}