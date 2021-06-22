/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ride;

/*
ID: your_id_here
LANG: JAVA
TASK: test
*/
import java.io.*;
import java.util.*;
public class ride {
    public static void main(String[] args) throws IOException {

    BufferedReader f = new BufferedReader(new FileReader("test.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
						  // Get line, break into tokens
    int i1 = Integer.parseInt(st.nextToken());    // first integer
    int i2 = Integer.parseInt(st.nextToken());    // second integer
    out.println(i1+i2);                           // output result
    out.close();                                  // close the output file
  }
}
    }
    
}
