package com.sandesh;

public class Sum_num_in_string {
    public static void main(String[] args) {
        String str = "abc12xyz34p56";
        int sum = 0;
        String num = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                num += ch; 
            } else {
                if (!num.isEmpty()) {
                    sum += Integer.parseInt(num);
                    num = "";  // Reset after adding
                }
            }
        }

        if (!num.isEmpty()) {
            sum += Integer.parseInt(num);
        }

        System.out.println("Sum: " + sum);
        System.out.println("hii");
    }
}
