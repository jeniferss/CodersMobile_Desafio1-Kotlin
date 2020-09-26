import java.time.LocalDateTime

internal class DigitalHouseManager {

    var listaDeAlunos: MutableList<Aluno> = mutableListOf()
    var listaDeProfesores: MutableList<Professor> = mutableListOf()
    var listaDeCursos: MutableList<Curso> = mutableListOf()
    var listaDeMatriculas: MutableList<Matricula> = mutableListOf()

    private fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int){
        val newCurso = Curso()
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

    private fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int){
        val newProfessorAdjunto = ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantidadeDeHoras )
        listaDeProfesores.add(newProfessorAdjunto)
    }

    private fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String){
        val newProfessorTitular = ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade)
        listaDeProfesores.add(newProfessorTitular)
    }

    private fun excluirProfessor(codigoProfessor: Int){
        listaDeProfesores.forEach {
            if(codigoProfessor == it.codigoProfessor) listaDeProfesores.removeAt(codigoProfessor)
        }
    }

    private fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int){
        val newAluno = Aluno(nome, sobrenome, codigoAluno)
        listaDeAlunos.add(newAluno)
    }

    private fun matricularAluno(codigoAluno: Int, codigoProfessor: Int){
        val aluno = listaDeAlunos.get(codigoAluno)
        val curso = listaDeCursos.get(codigoProfessor)
        if(curso.quantidadeMaximaAlunos < curso.listaDeAlunosMatriculados.size){
            val newMatricula = Matricula(aluno, curso, LocalDateTime.now())
            listaDeMatriculas.add(newMatricula)
            println("Matrícula Realizada Com Sucesso")
        } else println("A matrícula não pôde ser realizada. Não há vagas disponiveis")
    }

    private fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){
        val curso = listaDeCursos.get(codigoCurso)

        curso.professorTitular = listaDeProfesores.get(codigoProfessorTitular) as ProfessorTitular
        curso.professorAdjunto = listaDeProfesores.get(codigoProfessorAdjunto) as ProfessorAdjunto
    }
}