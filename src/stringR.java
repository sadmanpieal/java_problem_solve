public class stringR {
    public static void main(String[] args) {
        String sad = " this is sadman";
        String re=" ";
        for (int i = 0; i <sad.length(); i++) {

            re=sad.charAt(i)+re;

        }
        System.out.println(re);
        int x = sad.split(" ").length;
        System.out.println(x);
    }
}
