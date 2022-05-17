class Empresa {

    public criarEmpresa(){
        BD bd = new BD()

        print "\nNome: "
        def nomeEmpresa = System.in.newReader().readLine()

        if(nomeEmpresa == '') {
            print("\nO nome digitado não atende aos requisitos!")
            print("\nDigite um nome valido!")

            for (nomeEmpresa = System.in.newReader().readLine(); nomeEmpresa == ''; nomeEmpresa = System.in.newReader().readLine()) {
                print("\nO nome digitado não atende aos requisitos!")
                print("\nDigite um nome valido!")
            }
        }

        print "CNPJ: "
        def cnpjEmpresa = System.in.newReader().readLine()

        if(cnpjEmpresa == '' || cnpjEmpresa ==~ /^\d{2}\.\d{3}\.\d{3}\/\d{4}\-\d{2}$/) {
            print("\nO nome digitado não atende aos requisitos!")
            print("\nDigite um nome valido!")

            for (cnpjEmpresa = System.in.newReader().readLine(); cnpjEmpresa == '' || cnpjEmpresa ==~ /^\d{2}\.\d{3}\.\d{3}\/\d{4}\-\d{2}$/; cnpjEmpresa = System.in.newReader().readLine()) {
                print("\nO nome digitado não atende aos requisitos!")
                print("\nDigite um nome valido!")
            }
        }

        print "Email: "
        def emailEmpresa = System.in.newReader().readLine()

        if(emailEmpresa == '' || emailEmpresa ==~ /[a-zA-Z0-9_]+@[a-zA-Z0-9_]+\.[a-zA-Z0-9_]+/) {
            print("\nO nome digitado não atende aos requisitos!")
            print("\nDigite um nome valido!")

            for (emailEmpresa = System.in.newReader().readLine(); emailEmpresa == '' || emailEmpresa ==~ /[a-zA-Z0-9_]+@[a-zA-Z0-9_]+\.[a-zA-Z0-9_]+/; emailEmpresa = System.in.newReader().readLine()) {
                print("\nO nome digitado não atende aos requisitos!")
                print("\nDigite um nome valido!")
            }
        }

        print "Descrição: "
        def descricaoEmpresa = System.in.newReader().readLine()

        if(descricaoEmpresa == '' || descricaoEmpresa.length() == 100) {
            print("\nO nome digitado não atende aos requisitos!")
            print("\nDigite um nome valido!")

            for (descricaoEmpresa = System.in.newReader().readLine(); descricaoEmpresa == '' || descricaoEmpresa.length() == 100; descricaoEmpresa = System.in.newReader().readLine()) {
                print("\nO nome digitado não atende aos requisitos!")
                print("\nDigite um nome valido!")
            }
        }

        print "Pais: "
        def paisEmpresa = System.in.newReader().readLine()

        if(paisEmpresa == '') {
            print("\nO nome digitado não atende aos requisitos!")
            print("\nDigite um nome valido!")

            for (paisEmpresa = System.in.newReader().readLine(); paisEmpresa == ''; paisEmpresa = System.in.newReader().readLine()) {
                print("\nO nome digitado não atende aos requisitos!")
                print("\nDigite um nome valido!")
            }
        }

        print "CEP: "
        def cepEmpresa = System.in.newReader().readLine()

        if(cepEmpresa == '' || cepEmpresa ==~ /^[0-9]{5}-[0-9]{3}$/) {
            print("\nO nome digitado não atende aos requisitos!")
            print("\nDigite um nome valido!")

            for (cepEmpresa = System.in.newReader().readLine(); cepEmpresa == '' || cepEmpresa ==~ /^[0-9]{5}-[0-9]{3}$/; cepEmpresa = System.in.newReader().readLine()) {
                print("\nO nome digitado não atende aos requisitos!")
                print("\nDigite um nome valido!")
            }
        }

        print "Senha: "
        def senhaEmpresa = System.in.newReader().readLine()

        if(senhaEmpresa == '' || senhaEmpresa ==~ /^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!#@%&]).{6,15}$/) {
            print("\nO nome digitado não atende aos requisitos!")
            print("\nDigite um nome valido!")

            for (senhaEmpresa = System.in.newReader().readLine(); senhaEmpresa == '' || senhaEmpresa ==~ /^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!#@%&]).{6,15}$/; senhaEmpresa = System.in.newReader().readLine()) {
                print("\nO nome digitado não atende aos requisitos!")
                print("\nDigite um nome valido!")
            }
        }

        bd.criarEmpresaBD(nomeEmpresa, cnpjEmpresa, emailEmpresa, descricaoEmpresa, paisEmpresa, cepEmpresa, senhaEmpresa)

        print("\nEmpresa criada com sucesso!")
    }

    public printEmpresa(){
        BD bd = new BD()

        bd.printEmpresaBD()
    }

    public excluirEmpresa(){
        BD bd = new BD()

        bd.printEmpresaBD()

        print("Escolha o ID da empresa q deseja excluir!")
        def id = System.in.newReader().readLine()

        bd.excluirEmpresaBD(id)
        bd.printEmpresaBD()

        print("Empresa excluida com sucesso!\n")
    }
}