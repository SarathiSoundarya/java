import java.util.ArrayList;
import java.util.function.Predicate;

public class Lambdas {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Eric");
        names.add("Melissa");
        names.add("Sou");
        for (String name:names){
            System.out.println(name);
        }
        names.forEach((n)-> System.out.println(n));
        Greetings gre = (s) ->{ //System.out.println("Hello s!");
             return "Hello "+s; };
        String greet=gre.greetings("Sou");
        System.out.println(greet);

        StringCompare stc=(s1,s2)->{if (s1.length()>s2.length()) {return s1;
        }
        return s2;};
        String longer=stc.compare("Soundarya", "Sharang");
        System.out.println(longer);

        Predicate<Integer> lessthan100=(i)->(i<100);
        boolean res=lessthan100.test(55);
        System.out.println(res);


    }
}
@FunctionalInterface
interface Greetings{
    String greetings(String s);
}
interface StringCompare{
    String compare(String s1, String s2);
}