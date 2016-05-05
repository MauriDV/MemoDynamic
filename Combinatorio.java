import java.util.*;

public class Combinatorio{

	public static void main(String[] args){
		System.out.println(combinatoria(7,4));
	}

	private static Map<Integer,Integer> cache = new HashMap<Integer,Integer>();

	public static int factorial(int num){
		if (num<0) throw new IllegalArgumentException("No definido para numeros negativos");
		else{
			if (num==1){
				return 1;
			}else{
				return num*factorial(num-1);
			}
		}
	}

	public static int combinatoria(int a, int b){
		int auxNumerador = memofactorial(a);
		int auxDenominador = (memofactorial(b)*memofactorial(b-1));
		return (auxNumerador/auxDenominador);
	}

	public static int memofactorial(int b){
		if(!cache.containsKey(b)){
			cache.put(b,factorial(b));
		}
		return cache.get(b);
	}
}