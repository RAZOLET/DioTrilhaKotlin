package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Rafael"
    var cpf: String = "123.123.123-11"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"


/*    inner class Endereco {
        var rua: String = "Rua Teste"
    }*/
}

fun main() {
    val rafael = Pessoa()
//    rafael.cpf = "4567"

/*    println(rafael)
    println(rafael.nome)
    println(rafael.cpf)*/
    println(rafael.pessoaInfo())

//    println(rafael.Endereco().rua)
}