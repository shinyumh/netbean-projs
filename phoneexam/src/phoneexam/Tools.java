/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phoneexam;

/**
 *
 * @author melodyhu
 */
public class Tools {
    public static int lettersOrDigits(char [] a){
        int count = 0;
        for (int i=0;i<a.length;i++){
            if (Character.isLetterOrDigit(a[i])){
                count++;
            }
    }
        return count;
    }
                         
    public static int lettersOrDigits(String a){
        int count = 0;
        //char[] b = a.toCharArray();
        for (int i=0;i<a.length();i++){
            if (Character.isLetterOrDigit(a.charAt(i))){ // use charAt(); does not need to convert to char
                count++;
            }
    }
        return count;
    }
                         
    public static char [] keepAlphaNumeric(char [] a){
        String count = "";
        for (int i=0;i<a.length;i++){
            if (Character.isLetterOrDigit(a[i])){
                String notspace = String.valueOf(a[i]);
                count = count + notspace;
            }
            else{
                continue;
            }
        }
        char [] recount = count.toCharArray();
        return recount;
    }    

    public static String keepAlphaNumeric(String a){
        String count = "";
        char [] b = a.toCharArray();
        for (int i=0;i<b.length;i++){
            if (Character.isLetterOrDigit(b[i])){
                String notspace = String.valueOf(b[i]);
                count = count + notspace;
            }
            else{
                continue;
            }
        }
        return count;
    }    

    public static String toDigits(char [] a){
        String distring = "";
        for (int i=0;i<a.length;i++){
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

    public static String toDigits(String s){    
        String distring = "";
        int len = s.length();
        char [] a = s.toCharArray();
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
    
    public static String toLetters(char [] a){
        String distring = "";
        for (int i=0;i<a.length;i++){
            if (Character.isLetter(a[i])){
                Character.valueOf(a[i]);
                distring = distring + a[i];
            }
            else if (Character.isDigit(a[i])){
                switch (a[i]){
                    case '2': 
                        distring = distring + "a";
                        break;
                    case '3':
                        distring = distring + "d";
                        break;
                    case '4':
                        distring = distring + "g";
                        break;
                    case '5':
                        distring = distring + "j";
                        break;
                    case '6':
                        distring = distring + "m";
                        break;
                    case '7':
                        distring = distring + "p";
                        break;
                    case '8':
                        distring = distring + "t";
                        break; 
                    case '9':
                        distring = distring + "w";
                        break;
                    default:
                        distring = distring + a[i];
                        break;
            } 
        }
        }
        return distring;
    }          

    public static String toLetters(String s){
        String distring = "";
        char [] a = s.toCharArray();
        for (int i=0;i<a.length;i++){
            if (Character.isLetter(a[i])){
                Character.valueOf(a[i]);
                distring = distring + a[i];
            }
            else if (Character.isDigit(a[i])){
                switch (a[i]){
                    case '2':
                        distring = distring + "a";
                        break;
                    case '3':
                        distring = distring + "d";
                        break;
                    case '4':
                        distring = distring + "g";
                        break;
                    case '5':
                        distring = distring + "j";
                        break;
                    case '6':
                        distring = distring + "m";
                        break;
                    case '7':
                        distring = distring + "p";
                        break;
                    case '8':
                        distring = distring + "t";
                        break; 
                    case '9':
                        distring = distring + "w";
                        break;
                    default:
                        distring = distring + a[i];
                        break;
            } 
        }
        }
        return distring;
    }
}
