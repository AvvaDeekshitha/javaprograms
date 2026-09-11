import java.util.Scanner;
class demo{
    public static void main(String[] args) {
        scanner sc= new scanner(system.in)
        try{
            System.out.println("enter first num : ");
            int a =sc.nextint();
            System.out.println("enter second num : ");
            int b=sc.nextint();
            result=a/b;
            System.out.println("result is " +result);
        }
        catch(arthematicexception e){
              System.out.println("cannot divide by zero ");
        }
        sc.close();
    }
}
