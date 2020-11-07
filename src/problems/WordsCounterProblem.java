/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * @author Nicolás Penagos Montoya
 * nicolas.penagosm98@gmail.com
 **~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class WordsCounterProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		try {
			
			String line = br.readLine();
			String[] parts =line.split(" ");
			
			HashMap<String, Integer> words = new HashMap<String, Integer>();
			
			long t0 = System.currentTimeMillis();
			for(int i = 0; i < parts.length; i++) {
				
				String current = parts[i].toLowerCase();
				
				char lastChar = current.charAt(current.length()-1);
				String word = ( lastChar == ',' || lastChar == '.') ? current.substring(0, current.length()-1):current;
				
				if(words.containsKey(word)) {
					
					int counter = words.get(word);
					counter++;
					words.put(word, counter);
					
				}else {
					words.put(word, 1);
				}
				
			}
			
			
			
			words.forEach( (String k, Integer v)-> System.out.println(k + ": " + v) );
			
			long t1 = System.currentTimeMillis();		

			System.out.println("\nRun time in millis: "+(t1-t0));
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}