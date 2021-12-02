import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
    int[] zahlen = {267,56,78,23,4,6,7,8,2,1,3,45,6,7,2};

    System.out.print(Arrays.toString(bubbleSort(zahlen)));


    }


    public static int[] bubbleSort(int[] array){

        int l = array.length;

        for(int i = 0; i<l; i++){
            for(int j = i+1; j<l; j++){

                if (array[i] > array[j]){
                    int x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }

            }
        }

        return array;
    }



}
