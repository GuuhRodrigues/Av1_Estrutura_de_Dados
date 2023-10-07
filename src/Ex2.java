public class Ex2 {
    public static void main(String[] args) {
        int[][] estante = new int[40][40];
        int[] produtos = {1, 2, 3, 4, 5, 0};
        int i, j, xampu = 0,condicionador = 0, hidratante = 0 , tintura = 0, demaquiante = 0, vazio = 0;
        for (i = 0; i < estante.length; i++) {
            for (j = 0; j < estante[i].length; j++) {
                estante[i][j] = produtos[(int) (Math.random() * produtos.length)];
                System.out.print(estante[i][j] + " ");
            }
            System.out.println();
        }
        for (i = 0; i < estante.length; i++) {
            for (j = 0; j < estante[i].length; j++) {
                if (estante[i][j] == 1){
                    xampu++;
                }
                else if (estante[i][j] == 2){
                    condicionador++;
                }
                else if (estante[i][j] == 3){
                    hidratante++;
                }
                else if (estante[i][j] == 4) {
                    tintura++;
                }
                else if (estante[i][j] == 5){
                    demaquiante++;
                }
                else{
                    vazio++;
                }
            }
        }
        System.out.println("\nQuantidade de Xampu: " + xampu);
        System.out.println("Quantidade de Condicionador: " + condicionador);
        System.out.println("Quantidade de Hidratante: " + hidratante);
        System.out.println("Quantidade de Tintura: " + tintura);
        System.out.println("Quantidade de Demaquiante: " + demaquiante);
        System.out.println("Quantidade de Vazio: " + vazio);
    }
}
