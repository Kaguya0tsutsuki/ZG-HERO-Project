
class Main {

    static void main(String[] args) {
        menu()
    }

    static menuOpcao(def opcao){
        switch (opcao) {
            case "1":

                print "Nome: "
                def nome = System.in.newReader().readLine()
                print "CPF: "
                def cpf = System.in.newReader().readLine()

                File file = new File('Candidato.txt')

                def line, i = 0
                def list = []

                file.withReader { reader ->
                    while ((line = reader.readLine()) != null && (i != 8)) {
                        list.add(line)
                        if(list.size() == 8){
                            if (cpf == list[1]){
                                println "CPF já cadastrado!"
                                for (cpf = System.in.newReader().readLine(); cpf == list[1]; cpf = System.in.newReader().readLine()) {
                                    println "CPF já cadastrado!"
                                }
                            }
                            i = 0
                            list = []
                        }else {
                            i++
                        }
                    }
                }

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
                print "Campetência: "
                def competencia = System.in.newReader().readLine()

                Candidato candidato = new Candidato(nome, cpf, idade, email, estado, cep, descricao, competencia)

                criarCandidato(candidato)
                println "Candidato Criado com Sucesso!\n"
                menu()

                break

            case "2":

                print "Nome: "
                def nome = System.in.newReader().readLine()
                print "CNPJ: "
                def cnpj = System.in.newReader().readLine()

                File file = new File('Empresa.txt')

                def line, i = 0
                def list = []

                file.withReader { reader ->
                    while ((line = reader.readLine()) != null && (i != 8)) {
                        list.add(line)
                        if(list.size() == 8){
                            if (cnpj == list[1]){
                                println "CNPJ já cadastrado!"
                                for (cnpj = System.in.newReader().readLine(); cnpj == list[1]; cnpj = System.in.newReader().readLine()) {
                                    println "CNPJ já cadastrado!"
                                }
                            }
                            i = 0
                            list = []
                        }else {
                            i++
                        }
                    }
                }

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
                print "Campetência: "
                def competencia = System.in.newReader().readLine()

                Empresa empresa = new Empresa(nome, cnpj, email, pais, estado, cep, descricao,competencia)

                criarEmpresa(empresa)
                println "Empresa Criada com Sucesso!\n"
                menu()

                break

            case "3":
                printCandidato()
                menu()
                break

            case "4":
                printEmpresa()
                menu()
                break

            case "5":
                System.exit(0)
                break

            default: println("opção invalida")
        }
    }

    static criarCandidato(candidato){

        def f = new File("Candidato.txt")
        f.append(candidato.toString())

    }

    static criarEmpresa(empresa){

        def f = new File("Empresa.txt")
        f.append(empresa.toString())

    }

    static printCandidato(){

        File file = new File('Candidato.txt')

        def line, i = 0, y = 1
        def list = []
        def listTest = []

        file.withReader { reader ->
            while ((line = reader.readLine()) != null && (i != 8)) {
                list.add(line)
                listTest.add(line)
                if(list.size() == 8){
                    println "\nCandidato " + y + ":" + '\n' + "Nome: " + list[0] + '\n' +
                            "CPF: " + list[1] + '\n' + "Idade: " + list[2] + '\n' +
                            "Email: " + list[3] + '\n' + "Estado: " + list[4] + '\n' +
                            "CEP: " + list[5] + '\n' + "Descrição: " + list[6] + '\n' +
                            "Competencia: " + list[7] + '\n'
                    i = 0
                    y++
                    list = []
                }else {
                    i++
                }
            }
        }
        if (listTest == []){
            println "Nenhum Candidato Encontrado!\n" + "Crie um Candidato\n"
        }
    }

    static printEmpresa(){

        File file = new File('Empresa.txt')

        def line, i = 0, y = 1
        def list = []
        def listTest = []

        file.withReader { reader ->
            while ((line = reader.readLine()) != null && (i != 8)) {
                list.add(line)
                listTest.add(line)
                if(list.size() == 8){
                    println "\nEmpresa " + y + ":" + '\n' + "Nome: " + list[0] + '\n' +
                            "CNPJ: " + list[1] + '\n' + "Email: " + list[2] + '\n' +
                            "CEP: " + list[3] + '\n' + "Estado: " + list[4] + '\n' +
                            "País: " + list[5] + '\n' + "Descrição: " + list[6] + '\n' +
                            "Competencia: " + list[7] + '\n'
                    i = 0
                    y++
                    list = []
                }else {
                    i++
                }
            }

        }
        if (listTest == []) {
            println "Nenhuma Empresa Encontrada!\n" + "Crie uma Empresa\n"
        }
    }

    static menu(){

        print "Digite :\n" + "1 - Criar Candidato.\n" + "2 - Criar Empresa.\n" + "3 - Imprimir Candidato.\n" + "4 - Imprimir Empresa.\n" + "5 - Sair.\n"
        def opcao = System.in.newReader().readLine()
        if (opcao == '0' || opcao > '5'){
            System.out.println("Opção Inválida!");
            for(opcao = System.in.newReader().readLine(); opcao == '0' || opcao > '5'; opcao = System.in.newReader().readLine()) {
                System.out.println("Opção Inválida!");
            }
        }

        menuOpcao(opcao)

    }

}