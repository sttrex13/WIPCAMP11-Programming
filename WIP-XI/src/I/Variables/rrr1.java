
package I.Variables;

import java.util.Scanner;

public class rrr1 {
    public static void main(String[] args) {
        double h,a,m,sum,max;
        Scanner sc = new Scanner(System.in);
        System.out.print("ค่าอาหาร : ");
        h = sc.nextInt();
         System.out.println("มีบัตรสมาชิกมั้ย : ");
        boolean x = sc.nextBoolean();
         if(x == true){
             a=(h*5)/100;
             sum=h-a;
             System.out.println("ค่าอาหารที่ต้องจ่าย"+sum);
             System.out.println("ต้องการจ่ายเงินสดมั้ย : ");
             boolean v = sc.nextBoolean();
             if(v == true){
                m=(sum*10)/100; 
                max=sum-m;
                System.out.println("ค่าอาหารที่ต้องจ่าย"+max);
             }
         }
         
             
    }
  
}
