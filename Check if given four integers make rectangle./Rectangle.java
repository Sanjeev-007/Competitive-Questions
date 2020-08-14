import java.util.*;
import java.lang.*;

// This is one Way of solving you can solve it in different way.

public class Rectangle {

	public static void main(String args[]) {
		
		List<Integer> lst=new ArrayList();
		Set<Integer> set=new HashSet();
		lst.add(1);
		lst.add(1);
		lst.add(2);
		lst.add(2);
		set.addAll(lst);
  
		if(set.size()==2) {
			int y=0;
			for(int x: set) {
				if(Collections.frequency(lst, x)==2) {
					y++;
				}
			}
			if(y==2) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			
		}else {
			System.out.println("No");
		}
	}

}
