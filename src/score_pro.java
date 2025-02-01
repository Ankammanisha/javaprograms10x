import java.util.Scanner;
public class score_pro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the score");
        int score=sc.nextInt();
        String grade =((score>=90&&score<=90)?"A grade": (score>=80&&score<=89)?"B grade":(score>=70&&score<=79)?"C grade":(score>=60&&score<=69)?"D grade":(score>=0&&score<=50)?"F grade":"Failed");
        System.out.println(grade);
    }
}
