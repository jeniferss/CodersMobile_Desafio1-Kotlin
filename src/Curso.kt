internal class Curso() {

    var nomeDoCurso: String = ""
    var codigoCurso: Int = 0
    var quantidadeMaximaAlunos: Int = 0
    var listaDeAlunosMatriculados: MutableList<Aluno> = mutableListOf<Aluno>()
    init{var professorTitular: ProfessorTitular}

    private fun adicionarUmAluno(aluno: Aluno): Boolean {
        if(listaDeAlunosMatriculados.size < quantidadeMaximaAlunos){
            listaDeAlunosMatriculados.add(aluno)
            return true
        } else return false
    }

    private fun excluirAluno(aluno: Aluno){
        listaDeAlunosMatriculados.remove(aluno)
    }
}