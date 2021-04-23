import java.util.Scanner;

public class Calculadora {

    static Scanner leerNum = new Scanner(System.in);
    static Scanner seguir = new Scanner(System.in);
    static String menu() { //Muestra el menú creado y guarda los datos introducidos
        System.out.println("____________________________________________________________");
        System.out.println("|                   ¿Qué quieres hacer?                    |");
        System.out.println("|__________________________________________________________|");
        System.out.println("|    Introduce '+' para sumar dos números                  |");
        System.out.println("|    Introduce '-' para restar dos números                 |");
        System.out.println("|    Introduce '*' para multiplicar dos números            |");
        System.out.println("|    Introduce '/' para dividir dos números                |");
        System.out.println("|    Introduce '%' para obtener el resto de dos números    |");
        System.out.println("____________________________________________________________");
        String operacion = leerNum.nextLine();
        System.out.println("|           Escribe el primer número:                      |");
        double num1 = leerNum.nextDouble();
        System.out.println("|           Escribe el segundo número:                     |");
        double num2 = leerNum.nextDouble();
        return operacion(operacion, num1, num2);
    }

    static String operacion(String operacion, double num1, double num2) { //Este es el método que hará las operaciones
        return switch (operacion) {
            case "+" -> "     La suma de  " + num1 + " y " + num2 + " es " + (num1 + num2);
            case "-" -> "     La resta de" + num1 + " y " + num2 + " es " + (num1 - num2);
            case "*" -> "     La multiplicación de  " + num1 + " y " + num2 + " es " + (num1 * num2);
            case "/" -> "     La división de  " + num1 + " y " + num2 + " es " + (num1 / num2);
            case "%" -> "     El resto de  " + num1 + " y " + num2 + " es " + (num1 % num2);
            default -> "      Respuesta invalida";
        };
    }

    static String seguir() { // Este método pregunta al usuario si seguirá usando la calculadora
        System.out.println("___________________________________________________");
        System.out.println("|     ¿Quieres seguir usando la calculadora?      |");
        System.out.println("|_________________________________________________|");
        System.out.println("|       Introduce 's' para hacer otra operacion   |");
        System.out.println("|       Introduce 'n' para salir                  |");
        System.out.println("___________________________________________________");
        return seguir.nextLine();
    }

    public static void main(String[] args) {//Aquí presentamos la calculadora y llamamon a los otros metodos
        System.out.println("_____________________________________________");
        System.out.println("|         Bienvenido a Calculadora          |");
        System.out.println("_____________________________________________");
        String continuar = "s";
        while (!continuar.equals("n")) { //Este bucle hace que seguira pidiendo operaciones hasta que el usuario pulse n para salir
            String solucion = Calculadora.menu();
            System.out.println("----------------------------------------------------");
            System.out.println(solucion);
            System.out.println("----------------------------------------------------");
            continuar = Calculadora.seguir();
    }
    System.out.println("_____________________________________________________");
    System.out.println("|           Grácias por usar la calculadora         |");
    System.out.println("_____________________________________________________");
}
}


