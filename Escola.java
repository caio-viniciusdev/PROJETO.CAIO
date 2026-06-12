public class Escola {

    private Aluno[] alunos;
    private Professor[] professores;

    private int qtdAlunos;
    private int qtdProfessores;

    public Escola(int tamanho){
        alunos = new.Aluno(tamanho);
        professores = new.Professor(tamanho);

        qtdAlunos = 0;
        qtdProfessor = 0;
    }

    public void cadastrarAluno (Aluno aluno){
        if (qtdAlunos < alunos.length){
            alunos[qtdAlunos] = aluno;
            qtdAlunos++;
            System.out.println("Aluno cadastrado com sucesso! ");
        } else{
            System.out.println("Limite de alunos atigindo! ");
        }
    }

    public void listarAluno (Aluno aluno){
        if (qtdAlunos == 0){
            System.out.println("Nenhum aluno encontrado! ");
        }
        System.out.println("\n=== Alunos cadastrados === ");
        return;
    }

    public void buscarAluno (int matricula){
        for (int i = 0; i < qtdAlunos; i++){
            if (alunos[i].getMatricula() == matricula){
                alunos[i].exibirDadosAlunos();
                return;
            }
        }
        System.out.println("Aluno não encontrado! ");
    }

    public void AtualizarAluno (int matricula, Aluno alunoAtualizado){
        for (int i = 0; i < qtdAlunos; i++){
            if (alunos[i].getMatricula() == matricula){
                alunos[i] = alunoAtualizado;
                System.out.println("Aluno atualizado com sucesso! ");
                return;
            }
        }
        System.out.println("Aluno não encontrado! ");
    }

    public void excluirAluno (int matricula){
        for (int i = 0; i < qtdAlunos; i++){
            if (alunos[i].getMatricula() == matricula){
                for (int j = i; j < qtdAlunos - 1; j++){
                    alunos[j] = alunos[j + 1];
                }
                alunos[qtdAlunos - 1] = null;
                qtdAlunos--;
                System.out.println("Aluno excluído com sucesso! ");
                return;
            }
        }
        System.out.println("Aluno não encontrado! ");
    }

    public void exibirAlunosAprovados(){
        System.out.println("\n=== Alunos Aprovados === ");
        for (int i = 0; i < qtdAlunos; i++){
            if (alunos[i].CalcularMedia() >= 7){
                alunos[i].exibirDadosAlunos();
            }
        }
    }

    public void exibirAlunosReprovados(){
        System.out.println("\n=== Alunos Reprovados === ");
        for (int i = 0; i < qtdAlunos; i++){
            if (alunos[i].CalcularMedia() < 7){
                alunos[i].exibirDadosAlunos();
            }
        }
    }

    public void cadastrarProfessor (Professor professor){
        if (qtdProfessores < professores.length){
            professores[qtdProfessores] = professor;
            qtdProfessores++;
            System.out.println("Professor cadastrado com sucesso! ");
        } else{
            System.out.println("Limite de professores atigindo! ");
        }
    }

    public void listarProfessor (Professor professor){
        if (qtdProfessores == 0){
            System.out.println("Nenhum professor encontrado! ");
        }
        System.out.println("\n=== Professores cadastrados === ");
        return;
    }

    public void buscarProfessor (String cpf){
        for (int i = 0; i < qtdProfessores; i++){
            if (professores[i].getCpf().equals(cpf)){
                professores[i].exibirDadosProfessor();
                return;
            }
        }
        System.out.println("Professor não encontrado! ");
    }

    public void atualizarProfessor (String cpf, Professor professorAtualizado){
        for (int i = 0; i < qtdProfessores; i++){
            if (professores[i].getCpf().equals(cpf)){
                professores[i] = professorAtualizado;
                System.out.println("Professor atualizado com sucesso! ");
                return;
            }
        }
        System.out.println("Professor não encontrado! ");
    }

    public void excluirProfessor (String cpf){
        for (int i = 0; i < qtdProfessores; i++){
            if (professores[i].getCpf().equals(cpf)){
                for (int j = i; j < qtdProfessores - 1; j++){
                    professores[j] = professores[j + 1];
                }
                professores[qtdProfessores - 1] = null;
                qtdProfessores--;
                System.out.println("Professor excluído com sucesso! ");
                return;
            }
        }
        System.out.println("Professor não encontrado! ");
    }

    


}