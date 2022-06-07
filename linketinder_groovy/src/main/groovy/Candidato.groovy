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
            print("\nO sobrenome digitado não atende aos requisitos!")
            print("\nDigite um sobrenome valido!")

            for (sobrenomeCandidato = System.in.newReader().readLine(); sobrenomeCandidato == ''; sobrenomeCandidato = System.in.newReader().readLine()) {
                print("\nO sobrenome digitado não atende aos requisitos!")
                print("\nDigite sobrenome nome valido!")
            }
        }

        print "Data de Nascimento: "
        def nascimentoCandidato = System.in.newReader().readLine()

        if(nascimentoCandidato == '' || !(nascimentoCandidato ==~ /^(0?[1-9]|[12][0-9]|3[01])[\/\-](0?[1-9]|1[012])[\/\-]\d{4}$/)) {
            print("\nA data de nascimento digitada não atende aos requisitos!")
            print("\nDigite uma data valida!")

            for (nascimentoCandidato = System.in.newReader().readLine(); nascimentoCandidato == '' || !(nascimentoCandidato ==~ /^(0?[1-9]|[12][0-9]|3[01])[\/\-](0?[1-9]|1[012])[\/\-]\d{4}$/); nascimentoCandidato = System.in.newReader().readLine()) {
                print("\nA data de nascimento digitada não atende aos requisitos!")
                print("\nDigite uma data valida!")
            }
        }

        print "Email: "
        def emailCandidato = System.in.newReader().readLine()

        if(emailCandidato == '' || !(emailCandidato ==~ /[a-zA-Z0-9_]+@[a-zA-Z0-9_]+\.[a-zA-Z0-9_]+/)) {
            print("\nO email digitado não atende aos requisitos!")
            print("\nDigite um email valido!")

            for (emailCandidato = System.in.newReader().readLine(); emailCandidato == '' || !(emailCandidato ==~ /[a-zA-Z0-9_]+@[a-zA-Z0-9_]+\.[a-zA-Z0-9_]+/); emailCandidato = System.in.newReader().readLine()) {
                print("\nO email digitado não atende aos requisitos!")
                print("\nDigite um email valido!")
            }
        }

        print "CPF: "
        def cpfCandidato = System.in.newReader().readLine()

        if(cpfCandidato == '' || !(cpfCandidato ==~ /^[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}$/)) {
            print("\nO CPF digitado não atende aos requisitos!")
            print("\nDigite um CPF valido!")

            for (cpfCandidato = System.in.newReader().readLine(); cpfCandidato == '' || !(cpfCandidato ==~ /^[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}$/); cpfCandidato = System.in.newReader().readLine()) {
                print("\nO CPF digitado não atende aos requisitos!")
                print("\nDigite um CPF valido!")
            }
        }

        print "Pais: "
        def paisCandidato = System.in.newReader().readLine()

        if(paisCandidato == '') {
            print("\nO pais digitado não atende aos requisitos!")
            print("\nDigite um pais valido!")

            for (paisCandidato = System.in.newReader().readLine(); paisCandidato == ''; paisCandidato = System.in.newReader().readLine()) {
                print("\nO pais digitado não atende aos requisitos!")
                print("\nDigite um pais valido!")
            }
        }

        print "CEP: "
        def cepCandidato = System.in.newReader().readLine()

        if(cepCandidato == '' || !(cepCandidato ==~ /^[0-9]{5}-[0-9]{3}$/)) {
            print("\nO CEP digitado não atende aos requisitos!")
            print("\nDigite um CEP valido!")

            for (cepCandidato = System.in.newReader().readLine(); cepCandidato == '' || !(cepCandidato ==~ /^[0-9]{5}-[0-9]{3}$/); cepCandidato = System.in.newReader().readLine()) {
                print("\nO CEP digitado não atende aos requisitos!")
                print("\nDigite um CEP valido!")
            }
        }

        print "Descrição: "
        def descricaoCandidato = System.in.newReader().readLine()

        if(descricaoCandidato == '' || descricaoCandidato.length() == 100) {
            print("\nA descrição digitada não atende aos requisitos!")
            print("\nDigite uma descrição valida!")

            for (descricaoCandidato = System.in.newReader().readLine(); descricaoCandidato == '' || descricaoCandidato.length() == 100; descricaoCandidato = System.in.newReader().readLine()) {
                print("\nA descrição digitada não atende aos requisitos!")
                print("\nDigite uma descrição valida!")
            }
        }

        print "Senha: "
        def senhaCandidato = System.in.newReader().readLine()

        if(senhaCandidato == '' || !(senhaCandidato ==~ /^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!#@%&]).{6,15}$/)) {
            print("\nA senha digitada não atende aos requisitos!")
            print("\nDigite uma senha valida!")

            for (senhaCandidato = System.in.newReader().readLine(); senhaCandidato == '' || !(senhaCandidato ==~ /^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!#@%&]).{6,15}$/); senhaCandidato = System.in.newReader().readLine()) {
                print("\nA senha digitada não atende aos requisitos!")
                print("\nDigite uma senha valida!")
            }
        }

        bd.criarCandidatoBD(nomeCandidato, sobrenomeCandidato, nascimentoCandidato, emailCandidato, cpfCandidato, paisCandidato, cepCandidato, descricaoCandidato, senhaCandidato)
        println "\nCandidato criado com sucesso!\n"

        print "\nPara concluir o cadastro, adicione uma competencia!\n"

        bd.printCompetenciaBD()

        print "Digite o id de cada competencia (uma por vez) e aperte ENTER, para finalizar digite '0'!\n"

        print "\nID: "
        def idCompetencia = System.in.newReader().readLine()
        def idCandidato = bd.connectedID("SELECT * FROM candidato WHERE nome = '"+nomeCandidato+"';")

        while (true) {

            if(idCompetencia == "0"){
                break
            }

            if (bd.connectedList("SELECT * FROM competencia WHERE id = " + idCompetencia) == '' || idCompetencia == '') {
                print("\nO id digitado não atende aos requisitos!")
                print("\nDigite um id valido!")
            }

            bd.criarCandidatoCompetencia(idCandidato, idCompetencia)

            print "ID: "
            idCompetencia = System.in.newReader().readLine()



        }

        print "Competencias adicionadas com sucesso!"

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