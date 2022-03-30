
class Main {

    static void main(String[] args) {
        menu()

//        def f = new File('Candidato.txt')
//        f.text = ''
    }

    static menuOpcao(def opcao){
        switch (opcao) {
            case "1":

                print "Nome: "
                def nome = System.in.newReader().readLine()
                print "CPF: "
                def cpf = System.in.newReader().readLine()
                print "Idade: "
                def idade = System.in.newReader().readLine()
                print "Email: "
                def email = System.in.newReader().readLine()
                print "Estado: "
                def estado = System.in.newReader().readLine()
                print "CEP: "
                def cep = System.in.newReader().readLine()
                print "Descrição: "
                def descricao = System.in.newReader().readLine()

                Candidato candidato = new Candidato(nome, cpf, idade, email, estado, cep, descricao)

                criarCandidato(candidato)
                break

            case "2":

                print "Nome: "
                def nome = System.in.newReader().readLine()
                print "CNPJ: "
                def cnpj = System.in.newReader().readLine()
                print "Email: "
                def email = System.in.newReader().readLine()
                print "País: "
                def pais = System.in.newReader().readLine()
                print "Estado: "
                def estado = System.in.newReader().readLine()
                print "CEP: "
                def cep = System.in.newReader().readLine()
                print "Descrição: "
                def descricao = System.in.newReader().readLine()

                Empresa empresa = new Empresa(nome, cnpj, email, pais, estado, cep, descricao)

                criarEmpresa(empresa)
                break

            case "3":
                printCandidato()
                break

            case "4":
                printEmpresa()
                break

            default: println("opção invalida")
        }
    }

    static criarCandidato(candidato){

        def f = new File("Candidato.txt")
        f.append(candidato.toString())

        println "Candidato Criado com Sucesso!\n"

        menu()

    }

    static criarEmpresa(empresa){

        def f = new File('Empresa.txt')
        f.append(empresa.toString() + '\n')

        println "Empresa Criada com Sucesso!\n"

        menu()

    }

    static printCandidato(){

        File file = new File('Candidato.txt')

        def line, i = 0, y = 1
        def list = []

        file.withReader { reader ->
            while ((line = reader.readLine()) != null && (i != 8)) {
                list.add(line)
                if(list.size() == 8){
                    println "\nCandidato " + y + ":" + '\n' + "Nome: " + list[0] + '\n' +
                            "CPF: " + list[1] + '\n' + "Idade: " + list[2] + '\n' +
                            "Email: " + list[3] + '\n' + "Estado: " + list[4] + '\n' +
                            "CEP: " + list[5] + '\n' + "Descrição: " + list[6] + '\n' +
                            "Competencia: " + list[7]
                    i = 0
                    y++
                    list = []
                }else {
                    i++
                }
            }
        }

    }

    static printEmpresa(){

        File file = new File('Empresa.txt')

        def line, i = 0, y = 1
        def list = []

        file.withReader { reader ->
            while ((line = reader.readLine()) != null && (i != 8)) {
                list.add(line)
                if(list.size() == 8){
                    println "\nEmpresa " + y + ":" + '\n' + "Nome: " + list[0] + '\n' +
                            "CNPJ: " + list[1] + '\n' + "Email: " + list[2] + '\n' +
                            "CEP: " + list[3] + '\n' + "Estado: " + list[4] + '\n' +
                            "País: " + list[5] + '\n' + "Descrição: " + list[6] + '\n' +
                            "Competencia: " + list[7]
                    i = 0
                    y++
                    list = []
                }else {
                    i++
                }
            }
        }

    }

    static menu(){

        print "Digite :\n" + "1 - Criar Candidato.\n" + "2 - Criar Empresa.\n" + "3 - Imprimir Candidato.\n" + "4 - Imprimir Empresa.\n"
        def opcao = System.in.newReader().readLine()

        menuOpcao(opcao)

    }

}