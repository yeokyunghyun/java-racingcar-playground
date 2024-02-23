public class StringCalculator {
    public StringCalculator() {
    }

    public static int cal(String s) {
        String delimiter = ":|,";
        if (s.startsWith("//")) {
            delimiter = getExtraDelimiter(s);
            s = changeStringToRegular(s);
        }

        System.out.println(delimiter);
        String splitStr[] = s.split(delimiter);
        int result = 0;
        for (int i = 0; i < splitStr.length; ++i) { //어떻게 delimiter로 나눈 상황에서 for문으로 하나하나 검사를 할 때, indent가 2이상이 되지 않도록 구현하는지.
            checkItsNumber(splitStr[i]);
            result += Integer.parseInt(splitStr[i]);
        }
        return result;
    }

    private static void checkItsNumber(String s) {
        if(s.length() != 1 || s.charAt(0) > '9' || s.charAt(0) < '0') {
            throw new IllegalArgumentException("양수만을 입력하시오.");
        }
    }

    private static String getExtraDelimiter(String s) {
        String delimiter = ",|:";
        int index = s.indexOf("\n");
        for (int i = 2; i < index; ++i) {
            delimiter = delimiter.concat("|" + s.charAt(i));
        }
        return delimiter;
    }
    private static String changeStringToRegular(String s) {
        int index = s.indexOf("\n");
        return s.substring(index + 1, s.length());
    }


}
