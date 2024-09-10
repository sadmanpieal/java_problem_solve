public class practise2 {
    public static void main(String[] args) {
        //String s = "one two three four";
        //int counting  =  s.split(" ").length;
        //System.out.println(counting);
        String s = "hello how are you";
        String rs= "";
        for (int i =0; i <s.length();i++){
            rs =  s.charAt(i)+ rs;

        }
        System.out.println(rs);
    }
}
