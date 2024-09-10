import java.util.Arrays;

public class stringSorting {
    public static void main(String[] args) {
        String srtng[] ={"abc","xyz","pqr"};
        Arrays.sort(srtng);
        System.out.println(Arrays.toString(srtng));
        for (int i=0; i<srtng.length;i++){
            System.out.println(srtng[i]);
        }
        int a []= {1,2,3,4,5,6,7,8,9};
        for (int j = a.length-1;j>=0; j--) {
            System.out.println(a[j]);

        }
    }
}
