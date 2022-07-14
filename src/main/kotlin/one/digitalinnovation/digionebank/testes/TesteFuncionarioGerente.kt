package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {
    val maria = Analista("Maria", "987654321-00", 5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}
