import java.util.ArrayList;
import java.util.Scanner;

public class AlphabetSoup {

    public static void main(String[] args){

        //input console
        Scanner input;
        InputStringImpl inputClass = new InputStringImpl();
        String inputtedStr = null;
        int no = 1;
        ArrayList<DataHold> reportData = new ArrayList<>();
        do{
            input = new Scanner(System.in);
            System.out.println("Type exit to finish your input ");
            System.out.println("[" +no +"]" +" Please input your string ");
            inputtedStr = input.nextLine();
            if(inputtedStr.toString().trim().length() > 0 && !inputtedStr.toString().trim().toLowerCase().equals("exit")){
                if(inputtedStr.matches("^[a-zA-Z]*$")){
                    DataHold dataHold = new DataHold();
                    dataHold.setNumber(no);
                    dataHold.setStrOld(inputtedStr.toString());
                    dataHold.setStrNew(inputClass.inputReverse(inputtedStr));
                    reportData.add(dataHold);
                    no++;
                }else{
                    System.out.println("Please try again, only legal alphabet is allowed ");
                }

            }

        }while(!inputtedStr.toLowerCase().trim().equals("exit"));

        //display result
        System.out.println("***************Report input reverse string*****************");
        for (int x=0;x<reportData.size();x++){
            System.out.format("[ %2d ] the old string before converted: %s ===> after: %s", reportData.get(x).getNumber(), reportData.get(x).getStrOld(), reportData.get(x).getStrNew());
            System.out.println("");
        }
        System.out.println("***************End input reverse string*****************");

    }
}
