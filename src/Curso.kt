internal class Curso() {

    var nomeDoCurso: String = ""
    var codigoCurso: Int = 0
    var quantidadeMaximaAlunos: Int = 0
    var listaDeAlunosMatriculados: ArrayList<Aluno> = arrayListOf()
    lateinit var professorTitular: ProfessorTitular
    lateinit var professorAdjunto: ProfessorAdjunto

   fun adicionarUmAluno(aluno: Aluno): Boolean {
        if(listaDeAlunosMatriculados.size < quantidadeMaximaAlunos){
            listaDeAlunosMatriculados.add(aluno)
            return true
        } else return false
    }

    fun excluirAluno(aluno: Aluno){
        if(listaDeAlunosMatriculados.contains(aluno)){
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