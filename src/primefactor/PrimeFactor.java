package primefactor;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    static List<Integer> generate(int n) {
        List<Integer> list = new ArrayList<>();

        while (n %  == 0) {
            list.add(2);
            n = n / 2;
        } 
        
        while (n % 3 == 0) {
            list.add(3);
            n = n / 3;
        } 
        
         if (n > 1) {
            list.add(n);
        }

        return list;
    }

}
