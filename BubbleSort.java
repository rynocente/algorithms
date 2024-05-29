import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        
        int[] data = order(new int[]{5,9,6,1,2,7});
        System.out.println(Arrays.toString(data));

    }

    static int[] order(int[] data) {

        int unsortedUntilIndex = data.length - 1;
        boolean sorted = false;

        while(!sorted) {
            sorted = true;
            for (int i = 0; i < unsortedUntilIndex; i++) {
                if(data[i] > data[i+1]) {                    
                    int temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                    sorted = false;
                }
            }
            unsortedUntilIndex -= 1;

        }

        return data;

    }


}
