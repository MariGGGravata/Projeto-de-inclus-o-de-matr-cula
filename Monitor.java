public class Monitor extends Aluno {
	
	private static double desconto;
    private Disciplina disciplina;

    public Monitor() { }

    public Monitor(String matricula, String nome, String email, Curso curso, Disciplina disciplina) {
        super(matricula, nome, email, curso);
        this.disciplina = disciplina;
    }

    public static double getDesconto() {
        return desconto;
    }

    public static void setDesconto(double desconto) {
        Monitor.desconto = desconto;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public static double getMensalidade(){
        return Aluno.getMensalidade() - (Aluno.getMensalidade() * desconto);
    }//Professor, eu fiz dessa forma pois iria meio que puxar do pai(aluno) o get da mensalidade, eu pesquisei e vi que a sobreescrita em atributos estáticos não é possível, porém o java meio que compreende que é para o valor pré atribuido ser utilizado como valor na classe aluno, consequentemente na do monitor.  
	
	
		
		
}

