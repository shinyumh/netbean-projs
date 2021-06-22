/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parseline;

/**
 *
 * @author melodyhu
 */
public class tools {
    public static int letters(char [] a){
        int count = 0;
        for (int i=0; i<a.length; i++){
            if (Character.isLetter(a[i])) //call static method
                count++;
        }
        return count;
    }
    
    public static int numbers(char [] a){
        int count = 0;
        for (int i=0;i<a.length;i++){
            if (Character.isDigit(a[i])){
                count++;
            }
    }
        return count;
    }
    
    public static int white(char [] a){
        int count = 0;
        for (int i=0;i<a.length;i++){
            if (Character.isWhitespace(a[i])){
                count++;
            }
    }
        return count;
    }
    
    public static int punctuation(char [] a){
        int count = 0;
        for (int i=0;i<a.length;i++){
            if (Character.isLetterOrDigit(a[i])){
                continue;
            }
            else if(Character.isWhitespace(a[i])){
                continue;
            }
            else{
                count++;
            }
    }
        return count;
    }
    
    public static String keepeverything(char [] a){
        String count = "";
        for (int i=0;i<a.length;i++){
            if (Character.isWhitespace(a[i])){
                continue;
            }
            else{
                String notspace = String.valueOf(a[i]);
                count = count + notspace;
            }
        }
        return count;
    }
    
    public static String deletejunk(char [] a){
        String count = "";
        for (int i=0;i<a.length;i++){
            if (Character.isWhitespace(a[i])){
                String notspace = String.valueOf(a[i]);
                count = count + notspace;
            }
            else if (Character.isLetterOrDigit(a[i])){
                String notspace = String.valueOf(a[i]);
                count = count + notspace;
            }
            else{
                continue;
            }
        }
        return count;
    }
    
    /*public static String replacespaces(char [] a){
        for (int i=0;i>a.length;i++){
            if (Character.isWhitespace(a[i])){
                String str = String.valueOf(a[i]);
                count = str.replaceAll;
            }
        }
    }*/
}
