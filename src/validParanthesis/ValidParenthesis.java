package validParanthesis;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("[]"));
        System.out.println(isValid("([{}])"));
        System.out.println(isValid("[(])"));
    }

    static boolean isValid(String s) {
        while (s.contains("()") ||
                s.contains("[]") ||
                s.contains("{}")) {

            s = s.replace("()", "")
                    .replace("[]", "")
                    .replace("{}", "");
        }
        return s.isEmpty();
    }
}
