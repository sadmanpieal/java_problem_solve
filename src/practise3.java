import java.util.Arrays;

public class practise3 {
    public static void main(String[] args) {
    int []a ={1,2,3,4,5,6,7};
    int sum =0; //sum of strings
    for (int i =0; i< a.length;i++){
        sum +=a[i];
    }
        System.out.println(sum);
    String []s ={"sadman","sakib","pieal"};// string sort
    Arrays.sort(s);
        for (int i = 0; i <s.length ; i++) {
            System.out.println(s[i]);

        }


    }
}
