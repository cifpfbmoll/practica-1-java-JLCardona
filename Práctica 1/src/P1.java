import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        menu();

    }
    public static void menu(){
        System.out.println("¿QUE OPERACIÓN QUIERES HACER?");
        System.out.println("¡EN CUALQUIER CASO A ELEGIR PORFAVOR ESCRIBA EL NÚMERO CORRESPONDIDO!");
        System.out.println("1 -> Dar 5 números y que se muestren en el mismo orden introducido.");
        System.out.println("2 -> Dar 5 números y que se muetsren en orden inverso al introducido.");
        System.out.println("3 -> Dar 5 números y saber la media de los números positivos, la media de los negativos y contar el número de ceros que se han introducido por teclado.");
        System.out.println("4 -> Dar un texto y saber la cantidad de caracteres que incorpora el texto.");
        System.out.println("5 -> Dar un texto y ver el texto invertido.");
        System.out.println("6 -> Dar un texto y verlo sin espacios en blanco.");
        System.out.println("7 -> Dar dos cadenas y verlas concatenadas.");
        System.out.println("8 -> ");
        System.out.println("9 -> ");
        Scanner lector = new Scanner(System.in);
        int opcion = lector.nextInt();
        switch (opcion){
            case 1:
                mismoOrden();
                break;
            case 2:
                ordenInverso();
                break;
            case 3:
                positivosNegativosYCeros();
                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
            case 9:

                break;
        }
    }

    public static void positivosNegativosYCeros(){

        System.out.print("Introduce 5 números\n");

        int sumaTotal =0;
        int media;
        int arrays[]= new int[5];
        int cantidadPositivos=0;
        int negativo =0;
        int cero =0;
        int ceros;

        for (int i = 0; i< arrays.length; i++) {
            Scanner sc = new Scanner(System.in);
            arrays[i]=sc.nextInt();  //Guardamos

            if(arrays[i]>0){
                cantidadPositivos++;


            }if(arrays[i]<0){
                negativo++;
            }
            if (arrays[i]%10 == 0)
                cero++;
        }

        System.out.print ("positivos : " + cantidadPositivos +", ");
        System.out.print ("negativos : " + negativo +", ");
        System.out.print ("ceros : " + cero);
    }


    private static void ordenInverso() {
        System.out.println("Escribe 5 numeros : ");
        int listaNum[] = new int[5];
        for (int i=0;i<listaNum.length;i++){
            Scanner lector = new Scanner(System.in);
            listaNum[i] = lector.nextInt(); //i(posisicion) = 0 -> (0=5 ,1=10,2=20,3=40,4=50)
        }
        for (int i=4;i>=0;i--){
            System.out.println(listaNum[i]+"");
        }
    }

    private static void mismoOrden() {
        System.out.println("Escribe 5 numeros : ");
        int listaNum[] = new int[5];
        for (int i=0;i<listaNum.length;i++){
            Scanner lector = new Scanner(System.in);

            listaNum[i] = lector.nextInt(); //i(posisicion) = 0 -> (0=5 ,1=10,2=20,3=40,4=50)
        }
        for (int i=0;i<listaNum.length;i++){
            System.out.println(listaNum[i]+"");
        }
    }
}
