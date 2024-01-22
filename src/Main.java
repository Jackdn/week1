import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main{
    public static void main(String[] args){
        System.out.println("hello world");
        int age=17;
        double gpa= 3.8;
        boolean isRaining=false;
        System.out.println(age+"|"+gpa+"|"+isRaining);
        String city="Columbus";
        System.out.println(city);
        System.out.println(city.toUpperCase());


        int dailyHighs[]={50,60,70,80,90};
        System.out.println(dailyHighs[0]);
        for(int i=0; i<dailyHighs.length; i++){
            System.out.println("joseppi");
        }

        Scanner input= new Scanner(System.in);
        System.out.println("what is your name?");
        String name =input.nextLine();
        System.out.println(name.toLowerCase());
    }
}