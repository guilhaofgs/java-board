import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();

        while(true) {
            System.out.println("\n1 - Adicionar Tarefa");
            System.out.println("2 - Listar Tarefas");
            System.out.println("3 - Concluir Tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao == 0) {
                break;
            } else if(opcao == 1) {
                System.out.print("Descrição da tarefa: ");
                String descricao = scanner.nextLine();
                board.adicionarTarefa(new Tarefa(descricao));
            } else if(opcao == 2) {
                board.listarTarefas();
            } else if(opcao == 3) {
                board.listarTarefas();
                System.out.print("Número da tarefa a concluir: ");
                int num = scanner.nextInt();
                if(num > 0 && num <= board.tarefas.size()) {
                    board.tarefas.get(num-1).concluir();
                    System.out.println("Tarefa concluída!");
                } else {
                    System.out.println("Número inválido.");
                }
            }
        }
        scanner.close();
    }
}