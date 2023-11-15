import java.util.Scanner;

public class suma {

    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);
        int numero1;
        int numero2;
        int resultado;
        String mensaje1 ="digite 2 numero enteros";
        System.out.println(mensaje1);
        String digiten1="digite su primer numero entero";
        System.out.println(digiten1);
        numero1=scaner.nextInt();
        String digite2="digite su segundo numero entero";
        System.out.println(digite2);
        numero2=scaner.nextInt();
        resultado=numero1+numero2;

        String mensajeResultado="el resultado es="+String.valueOf(resultado);
       System.out.println(mensajeResultado);




    }
}
