import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		String[] parole= new String[] {"a","b","d","c","b","d","d", "a" };
				
	//tabella t = new tabella() ;
		
		/*for(int i=0; i<parole.length; i++)
			t.add(parole[i]);
		System.out.println(t.getMostFrequest());
	}*/
		
		HashMap<String,Integer> t = new HashMap<String, Integer>();
		for (String p: parole) {
			Integer c = t.get(p); // ritorna il contatore
			if (c== null) 
				t.put(p, 1);
			else
				t.put(p, c+1); // genero la tabella con il contatore
		}
			String mf="";
			int c =0;
			for(String w: t.keySet()) // keySet() mi restituisce tutte le chiavi della tabella				
			{
				if (t.get(w)>c) {
					c= t.get(w);
					mf= w;
				}
			}
			System.out.println(mf);
		}
		
		
		}
		
		
		

