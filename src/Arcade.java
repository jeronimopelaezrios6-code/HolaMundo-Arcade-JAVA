public class Arcade {
    public static void main(String[] args) {

        // RETO 1
        String[] nom = {"Laura", "Andrés", "Camila"};
        int[] edad = {19, 22, 20};
        int[] pts = {1500, 2200, 2200};
        boolean[] vip = {true, false, true};

        System.out.println("Arcade Challenge");
        for (int i = 0; i < 3; i++) {
            System.out.println("Jugador: " + nom[i]);
            System.out.println("Edad: " + edad[i]);
            System.out.println("Puntaje acumulado: " + pts[i]);
            if (vip[i]) {
                System.out.println("VIP: Sí");
            } else {
                System.out.println("VIP: No");
            }
            System.out.println();
        }

        // RETO 2
        int[][] mat = {
                {500, 800, 200},
                {900, 700, 600},
                {400, 950, 850}
        };

        System.out.println("Puntuaciones por juego");
        System.out.println("Jugador  Carrera  Invasores  Robots");
        for (int i = 0; i < 3; i++) {
            System.out.println(nom[i] + "  " + mat[i][0] + "  " + mat[i][1] + "  " + mat[i][2]);
        }
        System.out.println();

        // RETO 3 (día, ronda, jugador)
        int[][][] camp = {
                {{300, 450, 200}, {250, 500, 350}},
                {{400, 300, 600}, {550, 450, 700}}
        };

        System.out.println("Campeonato, día 1");
        for (int r = 0; r < 2; r++) {
            System.out.println("Ronda " + (r + 1));
            for (int j = 0; j < 3; j++) {
                System.out.println(nom[j] + ": " + camp[0][r][j]);
            }
        }

        System.out.println("Camila en la ronda 2 del día 1: " + camp[0][1][2]);

        int sumaLaura = 0;
        for (int d = 0; d < 2; d++) {
            for (int r = 0; r < 2; r++) {
                sumaLaura = sumaLaura + camp[d][r][0];
            }
        }
        System.out.println("Total de Laura: " + sumaLaura);
        System.out.println();

        // RETO 4
        int[] tot = new int[3];
        int max = 0;

        System.out.println("Resultados finales");
        for (int i = 0; i < 3; i++) {
            tot[i] = mat[i][0] + mat[i][1] + mat[i][2];
            System.out.println(nom[i] + ": " + tot[i] + " puntos");
            if (tot[i] > max) {
                max = tot[i];
            }
        }

        System.out.print("Ganó: ");
        for (int i = 0; i < 3; i++) {
            if (tot[i] == max) {
                System.out.print(nom[i] + " ");
            }
        }
        System.out.println("con " + max + " puntos");
    }
}