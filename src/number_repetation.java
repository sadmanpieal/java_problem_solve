import java.util.Arrays;

public class number_repetation {
    public static void main(String[] args) {
        int name[] = {1,2,3,1,2,1,1,1,1,1,1,1,1,1,1};
        int numb = 1;
        int count =0;
        Arrays.sort(name);
        for (int i = 0; i <name.length ; i++) {
            System.out.println(name[i]);

        }
        System.out.println(name);
       // for (int i =0;i<name.length;i++) {
         //   if (numb == name[i]) {
           //     count++;
           // }
        //}
        System.out.println(count);
        for (int j = 0; j <name.length ; j++) {
            count++;

        }
        System.out.println("the variable are"+ count);
    }
}
