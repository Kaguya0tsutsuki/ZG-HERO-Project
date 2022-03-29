class Main {

    static void main(String[] args) {

        System.in.withReader {
            print "Digite :\n" + "1 - Criar Candidato\n" + "2 - Criar Empresa.\n"
            def opcao = it.readLine()


            switch (opcao) {
                case "1":

                    print "Nome: "
                    def nome = it.readLine()
                    print "CPF: "
                    def cpf = it.readLine()
                    print "Idade: "
                    def idade = it.readLine()
                    print "Email: "
                    def email = it.readLine()
                    print "Estado: "
                    def estado = it.readLine()
                    print "CEP: "
                    def cep = it.readLine()
                    print "Descrição: "
                    def descricao = it.readLine()

                    Candidato candidato = new Candidato(nome, cpf, idade, email, estado, cep, descricao)

                    criarCandidato(candidato)
                    break

                case "2":

                    print "Nome: "
                    def nome = it.readLine()
                    print "CNPJ: "
                    def cnpj = it.readLine()
                    print "Email: "
                    def email = it.readLine()
                    print "País: "
                    def pais = it.readLine()
                    print "Estado: "
                    def estado = it.readLine()
                    print "CEP: "
                    def cep = it.readLine()
                    print "Descrição: "
                    def descricao = it.readLine()

                    Empresa empresa = new Empresa(nome, cnpj, email, pais, estado, cep, descricao)

                    criarEmpresa(empresa)
                    break

                default: println("opção invalida")
            }

        }


//        new File('Candidato.txt').eachLine { line ->
//            println line
//        }
//
//        new File('Candidato.txt').eachLine { line, nb ->
//            println "Line $nb: $line"
//        }
//
//        def list = new File('Candidato.txt').collect { it }
//        println list
//
//        def array = new File('Candidato.txt') as String[]
//        println array

    }

    static criarCandidato(candidato){

        def writer = new File('Candidato.txt').newWriter()
        candidato {line ->
            writer.writeLine line
        }

    }

    static criarEmpresa(empresa ){
        def writer = new File('Empresa.txt').newWriter()
        empresa { line ->
            writer.writeLine line
        }
    }

}