package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {
    val jonh = Analista("Jonh", "987654321-00", 2000.0)
    ImprimeRelatorioFuncionario.imprime(jonh)
}
