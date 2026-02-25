import java.util.ArrayList;
import java.util.Scanner;

import entities.CargoEntity;
import entities.ClienteEntity;
import entities.ColaboradorEntity;
import entities.OrcamentoEntity;
import entities.StatusEntity;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int opcao;
        ArrayList<ColaboradorEntity> colaboradores = new ArrayList<ColaboradorEntity>();
        ArrayList<ClienteEntity> clientes = new ArrayList<ClienteEntity>();     
        ArrayList<CargoEntity> cargos = new ArrayList<CargoEntity>();     
        ArrayList<StatusEntity> status = new ArrayList<StatusEntity>();     
        ArrayList<OrcamentoEntity> orcamentos = new ArrayList<OrcamentoEntity>();
        do {
            System.out.println("Menu de Opções:");
            System.out.println("1. Cadastrar Colaborador");
            System.out.println("2. Cadastrar Cliente");
            System.out.println("3. Cadastrar Cargo");
            System.out.println("4. Cadastrar Status");
            System.out.println("5. Cadastrar Orçamento");
            System.out.println("6. Listar Colaboradores");
            System.out.println("7. Listar Clientes");
            System.out.println("8. Listar Cargos");
            System.out.println("9. Listar Status");
            System.out.println("10. Listar Orçamentos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = ler.nextInt();
            ler.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    ColaboradorEntity colaborador = new ColaboradorEntity();
                    System.out.print("Digite o nome do colaborador: ");
                    colaborador.setNome(ler.nextLine());
                    colaboradores.add(colaborador);
                    System.out.println("Colaborador cadastrado com sucesso!");
                    break;
                case 2:
                    ClienteEntity cliente = new ClienteEntity();
                    System.out.print("Digite o nome do cliente: ");
                    cliente.setNome(ler.nextLine());
                    clientes.add(cliente);
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;
                case 3:
                    // Lógica para cadastrar cargo
                    break;
                case 4:
                    // Lógica para cadastrar status
                    break;
                case 5:
                    // Lógica para cadastrar orçamento
                    break;
                case 6:
                    // Lógica para listar colaboradores
                    break;
                case 7:
                    // Lógica para listar clientes
                    break;
                case 8:
                    // Lógica para listar cargos
                    break;
                case 9:
                    // Lógica para listar status
                    break;
                case 10:
                    // Lógica para listar orçamentos
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }
}
