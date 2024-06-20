import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Bài 1
        System.out.println(getFirstNoRepeatCharUseFor("gibblegabbler"));
        System.out.println(getFirstNoRepeatCharUseList("gibblegiabbaler"));

        // Bài 2
        String[] strInput = {"Red", "Green", "Orange", "White", "Black", "Green"};
        System.out.println(Arrays.toString(sortListString(strInput)));
    }

    public static String getFirstNoRepeatCharUseFor(String inputStr) {

        String firstChar = "";
        for(int i = 0; i < inputStr.length() - 1; i++) {
            firstChar = String.valueOf(inputStr.charAt(i));
            for(int j = i + 1; j < inputStr.length(); j++) {
                if(firstChar.equals(String.valueOf(inputStr.charAt(j)))) {
                    firstChar = "";
                    break;
                }
            }

            if(!firstChar.isEmpty()) break;

        }

        return firstChar;
    }

    public static String getFirstNoRepeatCharUseList(String inputStr) {
        List<String> listChars = new ArrayList<String>();

        if(inputStr.isEmpty()) return "have no string";

        for(int i = 0; i < inputStr.length(); i++) {
            // Nếu chưa xuất hiện thì add vào list.
            if(!listChars.contains(String.valueOf(inputStr.charAt(i)))) {
                listChars.add(String.valueOf(inputStr.charAt(i)));
            } else {
                // Nếu đã xuất hiện thì remove đi.
                listChars.remove(String.valueOf(inputStr.charAt(i)));
            }
        }

        // nếu ở không là null hoặc là rỗng thì trả về rỗng
        if(listChars.isEmpty() || Objects.equals(listChars.get(0), "")) {
            return "no repeats";
        }

        return listChars.get(0);
    }

    public static String[] sortListString(String[] inputArrStr) {

        for(int i = 0; i < inputArrStr.length - 1; i++) {
            for(int j = i + 1; j < inputArrStr.length; j++) {
                String strAtI = inputArrStr[i];
                String strAtJ = inputArrStr[j];
                int compareResult = strAtI.compareTo(strAtJ);
                if(compareResult > 0) {
                    inputArrStr[i] = strAtJ;
                    inputArrStr[j] = strAtI;
                }
            }
        }

        return inputArrStr;
    }




}
