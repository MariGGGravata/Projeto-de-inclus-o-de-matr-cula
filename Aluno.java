public class Aluno {

	private String matricula;
	private String nome;
	private String email;
	private Curso curso;
	private static double mensalidade; //Utilizei o m�todo static para poder tornar o atributo est�tico, mantendo a mensalidade de todos os alunos no mesmo valor, assim como para o monitor futuramente.

	public Aluno() { }

	public Aluno(String matricula, String nome, String email, Curso curso) {
	    this.matricula = matricula;
	    this.nome = nome;
	    this.email = email;
	    this.curso = curso;
	}
	

	    public String getMatricula() {
	        return matricula;
	    }

	    public void setMatricula(String matricula) {
	        this.matricula = matricula;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public Curso getCurso() {
	        return curso;
	    }

	    public void setCurso(Curso curso) {
	        this.curso = curso;
	    }

	    public static double getMensalidade() {
	        return mensalidade;
	    } // foi necess�rio tamb�m utilizar o static no set e get para que a classe reconhecesse que o atributo que ser� pego e atribuido est� estatico em valor. Colocando assim somente um valor.

	    public static void setMensalidade(double mensalidade) {
	        Aluno.mensalidade = mensalidade;
	    }

		@Override
		public String toString() {
			return "\n\nAluno: \n\nMatricula: " + matricula + "\nNome: " + nome + "\nEmail: " + email + "\n\nCurso: " + curso;
		} // Foi necess�rio criar esse override pois quando colocavao printfln do getaluno na tela ele mostrava o ender�o do aluno e n�o os dados/atributos que eu queria, fazendo assim um toString para que ele fosse instanciado em string os dados.
	   
	    
	    
	    
}
