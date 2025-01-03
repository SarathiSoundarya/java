import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
    List<String> names=Arrays.asList("Soundarya", "John","Sharang","vatsa");
    List<String> result= names.stream().filter(s->s.length()<5)
            .map(String::toUpperCase)
            .sorted()
            .collect(Collectors.toList());

    for(String name:result){
        System.out.println(name);
    }
    }
}
