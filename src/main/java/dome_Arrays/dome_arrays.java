package dome_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class dome_arrays {
    public static void main(String[] args) {
        Integer [] integer = {1,50,-30,52};
        Arrays.sort(integer, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                int result = 0;
                if(o1 - o2 > 0 ){
                    result = -1;
                }else if ( o1 - o2 < 0){
                    result = 1;
                }
                return result;
            }
        });
        System.out.println(Arrays.toString(integer));
    }
}
