import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] data = order(new int[]{5,9,6,1,2,7});
        System.out.println(Arrays.toString(data));
    }


    /**
     * Selection sort takes roughly half of N² steps, O(N²/2) => O(N²)
     * @param data
     * @return array
     */
    public static int[] order(int[] data) {

        for (int i = 0; i < data.length - 1; i++) {
            int theLowestIndex = i;
            for (int j = i+1; j < data.length; j++) {
                if (data[j] < data[theLowestIndex]) {
                    theLowestIndex = j;
                }    
            }
            if(i != theLowestIndex) {
                int temp = data[i];
                data[i] = data[theLowestIndex];
                data[theLowestIndex] = temp;
            }
        }

        return data;

    }


}