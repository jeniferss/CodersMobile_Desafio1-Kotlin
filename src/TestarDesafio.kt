
fun main(){

    val digitalHouseManager = DigitalHouseManager()


    digitalHouseManager.registrarCurso("Kotlin", 2020, 1)
    digitalHouseManager.registrarCurso("Python", 2021, 2)
    digitalHouseManager.registrarCurso("Matematica", 2022, 0)

    digitalHouseManager.registrarProfessorAdjunto("Stevan", "Marques", 123, 60)
    digitalHouseManager.registrarProfessorAdjunto("Marcelo", "Junior", 321, 30)

    digitalHouseManager.registrarProfessorTitular("Ana", "Souza", 456, "Python")
    digitalHouseManager.registrarProfessorTitular("Carlos", "Maciel", 654, "Kotlin")
    digitalHouseManager.registrarProfessorTitular("João", "Ortega", 890, "Química")

    digitalHouseManager.matricularAluno("Pedro", "Henrique", 1020)
    digitalHouseManager.matricularAluno("Gustavo", "Almeida", 2030)
    digitalHouseManager.matricularAluno("Wilson", "Prestes", 3040)
    digitalHouseManager.matricularAluno("Tina", "Rodrigues", 4050)

    digitalHouseManager.matricularAluno(1020, 2021)
    digitalHouseManager.matricularAluno(3040, 2020)
    digitalHouseManager.matricularAluno(4050, 2020)
    digitalHouseManager.matricularAluno(2030, 2021)


    digitalHouseManager.alocarProfessores(2020, 456, 123)
    digitalHouseManager.alocarProfessores(2021, 654, 321)

    println(digitalHouseManager.listaDeAlunos)
    println(digitalHouseManager.listaDeProfesores)
    println(digitalHouseManager.listaDeCursos)
    println(digitalHouseManager.listaDeMatriculas)

    println()

    digitalHouseManager.excluirCurso(2022)
    digitalHouseManager.excluirProfessor(890)
    //digitalHouseManager.testarExcluirAluno(2021)
    println(digitalHouseManager.listaDeAlunos)
    println(digitalHouseManager.listaDeProfesores)
    println(digitalHouseManager.listaDeCursos)
    println()

    for(curso in digitalHouseManager.listaDeCursos){
        println(curso.nomeDoCurso)
        println(curso.codigoCurso)
        println(curso.listaDeAlunosMatriculados)
        println(curso.professorAdjunto)
        println(curso.professorTitular)
        println()
    }
}
