public class smallnumber {
    public static void main(String[] args) {
        int [] a = {100,90,80,70};
        int min= a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]<min){
                min=a[i];
            }

        }
        System.out.println("min is"+ min);
    }
}
