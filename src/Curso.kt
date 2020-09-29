class Curso {

    var nomeDoCurso: String = ""
    var codigoCurso: Int = 0
    lateinit var professorTitular: ProfessorTitular
    lateinit var professorAdjunto: ProfessorAdjunto
    var quantidadeMaximaAlunos: Int = 0
    var listaDeAlunosMatriculados: ArrayList<Aluno> = arrayListOf()


   fun adicionarUmAluno(aluno: Aluno): Boolean {
       return if(listaDeAlunosMatriculados.size < quantidadeMaximaAlunos){
           listaDeAlunosMatriculados.add(aluno)
           true
       } else false
    }

    fun excluirAluno(aluno: Aluno){
        if(listaDeAlunosMatriculados.contains(aluno)) {
            listaDeAlunosMatriculados.remove(aluno)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Curso

        if (codigoCurso != other.codigoCurso) return false

        return true
    }

    override fun hashCode(): Int {
        return codigoCurso
    }


}