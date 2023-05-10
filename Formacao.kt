data class Formacao(
    val nome: String,
    val descricao: String,
    private var alunos: HashSet<Usuario> = hashSetOf()
) {

    var conteudos: MutableList<ConteudoEducacional> = mutableListOf()
        private set
    fun matricular(usuario: Usuario) {
        alunos.add(usuario)
        usuario.inscreverFormacao(this)
    }

    fun adcionarConteudo(conteudo: ConteudoEducacional) {
        conteudos.add(conteudo)
    }

    fun mostrarAlunos() {
        println("Alunos Matriculados:")
        alunos.forEach {
            println(it)
        }
    }

    fun mostrarListaConteudos() {
        println("Conteudos Educacionais da Formacao:")
        conteudos.forEach {
            println(it)
        }
    }
}