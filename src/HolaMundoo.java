import java.util.ArrayList;
import java.util.regex.MatchResult;

public class HolaMundoo {
    static void main(String[] args) {
        System.out.println("Hola Mundo");

        //array 1
        int[] Fichas = new int[3];


        Fichas[0] = 3412760;
        Fichas[1] = 3412761;
        Fichas[2] = 3412762;

        //array 2
        String[][] MateriasVistas = new String[1][3];

        MateriasVistas[0][0] = "Base de datos";
        MateriasVistas[0][1] = "Javascript";
        MateriasVistas[0][2] = "Python";

        //array 3
        Object[][][] nombresEdades = new Object[1][3][2];

        nombresEdades[0][0][0] = 10;
        nombresEdades[0][0][1] = "jeronimo";

        nombresEdades[0][1][0] = 15;
        nombresEdades[0][1][1] = "Esteban";

        nombresEdades[0][2][0] = 20;
        nombresEdades[0][2][1] = "Andres";
    }
}