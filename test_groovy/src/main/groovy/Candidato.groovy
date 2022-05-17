class Candidato {

    public criarCandidato(){
        BD bd = new BD()

        print "\nNome: "
        def nomeCandidato = System.in.newReader().readLine()

        if(nomeCandidato == '') {
            print("\nO nome digitado não atende aos requisitos!")
            print("\nDigite um nome valido!")

            for (nomeCandidato = System.in.newReader().readLine(); nomeCandidato == ''; nomeCandidato = System.in.newReader().readLine()) {
                print("\nO nome digitado não atende aos requisitos!")
                print("\nDigite um nome valido!")
            }
        }

        print "Sobrenome: "
        def sobrenomeCandidato = System.in.newReader().readLine()

        if(sobrenomeCandidato == '') {
            print("\nO nome digitado não atende aos requisitos!")
            print("\nDigite um nome valido!")

            for (sobrenomeCandidato = System.in.newReader().readLine(); sobrenomeCandidato == ''; sobrenomeCandidato = System.in.newReader().readLine()) {
                print("\nO nome digitado não atende aos requisitos!")
                print("\nDigite um nome valido!")
            }
        }

        print "Data de Nascimento: "
        def nascimentoCandidato = System.in.newReader().readLine()

        if(nascimentoCandidato == '' || nascimentoCandidato ==~ /^(0?[1-9]|[12][0-9]|3[01])[\/\-](0?[1-9]|1[012])[\/\-]\d{4}$/) {
            print("\nO nome digitado não atende aos requisitos!")
            print("\nDigite um nome valido!")

            for (nascimentoCandidato = System.in.newReader().readLine(); nascimentoCandidato == '' || nascimentoCandidato ==~ /^(0?[1-9]|[12][0-9]|3[01])[\/\-](0?[1-9]|1[012])[\/\-]\d{4}$/; nascimentoCandidato = System.in.newReader().readLine()) {
                print("\nO nome digitado não atende aos requisitos!")
                print("\nDigite um nome valido!")
            }
        }

        print "Email: "
        def emailCandidato = System.in.newReader().readLine()

        if(emailCandidato == '' || emailCandidato ==~ /[a-zA-Z0-9_]+@[a-zA-Z0-9_]+\.[a-zA-Z0-9_]+/) {
            print("\nO nome digitado não atende aos requisitos!")
            print("\nDigite um nome valido!")

            for (emailCandidato = System.in.newReader().readLine(); emailCandidato == '' || emailCandidato ==~ /[a-zA-Z0-9_]+@[a-zA-Z0-9_]+\.[a-zA-Z0-9_]+/; emailCandidato = System.in.newReader().readLine()) {
                print("\nO nome digitado não atende aos requisitos!")
                print("\nDigite um nome valido!")
            }
        }

        print "CPF: "
        def cpfCandidato = System.in.newReader().readLine()

        if(cpfCandidato == '' || cpfCandidato ==~ /^[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}$/) {
            print("\nO nome digitado não atende aos requisitos!")
            print("\nDigite um nome valido!")

            for (cpfCandidato = System.in.newReader().readLine(); cpfCandidato == '' || cpfCandidato ==~ /^[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}$/; cpfCandidato = System.in.newReader().readLine()) {
                print("\nO nome digitado não atende aos requisitos!")
                print("\nDigite um nome valido!")
            }
        }

        print "Pais: "
        def paisCandidato = System.in.newReader().readLine()

        if(paisCandidato == '') {
            print("\nO nome digitado não atende aos requisitos!")
            print("\nDigite um nome valido!")

            for (paisCandidato = System.in.newReader().readLine(); paisCandidato == ''; paisCandidato = System.in.newReader().readLine()) {
                print("\nO nome digitado não atende aos requisitos!")
                print("\nDigite um nome valido!")
            }
        }

        print "CEP: "
        def cepCandidato = System.in.newReader().readLine()

        if(cepCandidato == '' || cepCandidato ==~ /^[0-9]{5}-[0-9]{3}$/) {
            print("\nO nome digitado não atende aos requisitos!")
            print("\nDigite um nome valido!")

            for (cepCandidato = System.in.newReader().readLine(); cepCandidato == '' || cepCandidato ==~ /^[0-9]{5}-[0-9]{3}$/; cepCandidato = System.in.newReader().readLine()) {
                print("\nO nome digitado não atende aos requisitos!")
                print("\nDigite um nome valido!")
            }
        }

        print "Descrição: "
        def descricaoCandidato = System.in.newReader().readLine()

        if(descricaoCandidato == '' || descricaoCandidato.length() == 100) {
            print("\nO nome digitado não atende aos requisitos!")
            print("\nDigite um nome valido!")

            for (descricaoCandidato = System.in.newReader().readLine(); descricaoCandidato == '' || descricaoCandidato.length() == 100; descricaoCandidato = System.in.newReader().readLine()) {
                print("\nO nome digitado não atende aos requisitos!")
                print("\nDigite um nome valido!")
            }
        }

        print "Senha: "
        def senhaCandidato = System.in.newReader().readLine()

        if(senhaCandidato == '' || senhaCandidato ==~ /^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!#@%&]).{6,15}$/) {
            print("\nO nome digitado não atende aos requisitos!")
            print("\nDigite um nome valido!")

            for (senhaCandidato = System.in.newReader().readLine(); senhaCandidato == '' || senhaCandidato ==~ /^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!#@%&]).{6,15}$/; senhaCandidato = System.in.newReader().readLine()) {
                print("\nO nome digitado não atende aos requisitos!")
                print("\nDigite um nome valido!")
            }
        }


//                print("Para concluir o cadastro, adicione uma competencia!")
//                bd.printCompetenciaBD()
//
//                print "Nome: "
//                def nomeCompetencia = System.in.newReader().readLine()

        bd.criarCandidatoBD(nomeCandidato, sobrenomeCandidato, nascimentoCandidato, emailCandidato, cpfCandidato, paisCandidato, cepCandidato, descricaoCandidato, senhaCandidato)
//                bd.criarCompetenciaBD(nomeCompetencia)

        println "\nCandidato criado com sucesso!\n"
    }

    public printCandidato(){
        BD bd = new BD()

        bd.printCandidatoBD()
    }

    public excluirCandidato(){
        BD bd = new BD()

        bd.printCandidatoBD()

        print("Escolha o ID do candidato q deseja excluir!")
        def id = System.in.newReader().readLine()

        bd.excluirCandidatoBD(id)
        bd.printCandidatoBD()

        print("\nCandidato excluido com sucesso!\n")
    }
}