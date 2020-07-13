public class Turma {

	private String codigo;
    private int semestre;
    private Disciplina disciplina;
    private Aluno[] alunos;
    private int x;

    public Turma() {}

    public Turma(String codigo, int semestre, Disciplina disciplina) {
        this.codigo = codigo;
        this.semestre = semestre;
        this.disciplina = disciplina;
        this.alunos = new Aluno[15];
        this.x = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public double Media(){
        double valor = 0;

        for(int i = 0; i < x; i++){
            if(alunos[i] instanceof Monitor)
                valor += Monitor.getMensalidade();
            else
                valor += Aluno.getMensalidade();
        }
        return valor/x;
    } // Utilizei da métrica báscia para tirar uma média que consiste em somar todos os valores e dividir pela quantidade, inicializando um valor para a soma das mensalidades, fazendo o comparativo do aluno dentro do vetor e se o mesmo era uma classe monitor, eu somaria o a mensalidade do monitor, caso fosse aluno somaria a mensalidade do aluno e no final iria fazer o calculo usando valor/x que seria a quantidade de alunos já previamente instanciado em turma.

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void addAluno(Aluno aluno){
        alunos[x] = aluno;
        x++;
    } // Criei uma nova variavel de entrada, para pegar o atributo aluno e instanciar no vetor alunos, ao final coloquei um contador para acrescentar 1 ao x para que o mesmo seja contabilizado no vetor iniciando em 0.
    
    public Aluno getAluno(int index) {
    	
    	return alunos[index];
    	
    } //criei uma nova variável de entrada, que utiliza do index para contabilizar os alunos da classe Aluno, e retornar ele para o programa, com a ajudar do vetor, onde eu escolho qual aluno eu quero que retorne na tela.
	
}
