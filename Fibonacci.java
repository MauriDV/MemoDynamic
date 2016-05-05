import java.util.*;

public class Fibonacci{

	public static void main(String[] args){
		lista.add(1); //Creo que no hace falta estas cargas.
		lista.add(1);
		int int1 = Integer.parseInt(args[0]);
		System.out.println(fib(int1));
	}

	static LinkedList<Integer> lista = new LinkedList<Integer>();


	public static LinkedList fibonacci(int i){
		if (i==0){
			lista.addFirst(1);
		}else if (i==1){
			lista.addFirst(1);
		}else{
			int a=(int)fibonacci(i-1).get(0);
			int b=(int)fibonacci(i-1).get(1);
			lista.addFirst(a+b);
		}
		return lista;
	}

	public static int fib(int i){
		return (int) (fibonacci(i)).get(0);
	}
}