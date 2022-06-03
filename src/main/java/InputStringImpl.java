import java.util.Arrays;

public class InputStringImpl implements  InputString {


    @Override
    public String inputReverse(String str) {
        String [] arrStr = str.split("");
        //sorting
        Arrays.sort(arrStr);
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<arrStr.length;i++){
            sb.append(arrStr[i]);
        }
       return sb.toString();
    }
}
