import groovy.sql.Sql

class Main {


    static void main(String[] args) {
        menuLogin()

    }

    static menuOpcaoLogin(def opcao){
        switch (opcao){
            case "1":
                menuCandidato()
                break
            case "2":
                menuEmpresa()
                break
        }
    }

    static menuOpcaoCandidato(def opcao){
        BD bd = new BD()

        switch (opcao){
            case "1":
                print "\nNome: "
                def nomeCandidato = System.in.newReader().readLine()

                print "Sobrenome: "
                def sobrenomeCandidato = System.in.newReader().readLine()

                print "Data de Nascimento: "
                def nascimentoCandidato = System.in.newReader().readLine()

                print "Email: "
                def emailCandidato = System.in.newReader().readLine()

                print "CPF: "
                def cpfCandidato = System.in.newReader().readLine()

                print "Pais: "
                def paisCandidato = System.in.newReader().readLine()

                print "CEP: "
                def cepCandidato = System.in.newReader().readLine()

                print "Descrição: "
                def descricaoCandidato = System.in.newReader().readLine()

                print "Senha: "
                def senhaCandidato = System.in.newReader().readLine()


//                print("Para concluir o cadastro, adicione uma competencia!")
//                bd.printCompetenciaBD()
//
//                print "Nome: "
//                def nomeCompetencia = System.in.newReader().readLine()

                bd.criarCandidatoBD(nomeCandidato, sobrenomeCandidato, nascimentoCandidato, emailCandidato, cpfCandidato, paisCandidato, cepCandidato, descricaoCandidato, senhaCandidato)
//                bd.criarCompetenciaBD(nomeCompetencia)

                println "\nCandidato criado com sucesso!\n"

                break

            case "2":
                bd.printCandidatoBD()
                menuCandidato()
                break

            case "3":
                bd.printCandidatoBD()

                print("Escolha o ID do candidato q deseja excluir!")
                def id = System.in.newReader().readLine()

                bd.excluirCandidatoBD(id)
                bd.printCandidatoBD()

                print("\nCandidato excluido com sucesso!\n")
                menuCandidato()
                break

            case "4":
                menuLogin()
                break

            case "5":
                System.exit(0)
                break
        }
    }

    static menuOpcaoEmpresa(def opcao){
        BD bd = new BD()

        switch (opcao){
            case "1":
                print "\nNome: "
                def nomeEmpresa = System.in.newReader().readLine()

                print "CNPJ: "
                def cnpjEmpresa = System.in.newReader().readLine()

                print "Email: "
                def emailEmpresa = System.in.newReader().readLine()

                print "Descrição: "
                def descricaoEmpresa = System.in.newReader().readLine()

                print "Pais: "
                def paisEmpresa = System.in.newReader().readLine()

                print "CEP: "
                def cepEmpresa = System.in.newReader().readLine()

                print "Senha: "
                def senhaEmpresa = System.in.newReader().readLine()


//                print("Para concluir o cadastro, crie uma vaga!")
//
//
//                print "Nome: "
//                def nomeVaga = System.in.newReader().readLine()
//
//                print "Descrição: "
//                def descricaoVaga = System.in.newReader().readLine()
//
//                print "Local: "
//                def localVaga = System.in.newReader().readLine()

                bd.criarEmpresaBD(nomeEmpresa, cnpjEmpresa, emailEmpresa, descricaoEmpresa, paisEmpresa, cepEmpresa, senhaEmpresa)
//                bd.criarVagaBD(nomeVaga, descricaoVaga, localVaga)

                print("\nEmpresa criada com sucesso!")

                break

            case "2":
                bd.printEmpresaBD()
                menuEmpresa()
                break

            case "3":
                bd.printEmpresaBD()

                print("Escolha o ID da empresa q deseja excluir!")
                def id = System.in.newReader().readLine()

                bd.excluirEmpresaBD(id)
                bd.printEmpresaBD()

                print("Empresa excluida com sucesso!\n")
                menuEmpresa()
                break

            case "4":
                menuLogin()
                break

            case "5":
                System.exit(0)
                break
        }

    }

    static menuLogin(){

        print "\nDigite :\n" + "1 - Candidato.\n" + "2 - Empresa.\n" + "3 - Sair.\n"
        def opcao = System.in.newReader().readLine()
        if (opcao == '0' || opcao > '3'){
            System.out.println("Opção Inválida!");
            for(opcao = System.in.newReader().readLine(); opcao == '0' || opcao > '3'; opcao = System.in.newReader().readLine()) {
                System.out.println("Opção Inválida!");
            }
        }

        menuOpcaoLogin(opcao)
    }

    static menuCandidato(){

        print "\nDigite :\n" + "1 - Criar Candidato.\n" + "2 - Imprimir Candidato.\n" + "3 - Excluir Candidato.\n" + "4 - Voltar.\n" + "5 - Sair.\n"
        def opcao = System.in.newReader().readLine()
        if (opcao == '0' || opcao > '5'){
            System.out.println("Opção Inválida!");
            for(opcao = System.in.newReader().readLine(); opcao == '0' || opcao > '5'; opcao = System.in.newReader().readLine()) {
                System.out.println("Opção Inválida!");
            }
        }

        menuOpcaoCandidato(opcao)
    }

    static menuEmpresa(){

        print "\nDigite :\n" + "1 - Criar Empresa.\n" + "2 - Imprimir Empresa.\n" + "3 - Excluir Empresa.\n" + "4 - Voltar.\n" + "5 - Sair.\n"
        def opcao = System.in.newReader().readLine()
        if (opcao == '0' || opcao > '5'){
            System.out.println("Opção Inválida!");
            for(opcao = System.in.newReader().readLine(); opcao == '0' || opcao > '5'; opcao = System.in.newReader().readLine()) {
                System.out.println("Opção Inválida!");
            }
        }

        menuOpcaoEmpresa(opcao)
    }

}