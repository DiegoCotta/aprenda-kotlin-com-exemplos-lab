// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)
fun main() {
    val curso1 = ConteudoEducacional(
        "curso 1",
        "curso legal 1",
        Nivel.INTERMEDIARIO,
        8
    )


    val curso2 = ConteudoEducacional(
        "curso 2",
        "Curso rapido",
        Nivel.BASICO,
        4
    )

    val curso3 = ConteudoEducacional(
        "curso 3",
        "Curso bem dificil",
        Nivel.DIFICIL,
        5
    )

    val formacao = Formacao("Bootcamp", "Descrição Bootcamp Java Developer")
    formacao.adcionarConteudo(curso1)
    formacao.adcionarConteudo(curso2)
    formacao.adcionarConteudo(curso3)

    val devCamila = Usuario("Camila")
    formacao.matricular(devCamila)
    System.out.println("XP Camila:" + devCamila.calcularTotalXp())
    devCamila.progredir()
    devCamila.progredir()
    println("-")
    System.out.println("XP Camila:" + devCamila.calcularTotalXp())

    println("-------")

    val devDiego = Usuario("Diego")
    formacao.matricular(devDiego)
    System.out.println("XP Diego:" + devDiego.calcularTotalXp())
    devDiego.progredir()
    devDiego.progredir()
    devDiego.progredir()
    println("-")
    System.out.println("XP Diego:" + devDiego.calcularTotalXp())
}
