import java.util.Random;
import java.lang.Math;
import java.util.Scanner;

public class RandomPassword
{
    public static void main(String[] args)
    {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        String a = ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        char[] aList = a.toCharArray();

        System.out.print("Enter amount of passwords to generate: ");
        int maxPass = input.nextInt();

        System.out.print("Enter length of each generated password: ");
        int length = input.nextInt();

        char[] genPass = new char[length];


        for (int counter = 0; counter < maxPass; counter++)
        {
            for (int i = 0; i < length; i++){
                genPass[i] = aList[(int) Math.round(rand.nextDouble()*(a.length()-1))];
            }
            System.out.println(genPass);
        }

    }
}