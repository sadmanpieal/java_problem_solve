public class missingNumber {
    public static void main(String[] args) {
        int ar[]={1,2,4,5,6,7};
        int len = ar.length+1;
        int arraysum =0;
        int totalsum = len* (len+1)/2;
        for (int num:ar){
            arraysum+= num;
        }
        int missingNum= totalsum-arraysum;
        System.out.println(missingNum);
    }
}
