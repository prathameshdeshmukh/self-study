

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.junit.Assert;

import com.metrixline.metrixtrack.services.common.model.Constants;
import com.metrixline.metrixtrack.services.graphservice.Direction;
import com.metrixline.metrixtrack.services.graphservice.GraphServiceException;
import com.metrixline.metrixtrack.services.graphservice.Node;
import com.metrixline.metrixtrack.services.graphservice.NodeImpl;
import com.metrixline.metrixtrack.services.graphservice.RelationTypeImpl;
import com.metrixline.metrixtrack.services.graphservice3.GraphService;
import com.metrixline.metrixtrack.services.graphservice3.GraphServiceImpl;

abstract class AbstractBook {
	public String name;
}
interface Sleepy {
	public String name = "undefined";
	public void x();
}
class Book extends AbstractBook implements Sleepy {
	public Book(String name) {
//		Sleepy.name = name; // LINE A
	}
	public static void main(String []args) {
		AbstractBook philosophyBook = new Book("Principia Mathematica");
		System.out.println("The name of the book is " + philosophyBook.name); // LINE B
	}
	public void x() {
		// TODO Auto-generated method stub
		
	}
}


class Outer {
	static class Inner {
		public final String text = "Inner";
	}
}

class SimpleCounter<T> {
	private static int count = 0;
	public SimpleCounter() {
		count++;
	}
	static int getCount() {
		return count;
	}
}

public class Test {

	public static void main(String []args) throws GraphServiceException {
		Scanner scanner = new Scanner(System.in);
//		String cipher  = scanner.next();
		String cipher  = "SECRET";
		cipher = validateCipher(cipher);
		scanner.close();
		char[] cipherLetters = cipher.toCharArray();
		char[] alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		char[] newAlphabets = getNewAlphabets(cipher.toCharArray(),alphabets); 
		char[][] charactersMatrix = new char[(int) Math.ceil(Double.valueOf(alphabets.length)/Double.valueOf(cipherLetters.length))][cipherLetters.length];
		
		for(int i=0;i<charactersMatrix.length;i++){
			for(int j=0;j<charactersMatrix[i].length;j++){
//				charactersMatrix[i][j]
			}
		}
		System.out.println("END");
		/*GraphService graphService = new GraphServiceImpl("pg_MT");
		Node dbnode = graphService.getNodeById("1cc6cd34-8ece-4ceb-9c1d-cc7dcfeb20d6"); //(nodeId);
//		graphService.deleteNodeById("924219ad-7172-40f0-908f-fbb2df4e3c25");
		dbnode.setName("Regions");
		graphService.updateNode(dbnode);
		int s = 0 ;
		//		String s = "";
		System.out.println(new Outer.Inner().text);
		System.out.println(++s + s++ + ++s +s);
		List list1 = new ArrayList<>(Arrays.asList(1, "two", 3.0));
		List list2 = new LinkedList<>(Arrays.asList(new Integer(1), new Float(2.0F), new Double(3.0))); // TWO
		list1 = list2; // THREE
		for(Object element : list1) {
			System.out.print(element + " ");
			}
		
		Deque<Integer> deque = new ArrayDeque<>();
		deque.addAll(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println("The removed element is: " + deque.remove());
		
		
		SimpleCounter<Double> doubleCounter = new SimpleCounter<Double>();
		SimpleCounter<Integer> intCounter = null;
		SimpleCounter rawCounter = new SimpleCounter(); // RAW
		System.out.println("SimpleCounter<Double> counter is "
		+ doubleCounter.getCount());
		System.out.println("SimpleCounter<Integer> counter is " + intCounter.getCount());
		System.out.println("SimpleCounter counter is " + rawCounter.getCount());
		
		String pattern = "a*b+c{3}";
		String []strings = { "abc", "abbccc", "aabbcc", "aaabbbccc" };
		for(String str : strings) {
		System.out.print(Pattern.matches(pattern, str) + " ");
		}*/
		
		//		System.out.println(s);
		//		System.out.println(++s);
		//		System.out.println(s);
		//		System.out.println(s++);
		//		System.out.println(s);
		//test_2();
		//test_1();
	}




	private static char[] getNewAlphabets(char[] cipherArray, char[] alphabets) {
		// TODO Auto-generated method stub
		char[] newAlphabets = alphabets;
		for(int i=0;i<newAlphabets.length;i++){
			
			for(int j=0;j<cipherArray.length;j++){
				if(newAlphabets[i] == cipherArray[j]){
					newAlphabets[i] = ' ';
				}
			}
		}
		return newAlphabets;
	}




	private static String validateCipher(String cipher) {
		char[] cipherCharArray = cipher.toCharArray();
		for(int i=0;i<cipherCharArray.length;i++){
			
			for(int j=i+1;j<cipherCharArray.length-1;j++){
				if(cipherCharArray[i] == cipherCharArray[j]){
					cipherCharArray[j] = ' ';
				}
			}
		}
		
		return new String(cipherCharArray);
	}




	public static void foo(Integer i) { System.out.println("foo(Integer)"); }
	public static void foo(short i) { System.out.println("foo(short)"); }
	public static void foo(long i) { System.out.println("foo(long)"); }
	//	public static void foo(int i) { System.out.println("foo(int)"); }
	public static void foo(int ... i) { System.out.println("foo(int ...)"); }


	private static void test_2(){
		String str = "dd";
		String str2 =str;
		System.out.println(str==str2);
		System.out.println(str.equals(str2));
		if(str instanceof Object) // NULLCHK
			System.out.println("str is Object");
		else
			System.out.println("str is not Object");
	}

	private static void test_1(){
		int[] a = {1,2,3,4};
		int[] b = {1,2,3,4};
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(Arrays.equals(a, b));
		int[] commonElements = new int[(a.length > b.length)? b.length : a.length];
		//		int[] commonElements = {};
		int[] smallerArray = (a.length > b.length)? b : a;
		int[] largerArray = (a.length > b.length)? a : b;
		int cEIndex = 0,cnt = 0;
		for(int i=0;i<smallerArray.length;i++){
			for(int j=0;j<largerArray.length;j++,cnt++){
				//				System.out.println(cnt);
				if(smallerArray[i] == largerArray[j]) {
					commonElements[cEIndex] = smallerArray[i];
					cEIndex++;
					break;
				}

			}
		}
		System.out.println(cnt);
		print(commonElements,cEIndex);
	}

	private static void print(int[] a,int cEIndex){
		for(int j=0;j<cEIndex;j++){

			System.out.print(a[j]+",");
		}
	}
}
