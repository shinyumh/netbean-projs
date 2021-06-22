/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonenumber;

/**
 *
 * @author melodyhu
 */
public class tools {
    public static String todigit(String str){
        String distring = "";
        int len = str.length();
        char [] a = str.toCharArray();
        for (int i=0;i<len;i++){
            if (Character.isDigit(a[i])){
                Character.valueOf(a[i]);
                distring = distring + a[i];
            }
            else if (Character.isLetter(a[i])){
                char e = Character.toLowerCase(a[i]);
                switch (e){
                    case 'a':
                    case 'b':
                    case 'c':
                        distring = distring + "2";
                        break;
                    case 'd':
                    case 'e':
                    case 'f':
                        distring = distring + "3";
                        break;
                    case 'g':
                    case 'h':
                    case 'i':
                        distring = distring + "4";
                        break;
                    case 'j':
                    case 'k':
                    case 'l':
                        distring = distring + "5";
                        break;
                    case 'm':
                    case 'n':
                    case 'o':
                        distring = distring + "6";
                        break;
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                        distring = distring + "7";
                        break;
                    case 't':
                    case 'u':
                    case 'v':
                        distring = distring + "8";
                        break;
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        distring = distring + "9";
                        break; 
            } 
        }
            else{
                continue;
            }
        }
        return distring;
    }
    
    public static String havedashes(String string){
        char [] c = string.toCharArray();
        String actual = "";
        if (c[0]=='1'){
            for (int i = 0; i<string.length(); i++){
                String x = String.valueOf(c[i]);
                actual = actual + x;
                if (i == 0 || i == 3 || i == 6){
                    actual = actual + "-";
                }
            }
        }
        else {
            for (int i = 0; i<string.length(); i++){
                String x = String.valueOf(c[i]);
                actual = actual + x;
                if (i == 2 || i == 5){
                    actual = actual + "-";
                }
            }
        }
        return actual;
    }
}