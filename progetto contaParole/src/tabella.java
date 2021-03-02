import java.util.ArrayList;
public class tabella {
	ArrayList<WC> t;
	
	public tabella() {
		t= new ArrayList<WC>();
	}
	
	public void add(String w) {
		for(int i=0; i<t.size(); i++) {
			
			if (w.equals(t.get(i).w)) {
				t.get(i).c ++;
				return;
			}
		}
		t.add(new WC(w));
	}
	public String getMostFrequest() {
		int maxi =0;
		for(int i=0; i<t.size(); i++) {
			if(t.get(i).c>t.get(maxi).c)
				maxi=i;
		}
		return t.get(maxi).w;
	}
}
