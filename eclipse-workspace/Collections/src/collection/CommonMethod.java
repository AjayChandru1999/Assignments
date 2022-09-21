package collection;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CommonMethod {

	public static void main(String[] args) {
		
		
		List<Integer> l = new LinkedList();
		l.add(null);
		l.add(20);
		l.add(40);
		l.add(50);
		l.add(20);
		l.add(50);
		System.out.println(l);
		
		Set<Integer> s = new LinkedHashSet();
		
		s.addAll(l);
		System.out.println(s);
		
		System.out.println(l.size() - s.size());
		
		s.retainAll(l);
		System.out.println(s);
		
		s.equals(l);
		System.out.println(s);
		
		s.removeAll(l);
		System.out.println(s);
	}
}
