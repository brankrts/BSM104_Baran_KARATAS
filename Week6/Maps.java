package Week6;

import java.util.*;
import java.io.*;
public class Maps {

	public static void main(String[] args) {
		
		Map<Integer, String> citys = new TreeMap<>();
		
		citys.put(34, "�stanbul");
		citys.put(19, "�orum");
		citys.put(06, "Ankara");
		citys.put(35, "�zmir");
		
		System.out.println(citys);
		System.out.println("�ndexes - Keys " + citys.keySet());
		System.out.println(citys.values());
		System.out.println(citys.get(35));
		
		Map<Integer,TreeSet<String>> citys2 = new TreeMap<Integer, TreeSet<String>>();
		citys2.put(34, new TreeSet<String>());
		citys2.get(34).add("�stanbul");
		citys2.get(34).add("Be�ikta�");
		citys2.get(34).add("Emin�n�");
		citys2.put(06, new TreeSet<String>());
		citys2.get(06).add("Ankara");
		citys2.get(06).add("�ankaya");
		
		System.out.println(citys2);
	}

}
