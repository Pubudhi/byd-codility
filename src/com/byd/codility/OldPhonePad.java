package com.byd.codility;

public class OldPhonePad {
    public String oldPhonePad(String data) {
        String[][] phonePadSimulator = {
                {" "},
                {"&", "'", "("}, {"A", "B", "C"}, {"D", "E", "F"},
                {"G", "H", "I"}, {"J", "K", "L"}, {"M", "N", "O"},
                {"P", "Q", "R", "S"}, {"T", "U", "V"}, {"W", "X", "Y", "Z"}
        };

        if (data.charAt(0) == '#') {
            return "";
        }

        if (data.charAt(data.length() - 1) != '#') {
            data += "#";
        }
        StringBuilder message = new StringBuilder();
        char prevChar = data.charAt(0);
        int count = 0;
        int right = 1;

        while (right < data.length()) {

            if (data.charAt(right) == '*' && prevChar == '*') {
                if (message.length() > 0) {
                    message.deleteCharAt(message.length() - 1);
                }
            } else if (data.charAt(right) == '*') {
                prevChar = data.charAt(right + 1);
                count = 0;
                right++;
            } else if (data.charAt(right) == prevChar) {
                count++;
                prevChar = data.charAt(right);
            } else {
                if (prevChar != ' ' && prevChar != '*') {
                    int simulatorString = Character.getNumericValue(prevChar);
                    message.append(phonePadSimulator[simulatorString][count]);
                }
                count = 0;
                prevChar = data.charAt(right);
            }
            right++;
        }
        return message.toString();
    }
}
