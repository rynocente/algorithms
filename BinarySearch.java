public class BinarySearch {

    public static void main(String[] args) {
    
        int search = binarySearch(new int[]{3,4,5,6,7,8,9}, 9);
        System.out.println("searchValue at index: " + search);
        
    }

    private static int binarySearch(int[] array, int searchValue) {

        int lowerBound = 0;
        int upperBound = array.length - 1;
        int index = -1;

        while(lowerBound <= upperBound) {
             
            int midPoint = (upperBound + lowerBound) / 2;
            int valueAtMidPoint = array[midPoint];

            if(valueAtMidPoint == searchValue) {
                index = midPoint;
                break;
            } else if(searchValue < valueAtMidPoint) {
                upperBound = midPoint - 1;
            } else if(searchValue > valueAtMidPoint) {
                lowerBound = midPoint + 1;
            }

        }

        return index;

    }
    
}
