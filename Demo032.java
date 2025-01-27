import java.util.*;
class HashSetDemo1 {
	void HSetMethod() {
		HashSet<Object> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Keerthi");
        System.out.println("hashu");
        System.out.println("Abhi");
        System.out.println("Radhika");
        System.out.println("Raju");
        String a = sc.nextLine();
		hashSet.add(a);
		System.out.println(hashSet);		
		for(Object x: hashSet) {
			System.out.println(x);
		}
	}
}


public class Demo032 {
	public static void main(String[] args) {
		HashSetDemo1 obj = new HashSetDemo1();
		obj.HSetMethod();
	}
}