internal class DigitalHouseManager {

    var listaDeAlunos: MutableList<Aluno> = mutableListOf<Aluno>()
    var listaDeProfesores: MutableList<Professor> = mutableListOf<Professor>()
    var listaDeCursos: MutableList<Curso> = mutableListOf<Curso>()
    var listaDeMatriculas: MutableList<Matricula> = mutableListOf<Matricula>()

    private fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int){
        val newCurso: Curso = Curso()
        newCurso.nomeDoCurso = nome
        newCurso.codigoCurso = codigoCurso
        newCurso.quantidadeMaximaAlunos = quantidadeMaximaDeAlunos
        listaDeCursos.add(newCurso)
    }

    private fun excluirCurso(codigoCurso: Int) {
        listaDeCursos.forEach {
            if(codigoCurso == it.codigoCurso) listaDeCursos.removeAt(codigoCurso)
        }
    }
}