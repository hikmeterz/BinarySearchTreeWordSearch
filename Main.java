import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		/*Scanner inputStream=null;
		try {
			
			inputStream = new Scanner(new File(args[1]));//Exception atma durumu:Eger oyle bir dosya yoksa.
		}catch(FileNotFoundException e){
			System.out.println("ERROR.");
			System.exit(0);
			
		}
		String s;
		BinarySearchTree bst = new BinarySearchTree();
		while(inputStream.hasNext()) {
			
			s = inputStream.next();
			s=s.toLowerCase();
			s=s.replaceAll("\\p{Punct}","");
			bst.add(s);
			s="";
		}
		
		inputStream.close();
		
		
		bst.traverseInOrderandPrintKthElement(bst.getRoot(),Integer.parseInt(args[3]));
		*/
		
		//Yukarisi ile yaptigimda hata verdi.Ben de buffered reader ile okumaya calistim.
		
		BufferedReader objReader = null;
		try{
			String satir;
		 
			objReader = new BufferedReader(new FileReader(args[1]));
		 
			int kelime_Sayisi=0;
			String kelimelerSatir="";
			while ((satir = objReader.readLine()) != null){
				//System.out.println(satir);
				kelimelerSatir=satir;
			}
			//System.out.println(kelimeler);
			kelime_Sayisi=boslukSay(kelimelerSatir);
			String[] words = new String[kelime_Sayisi];
			BinarySearchTree bst = new BinarySearchTree();
			words=kelimeleri_doldur(words,kelimelerSatir);
			
			for(int i=0;i<words.length;i++) {
				bst.add(words[i]);
				
			}
			bst.traverseInOrderandPrintKthElement(bst.getRoot(),Integer.parseInt(args[3]));
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
			    if(objReader != null)
			    	objReader.close();
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	public static int boslukSay(String s){
		int numberOfWords=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ')
				numberOfWords++;
		}
		numberOfWords++;
		return numberOfWords;
	}
	
	
	public static String[] kelimeleri_doldur(String[] words,String kelimeler) {
		
		words = kelimeler.split("\\s+");
		for (int i = 0; i < words.length; i++) {
			words[i]=words[i].toLowerCase();
			words[i]=words[i].replaceAll("\\p{Punct}","");
			words[i] = words[i].replaceAll("[^\\w]", "");
		}
		return words;
		
	}
	
}
