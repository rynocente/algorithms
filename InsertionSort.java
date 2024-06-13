import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] data = order(new int[]{5,9,6,1,2,7});
        System.out.println(Arrays.toString(data));
    }


    public static int[] order(int[] data) {
 
        for (int i = 1; i < data.length; i++) {

            int temp_value = data[i];
            int position = i - 1;

            while(position >= 0) {
                if(data[position] > temp_value) {
                    data[position+1] = data[position];
                    position--;
                } else {
                    break;
                }
            }
            data[position+1] = temp_value;
 
        }

        
        return data;

    }


}