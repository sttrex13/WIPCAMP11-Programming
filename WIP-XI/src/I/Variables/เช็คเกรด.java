
package I.Variables;
    import java.util.Scanner;
public class เช็คเกรด {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("กรอกคะแนน : ");
            int n = sc.nextInt();
                
            if(n>=80&&n<100){
                System.out.println("ได้ เกรด A");
            }
            else if(n>=0&&n<40){
                System.out.println("ได้ เกรด D");
            }
            else if(n>=40&&n<60){
                System.out.println("ได้ เกรด C");
            }
            else if(n>=60&&n<80){
                System.out.println("ได้ เกรด B");
            }
            else {
                System.out.println("ERROR");
            }
    }
}
