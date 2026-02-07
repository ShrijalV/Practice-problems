package substring;

public class Substring {
    static int length(String s) {
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            String temp = "";

            for (int j = i; j < s.length(); j++) {
                if (temp.contains("" + s.charAt(j)))
                    break;
                temp += s.charAt(j);
            }
            max = Math.max(max, temp.length());
        }
        return max;
    }

    public static void main(String[] args) {

        Substring obj= new Substring();

        System.out.println(obj.length("zxyzxyz")); // 3
        System.out.println(obj.length("xxxx"));   // 1
    }

}
