import java.util.Scanner;

public class suma {

    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);
        int numero1;
        int numero2;
        String mensaje1 ="digite 2 numero enteros";
        System.out.println(mensaje1);
        String digiten1="digite su primer numero entero";
        System.out.println(digiten1);
        numero1=scaner.nextInt();
        String digite2="digite su segundo numero entero";
        System.out.println(digite2);
        numero2=scaner.nextInt();
        String mensajeResultado="el resultado es=";
        System.out.println(mensajeResultado);
        System.out.println(numero1+numero2);



    }
}
