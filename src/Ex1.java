import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Ex1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ler;
        ler = new Scanner(new File("src/Lista_URL.txt"));
        Scanner scanner = new Scanner(System.in);
        Stack pilha = new Stack();

        while (ler.hasNextLine()) {
            pilha.push(ler.nextLine());
        }
        System.out.print("Imprimindo de links... " + pilha + " ");

        System.out.println("\nDigite o link a ser excluido: ");
        String exclui = scanner.nextLine();

        if (pilha.contains(exclui)){
            pilha.remove(exclui);
        }
        else{
            System.out.println("Link inexistente !");
        }
        System.out.println("A quantidade de registros é " + pilha.size());
        System.out.println("Imprimindo links atualizados... " + pilha);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Digite o link a ser consultado: ");
        String consulta = scanner2.nextLine();
        if (pilha.contains(consulta)){
            System.out.println("Link Encontrado");
        }
        else {
            System.out.println("Link não Encontrado");
        }

    }
}
