package com.olaemy;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;


public class Main {

    public static void main(String[] args) {
        String[] text = {"find", "the","longest","string"};
        System.out.println(searchLong1(text));
        String te="poppopp";
        System.out.println(pal2(te));
        String primer=" Какая бяка ты бяка бяка!";
        String test="This is a test string";
        System.out.println(change3(primer));
        System.out.println(revers5(test));
        System.out.println(count4(primer,"бяка"));
    }
    static String searchLong1(String[] text){
        String max="";
        for (String str:text){
            if(str.length()>max.length()){
                max=str;
            }
        }
        return max;
    }
    static Boolean pal2(String test){
        Boolean flag=false;
        for (int i=0; i<test.length();i++){
            if (test.charAt(i)==test.charAt(test.length()-1-i)){
                flag=true;
            }
            else{
               flag=false;
               break;

            }
        }
        return flag;

    }
    static String change3(String text){
        return text.replace("бяка","[вырезано мцензурой]");
    }

    static int count4(String text,String text2){
        StringUtils su=new StringUtils();
        return su.countMatches(text,text2);
    }

    static String revers5(String text){
        String fin="";
        Scanner scanner= new Scanner(text);
        while (scanner.hasNext()){
            fin=fin+" " + new StringBuffer(scanner.next()).reverse();

        }
        return fin;
    }

}
