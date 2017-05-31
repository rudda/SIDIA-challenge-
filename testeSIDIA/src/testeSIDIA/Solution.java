package testeSIDIA;

public class Solution {
	
	public String removeDoubleCharecters(String s){
		
		char currentChar;
		int nextIndex;
		int endIndex=0;
		int startIndex=0;
		String aux = "";
		
		
		for(int i=0; i<s.length(); i++){
			
			nextIndex = i+1 < s.length() ? i+1 : i-1;
			
			if( ! (s.charAt(i) == s.charAt(nextIndex)) ){
				
				aux+= s.charAt(i);
				
			}
			
			
		}
		
		return aux;
	}

	
	public String  marcarSentenca(String s){
		
		String aux="";
		
		for(int i=0; i<s.length(); i++){
			
			if( s.charAt(i)== '.' || s.charAt(i)== '!' || s.charAt(i)== '?' || i== s.length()-1){
				
				aux+="#";
			}else{
				aux+= s.charAt(i);
			}
			
		}
		
		return aux;
		
	}

	public int countStencas(String s){
		
		int count=0;
		
		for(int i=0; i<s.length(); i++){
			
			if(s.charAt(i)== '#'){
					
				count++;
			}
			
		}
		return count;
	}
	
	
	public int calcularWords(String s){
		
		String aux = s.trim();
		
		int words=0;
		
		for(int i=0; i<aux.length(); i++){
			
			if(aux.charAt(i) == ' ' || aux.charAt(i) == '.' || aux.charAt(i) == '!' || aux.charAt(i) == '?' || i== aux.length()-1 ){

				words++;
			
			}
	
		}
		
		return words;
		
	}

	
	public int solution(String s){
	
		String aux = removeDoubleCharecters(s);
		aux = marcarSentenca(aux);
		int index = countStencas(aux);
		int currentCount=0;
		int MaxWordsBySentence=0;
		
		int start=0;
		
		for(int i=0; i< index; i++){
			
			String sentence = aux.substring(0, aux.indexOf("#")); 
			currentCount = calcularWords(sentence);
			
			if(currentCount > MaxWordsBySentence){
				MaxWordsBySentence = currentCount;
			}
			aux = aux.substring(aux.indexOf("#")+1);
					
			
		}
		
		
	return MaxWordsBySentence;	
	}
		
		
	
}
