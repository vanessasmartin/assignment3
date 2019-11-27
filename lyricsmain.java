package lyrics;
import java.util.*;
import java.util.Map.Entry;
import java.io.*;

	
	

public class lyrics {
	

	

	public static void main (String [] args) throws FileNotFoundException {
		Hashtable<String, Integer> wordTable = new Hashtable < String, Integer>();
		Scanner scan = new Scanner(new File("C:\\Users\\Vanessa\\Desktop\\stopwords.txt"));
		String readStopWords; 

		BufferedReader reader = null;
		String [] stopWords = new String[200];
		
		while(scan.hasNext()) {
			readStopWords = scan.next();
		for (int i = 0; i < 200; i++) {
			stopWords[i] = readStopWords;
			
			
		}
		}
		
		
		
		try
	        {
	            //Creating BufferedReader object
	             
	            reader = new BufferedReader(new FileReader("C:\\Users\\Vanessa\\Desktop\\lyrics.txt"));
	             
	            //Reading the first line into currentLine
	             
	            String currentLine = reader.readLine();
	             
	            while (currentLine != null)
	            {   
	                //splitting the currentLine into words
	                 
	                String[] words = currentLine.toLowerCase().split(" ");
	                 
	    
	                 
	                for (String word : words)
	                {
	                    //if word is already present in wordCountMap, updating its count
	                     
	                    if(wordTable.containsKey(word))
	                    {   
	                    	wordTable.put(word, wordTable.get(word)+1);
	                    }
	                     
	                    //otherwise inserting the word as key and 1 as its value
	                    else
	                    {
	                    	wordTable.put(word, 1);
	                    }
	                }
	                 
	                //Reading next line into currentLine
	                 
	                currentLine = reader.readLine();
	            }
	    		
	            //prints words in hashtable
	            System.out.println(Arrays.asList(wordTable));

	             
	            //Getting the most repeated word and its occurrence
	             
	            
	        } 
	        catch (IOException e) 
	        {
	            e.printStackTrace();
	        }
	       
	        }
	
	    }   
	




