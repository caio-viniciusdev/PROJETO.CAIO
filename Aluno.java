public class Aluno {

    private int matricula;
    private String nome;
    private int idade;
    private double nota1;
    private double nota2;
    private double nota3;

    // CONSTRUTORES
    public Aluno(int matricula, String nome, int idade, double nota1, double nota2, double nota3) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    void estudar(){
        System.out.println(nome + "está estudando.");
    }

    public double CalcularMedia(){
        return (nota1+nota2+nota3)/3;
    }

    public String VerificarSituacao(){
        if (CalcularMedia() >= 7){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }

    void exibirDadosAlunos(){
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("1. Nota: " + nota1);
        System.out.println("2. Nota: " + nota2);
        System.out.println("3. Nota: " + nota3);
        System.out.println("Media: " + CalcularMedia());
        System.out.println("Situacao: " + VerificarSituacao());
    }

}
