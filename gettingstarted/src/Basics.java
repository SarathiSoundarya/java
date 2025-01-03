import java.util.Scanner;
import java.util.Arrays;

public class Basics {
    public static void main(String[] args)
    {
        System.out.println("Hi world!");
        Scanner scanner = new Scanner(System.in); // Use a single Scanner
        stringprocess(scanner);
        double fact=loop(5);
        System.out.println(fact);
        numberdemo(scanner);
        arraydemo(scanner);
        scanner.close();
    }
    static double loop(int count){
        double fact=1;
//        for (int i=2; i<=count; i++){
//            fact=fact*i;
//        }
        while (count>1){
            fact=fact*count;
            count=count-1;
        }
//        do{
//
//        }while()
        return fact;
    }
    static void stringprocess(Scanner scanner){
        //var message="i m excited!";
        //System.out.println(message+"!!");
        String message = "i m excited!";
        System.out.println(message.length()+ " "+ message.toLowerCase()+" "+message.toUpperCase());
        System.out.print("Do you like to continue?");
        String userres= scanner.nextLine();
        System.out.println("Userers: "+userres);
        String s1="Hello";
        String s2= new String("Hello");
        boolean result3=s1.equals(s2);
        boolean result4=s1.equalsIgnoreCase(s2);
        System.out.println(result3);
        System.out.println(result4);
        switch ("True") {
            case "True":
                System.out.println("strings are equal");
                break;
            case "False":
                System.out.println("Strings arent equal");
                break;
            default:
                System.out.println("Value is: "+ result3);

        }

    }
    static int numberdemo(Scanner scanner){
        double math=93.4;
        double science=97.2;
        double avge=(math+science)/2;
        System.out.println("Scores: "+ avge);
        System.out.print("Enter grade exam 1:");
        double gexam=scanner.nextDouble();
        int iexam= (int) gexam;
        if (iexam>=95){
            System.out.println("Passed in distinction!");
        }
        else if((iexam>=50) && (iexam<=95)){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");;
        }
        return 1;
    }
    static void arraydemo(Scanner scanner){
        double[] grades= new double[3];
        for (int i=0;i<grades.length;i++){
            System.out.print("Enter grade "+(i+1)+": ");
            grades[i]=scanner.nextDouble();
        }
        for (double temp: grades){
            System.out.println(temp);
        }
        arraysum(grades);

    }
    static double[] arraysum(double[] grades){
        double sum=0;
        for (double temp: grades) {
            sum += temp;
        }
        double average=(sum/grades.length);
        //sort the grades
        Arrays.sort(grades);
        for (double temp:grades) {
            System.out.println(temp);
        }
        return grades;
        }



}
