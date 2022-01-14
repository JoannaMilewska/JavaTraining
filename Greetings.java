import java.util.Scanner;

public class Greetings {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Hi, what's your name?");
        String name= input.nextLine();
        System.out.println("Have a nice day " + name);

        System.out.println("And how old are you?");
        int age= Integer.parseInt(input.nextLine());
        System.out.println(age+" wow, you are still young "+name );


    }
}
