public class LargeNumberArray {
    public static void main(String[] args) {
        int largeArray[]={100,10,20,30,40,50,60};
        int max = largeArray[0];
        for (int i = 1; i <largeArray.length ; i++) {
            if (largeArray[i]> max) {
                max = largeArray[i];

            }

        }
        System.out.println(max);
    }
}
