import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Escola escola = new Escola(tamanho: 100);

        int opcao;
        int opcaoProfessor;
        int opcaoAluno;

    public Main() {
    }

    public void Menu(){

        System.out.println("\n=============================");
        System.out.println("\n==== GERENCIADOR ESCOLAR ====");
        System.out.println("\n=============================");
        System.out.println("\n[1] - PROFESSOR ");
        System.out.println("\n[2] - ALUNO ");
        System.out.println("\n[0] - Sair");
        System.out.print("\nEscolha: ");
        
        opcao = entrada.nextInt();
        entrada.nextLine();

    }

    public void MenuProfessor(){

        System.out.println("\n=============================");
        System.out.println("\n==== GERENCIADOR ESCOLAR ====");
        System.out.println("\n=============================");
        System.out.println("\n[1] - Cadastrar Professor ");
        System.out.println("\n[2] - Listar Professores ");
        System.out.println("\n[3] - Buscar Professor ");
        System.out.println("\n[4] - Atualizar Professor ");
        System.out.println("\n[5] - Excluir Professor ");
        System.out.println("\n[0] - Voltar");
        System.out.print("\nEscolha: ");
        
        opcaoProfessor = entrada.nextInt();
        entrada.nextLine();

    }

    public void MenuAluno(){

        System.out.println("\n=============================");
        System.out.println("\n==== GERENCIADOR ESCOLAR ====");
        System.out.println("\n=============================");
        System.out.println("\n[1] - Cadastrar Aluno ");
        System.out.println("\n[2] - Listar Alunos ");
        System.out.println("\n[3] - Buscar Aluno ");
        System.out.println("\n[4] - Atualizar Aluno ");
        System.out.println("\n[5] - Excluir Aluno ");
        System.out.println("\n[6] - Exibir Aprovados ");
        System.out.println("\n[7] - Exibir Reprovados ");
        System.out.println("\n[0] - Voltar");
        System.out.print("\nEscolha: ");
        
        opcaoAluno = entrada.nextInt();
        entrada.nextLine();
        
    }


    }

    
    // MENU PROFESSORES
    do {

        Menu();
        opcao = entrada.nextInt();

        if (opcao == 1){
            
            do {

                MenuProfessor();
                opcaoProfessor = entrada.nextInt();

                switch (opcaoProfessor) {
                    case 1:
                        cadastrarProfessor();
                        break;
                    case 2:
                        listarProfessor()
                        ;
                        break;
                    case 3:
                        buscarProfessor();
                        break;
                    case 4:
                        atualizarProfessor();
                        break;
                    case 5:
                        excluirProfessor();
                        break;
                    case 0:
                        System.out.println("Voltando ao menu principal...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }

            } while (opcaoProfessor != 0);

        } 
        
        
        // MENU ALUNOS
        else if (opcao == 2){

            do {

                MenuAluno();
                opcaoAluno = entrada.nextInt();

                switch (opcaoAluno) {
                    case 1:
                        cadastrarAluno();
                        break;
                    case 2:
                        listarAlunos();
                        break;
                    case 3:
                        buscarAluno();
                        break;
                    case 4:
                        atualizarAluno();
                        break;
                    case 5:
                        excluirAluno();
                        break;
                    case 6:
                        exibirAprovados();
                        break;
                    case 7:
                        exibirReprovados();
                        break;
                    case 0:
                        System.out.println("Voltando ao menu principal...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }

            } while (opcaoAluno != 0);

        } else if (opcao == 0){
            System.out.println("Encerrando sistema...");
        } else {
            System.out.println("Opção inválida.");
        }
    }




}