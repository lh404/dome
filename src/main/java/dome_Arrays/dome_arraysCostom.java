package dome_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class dome_arraysCostom {

    public static void main(String[] args) {
        Integer[] integer = {1,-2,20,3,2};
        bubbleStore(integer,new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return  o1 - o2;
            }
        } );
        System.out.println(Arrays.toString(integer));
    }


    private static void bubbleStore(Integer [] arr, Comparator<Integer> c){
        int num = 0;
        if(c.compare(arr[0] , arr[1]) > 0 ){
        for(int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 -i; j++){
                if( arr[j] < arr[j + 1]){
                    num = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = num;
                }
                }
            }
        }else {
            for(int i = 0; i < arr.length - 1; i++){
                for (int j = 0; j < arr.length - 1 -i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        num = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = num;
                    }
                }
            }
        }
    }
}
