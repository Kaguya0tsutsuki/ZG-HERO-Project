import groovy.sql.Sql

class Main {


    static void main(String[] args) {
        menuLogin()

//        BD bd = new BD()
//        def c = 6
//        if(bd.connectedList("select * from candidato WHERE id = "+c+";") == null){
//            print true
//        }else {
//            print false
//        }
    }

    static menuOpcaoLogin(def opcao){
        switch (opcao){
            case "1":
                menuCandidato()
                break
            case "2":
                menuEmpresa()
                break
            case "3":
                menuVaga()
                break
            case "4":
                menuCompetencia()
                break
            case "5":
                System.exit(0)
                break
        }
    }

    static menuOpcaoCandidato(def opcao){
        Candidato candidato = new Candidato()

        switch (opcao){
            case "1":
                candidato.criarCandidato()
                menuCandidato()
                break

            case "2":
                candidato.printCandidato()
                menuCandidato()
                break

            case "3":
                candidato.excluirCandidato()
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
        Empresa empresa = new Empresa()

        switch (opcao){
            case "1":
                empresa.criarEmpresa()
                menuEmpresa()
                break

            case "2":
                empresa.printEmpresa()
                menuEmpresa()
                break

            case "3":
                empresa.excluirEmpresa()
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

    static menuOpcaoVaga(def opcao){
        Vaga vaga = new Vaga()

        switch (opcao){
            case "1":
                vaga.criarVaga()
                menuVaga()
                break

            case "2":
                vaga.printVaga()
                menuVaga()
                break

            case "3":
                vaga.excluirVaga()
                menuVaga()
                break

            case "4":
                menuLogin()
                break

            case "5":
                System.exit(0)
                break
        }
    }

    static menuOpcaoCompetencia(def opcao){
        BD bd = new BD()

        switch (opcao){
            case "1":

                break
            case "2":
                bd.printCompetenciaBD()
                break
            case "3":
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

        print "\nDigite :\n" + "1 - Candidato.\n" + "2 - Empresa.\n" + "3 - Vaga.\n" + "4 - Competencia.\n" + "5 - Sair.\n"
        def opcao = System.in.newReader().readLine()
        if (opcao == '0' || opcao > '5'){
            print "Opção Inválida!"
            for(opcao = System.in.newReader().readLine(); opcao == '0' || opcao > '5'; opcao = System.in.newReader().readLine()) {
                print "Opção Inválida!"
            }
        }

        menuOpcaoLogin(opcao)
    }

    static menuCandidato(){

        print "\nDigite :\n" + "1 - Criar Candidato.\n" + "2 - Imprimir Candidato.\n" + "3 - Excluir Candidato.\n" + "4 - Voltar.\n" + "5 - Sair.\n"
        def opcao = System.in.newReader().readLine()
        if (opcao == '0' || opcao > '5'){
            print "Opção Inválida!"
            for(opcao = System.in.newReader().readLine(); opcao == '0' || opcao > '5'; opcao = System.in.newReader().readLine()) {
                print "Opção Inválida!"
            }
        }

        menuOpcaoCandidato(opcao)
    }

    static menuEmpresa(){

        print "\nDigite :\n" + "1 - Criar Empresa.\n" + "2 - Imprimir Empresa.\n" + "3 - Excluir Empresa.\n" + "4 - Voltar.\n" + "5 - Sair.\n"
        def opcao = System.in.newReader().readLine()
        if (opcao == '0' || opcao > '5'){
            print "Opção Inválida!"
            for(opcao = System.in.newReader().readLine(); opcao == '0' || opcao > '5'; opcao = System.in.newReader().readLine()) {
                print "Opção Inválida!"
            }
        }

        menuOpcaoEmpresa(opcao)
    }

    static menuVaga(){

        print "\nDigite :\n" + "1 - Criar Vaga.\n" + "2 - Imprimir Vaga.\n" + "3 - Excluir Vaga.\n" + "4 - Voltar.\n" + "5 - Sair.\n"
        def opcao = System.in.newReader().readLine()
        if (opcao == '0' || opcao > '5'){
            print "Opção Inválida!"
            for(opcao = System.in.newReader().readLine(); opcao == '0' || opcao > '5'; opcao = System.in.newReader().readLine()) {
                print "Opção Inválida!"
            }
        }

        menuOpcaoVaga(opcao)
    }

    static menuCompetencia(){

        print "\nDigite :\n" + "1 - Criar Competencia.\n" + "2 - Imprimir Competencia.\n" + "3 - Excluir Competencia.\n" + "4 - Voltar.\n" + "5 - Sair.\n"
        def opcao = System.in.newReader().readLine()
        if (opcao == '0' || opcao > '5'){
            print "Opção Inválida!"
            for(opcao = System.in.newReader().readLine(); opcao == '0' || opcao > '5'; opcao = System.in.newReader().readLine()) {
                print "Opção Inválida!"
            }
        }

        menuOpcaoCompetencia(opcao)
    }

}