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
        int opcao1, opcao2 = 0;
        ArrayList<ColaboradorEntity> colaboradores = new ArrayList<ColaboradorEntity>();
        ArrayList<ClienteEntity> clientes = new ArrayList<ClienteEntity>();     
        ArrayList<CargoEntity> cargos = new ArrayList<CargoEntity>();     
        ArrayList<StatusEntity> status = new ArrayList<StatusEntity>();     
        ArrayList<OrcamentoEntity> orcamentos = new ArrayList<OrcamentoEntity>();
        status.add(new StatusEntity(1, "Ativo"));
        status.add(new StatusEntity(2, "Inativo"));
        cargos.add(new CargoEntity(100, "Administrador"));
        cargos.add(new CargoEntity(200, "RH"));
        do {
            System.out.println("Menu de Opções:");
            System.out.println("1. Colaborador");
            System.out.println("2. Cliente");
            System.out.println("3. Cargo");
            System.out.println("4. Status");
            System.out.println("5. Orçamento");
            System.out.println("6. Histórico de cargos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao1 = ler.nextInt();
           //ler.nextLine(); // Limpar o buffer do teclado
            if(opcao1>0 && opcao2<6) {
                System.out.println("1. Cadastrar");
                System.out.println("2. Listar");
                System.out.println("3. Editar");
                System.out.println("4. Excluir");
                System.out.println("0. Voltar ao menu principal");
                System.out.print("Escolha uma opção: ");
                opcao2 = ler.nextInt();
                ler.nextLine(); // Limpar o buffer do teclado
            }else if (opcao1 == 0) {
                System.out.println("Saindo do programa...");
                break;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
                continue;
            }
            String menu = ""+opcao1+opcao2;
            switch (menu) {
                case "11": //colaborador - cadastrar
                    if(status.isEmpty() || cargos.isEmpty()) {
                        System.out.println("É necessário cadastrar pelo menos um cargo e um status antes de cadastrar um colaborador.");
                        break;
                    } else {
                        ColaboradorEntity colaborador = new ColaboradorEntity();
                        do{
                            System.out.print("Digite o nome do colaborador: ");
                            colaborador.setNome(ler.nextLine());
                        }while(colaborador.getNome().trim().length()<6);
                        boolean statusEncontrado = false;
                        do{ // chave estrangeira de status na tabela usuario
                            System.out.println("--- Status cadastrados ---");
                            for(StatusEntity s : status) {
                                System.out.println(s);
                            }
                            System.out.print("Digite o status do colaborador: ");
                            String nomeStatus = ler.nextLine();
                            statusEncontrado = false;
                            for(StatusEntity s : status) {
                                if(s.getDescricao().equals(nomeStatus)) {
                                    colaborador.setStatus(s);
                                    statusEncontrado = true;
                                    break;
                                }
                            }
                            if(!statusEncontrado) {
                                System.out.println("Status não encontrado. Colaborador não cadastrado.");
                                continue;
                            }
                        }while(!statusEncontrado);
                        System.out.println("Digite a senha:");
                        colaborador.setSenha(ler.next());
                        System.out.println("Digite o e-mail:");
                        colaborador.setEmail(ler.next());
                        System.out.println("Digite o salário:");
                        colaborador.setSalario(ler.nextFloat());                      
                        colaboradores.add(colaborador);
                        System.out.println("Colaborador cadastrado com sucesso!");
                    }
                    break;
                case "12":
                    System.out.println("--- Colaboradores cadastrados ---");
                    for(ColaboradorEntity c : colaboradores) {
                        System.out.println(c);
                    }
                    break;
                case "21": //cliente - cadastrar
                    if(status.isEmpty() || cargos.isEmpty()) {
                        System.out.println("É necessário cadastrar pelo menos um cargo e um status antes de cadastrar um colaborador.");
                        break;
                    } else {
                        ClienteEntity cliente = new ClienteEntity();
                        System.out.print("Digite o nome do cliente: ");
                        cliente.setNome(ler.nextLine());
                        System.out.println("--- Status cadastrados ---");
                        for(StatusEntity s : status) {
                            System.out.println(s);
                        }
                        System.out.print("Digite o status do cliente: ");
                        String nomeStatus = ler.nextLine();
                        boolean statusEncontrado = false;
                        for(StatusEntity s : status) {
                            if(s.getDescricao().equals(nomeStatus)) {
                                cliente.setStatus(s);
                                statusEncontrado = true;
                                break;
                            }
                        }
                        if(!statusEncontrado) {
                            System.out.println("Status não encontrado. Colaborador não cadastrado.");
                            break;
                        }
                        System.out.println("Digite a senha:");
                        cliente.setSenha(ler.next());
                        System.out.println("Digite o e-mail:");
                        cliente.setEmail(ler.next());
                        System.out.println("Digite o CPF:");
                        cliente.setCpf(ler.next());                      
                        System.out.println("Digite o RG:");
                        cliente.setRg(ler.next());                      
                        clientes.add(cliente);
                        System.out.println("Cliente cadastrado com sucesso!");
                    }
                    break;
                case "22":
                    System.out.println("--- Clientes cadastrados ---");
                    for(ClienteEntity c : clientes) {
                        System.out.println(c);
                    }
                    break;
                case "41":
                    System.out.println("Digite o id");
                    StatusEntity statusEntity = new StatusEntity();
                    statusEntity.setId(ler.nextInt());
                    System.out.println("Digite a descrição");
                    statusEntity.setDescricao(ler.next());
                    status.add(statusEntity);
                    System.out.println("Status cadastrado com sucesso!");
                    break;
                case "42":
                    System.out.println("--- Status cadastrados ---");
                    for(StatusEntity s : status) {
                        System.out.println(s);
                    }
                    break;
                case "31":
                    System.out.println("Digite o id");
                    CargoEntity cargoEntity = new CargoEntity();
                    cargoEntity.setId(ler.nextInt());
                    System.out.println("Digite a descrição");
                    cargoEntity.setDescricao(ler.next());
                    cargos.add(cargoEntity);
                    System.out.println("Cargo cadastrado com sucesso!");
                    break;
                case "32":
                    System.out.println("--- Cargos cadastrados ---");
                    for(CargoEntity c : cargos) {
                        System.out.println(c);
                    }
                    break;
                case "0":
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao1!= 0);
    }
}
