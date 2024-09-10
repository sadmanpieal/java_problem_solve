import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class arrayaverage {
    public static void main(String[] args) {
        int [] age ={10,20,30,40,50,60,70};
        Arrays.sort(age);

        int sum =0;
        int average =0;
        int length = age.length;
        for (int i =0; i< age.length;i++){
            sum +=age[i];

        }
        average = sum/length;

        System.out.println(average);
        int search_element= 30;
        for(int i=0; i<age.length;i++){
            if(age[i] ==search_element){
                System.out.println("element found5");
               // break;

            }
        }
        for (int i = 0; i <age.length ; i++) {
            if(age[i]>20){
                System.out.println(age[i]);
            }

        }
        String Sa = "hello World";
        String Sd = " ";
        for (int i = 0; i <Sa.length() ; i++) {
            Sd= Sa.charAt(i)+Sd;
        }
        System.out.println(Sd);
    }
}
