package com.societe._5_strings;

public class BalancedBrackets {

    public static void main(String... args) {
        String[] strings = new String[]{
                null,
                "",
                "   ",
                "[]{}",
                "(({}{}))", //scoatem {} -> () -> "" -> balanced ??? -> true
                "{{[({})]}}",
                "[[{{]]}}",
                "{}{}{}{}["};

        for (String string : strings) {
            System.out.println("isBalanced: " + string + " --> " + isBalanced(string));
        }

        String s1 = "john";
        String s2 = new String("john");
        System.out.println(s1.equals(s2)); //egalitatea cu equals
        String s3 = s2;
        System.out.println(s3 == s2);
    }

    private static boolean isBalanced(String str) {
        if (str == null || str.isBlank()) return false;

//        str.startsWith() | str.endsWith()
        while (str.contains("{}") ||
                str.contains("()") ||
                str.contains("[]")) {
            str = str.replaceAll("\\{\\}", "")
                     .replaceAll("\\[\\]", "")
                     .replaceAll("\\(\\)", "");
        }
        return str.isEmpty();
    }
}
