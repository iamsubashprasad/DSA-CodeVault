package SDET;
import java.util.*;

public class ElelementOccurence_Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,1,2,2,3,3,4,5,5};
		Map<Integer,Integer>map=new HashMap<>();
		
		for(int i= 0;i<num.length;i++) {
			map.put(num[i],map.getOrDefault(num[i], 0)+1);
		}
		
		System.out.println(map);
		
		for(Map.Entry<Integer>())

	}

}
