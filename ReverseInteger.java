import java.util.Scanner;

public class ReverseInteger {

    public static void main(String[] args) {

        System.out.println("Please enter a number and we will reverse it:");
        Scanner n = new Scanner(System.in);
        int choice = n.nextInt();
        int result = reverse(choice);
        System.out.println(result);

    }

    public static int reverse(int x) {
        int rev = 0;
        while(x != 0){
            System.out.println("This is the new rev variable: " + rev);
            System.out.println("We will add these two together and make them the new rev variable: " +rev*10 +"+"+ x%10);
            rev = rev*10 + x%10;
            System.out.println("We will show x as x/10: " + x/10);
            x = x/10;
            System.out.println("now do the loop again");
        }

        return rev;
    }


}

