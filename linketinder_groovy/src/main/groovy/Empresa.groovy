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

        if(cnpjEmpresa == '' || !(cnpjEmpresa ==~ /^\d{2}\.\d{3}\.\d{3}\/\d{4}\-\d{2}$/)) {
            print("\nO CNPJ digitado não atende aos requisitos!")
            print("\nDigite um CNPJ valido!")

            for (cnpjEmpresa = System.in.newReader().readLine(); cnpjEmpresa == '' || !(cnpjEmpresa ==~ /^\d{2}\.\d{3}\.\d{3}\/\d{4}\-\d{2}$/); cnpjEmpresa = System.in.newReader().readLine()) {
                print("\nO CNPJ digitado não atende aos requisitos!")
                print("\nDigite um CNPJ valido!")
            }
        }

        print "Email: "
        def emailEmpresa = System.in.newReader().readLine()

        if(emailEmpresa == '' || !(emailEmpresa ==~ /[a-zA-Z0-9_]+@[a-zA-Z0-9_]+\.[a-zA-Z0-9_]+/)) {
            print("\nO email digitado não atende aos requisitos!")
            print("\nDigite um email valido!")

            for (emailEmpresa = System.in.newReader().readLine(); emailEmpresa == '' || !(emailEmpresa ==~ /[a-zA-Z0-9_]+@[a-zA-Z0-9_]+\.[a-zA-Z0-9_]+/); emailEmpresa = System.in.newReader().readLine()) {
                print("\nO email digitado não atende aos requisitos!")
                print("\nDigite um email valido!")
            }
        }

        print "Descrição: "
        def descricaoEmpresa = System.in.newReader().readLine()

        if(descricaoEmpresa == '' || descricaoEmpresa.length() == 100) {
            print("\nA descrição digitada não atende aos requisitos!")
            print("\nDigite uma descrição valida!")

            for (descricaoEmpresa = System.in.newReader().readLine(); descricaoEmpresa == '' || descricaoEmpresa.length() == 100; descricaoEmpresa = System.in.newReader().readLine()) {
                print("\nA descrição digitada não atende aos requisitos!")
                print("\nDigite uma descrição valida!")
            }
        }

        print "Pais: "
        def paisEmpresa = System.in.newReader().readLine()

        if(paisEmpresa == '') {
            print("\nO pais digitado não atende aos requisitos!")
            print("\nDigite um pais valido!")

            for (paisEmpresa = System.in.newReader().readLine(); paisEmpresa == ''; paisEmpresa = System.in.newReader().readLine()) {
                print("\nO pais digitado não atende aos requisitos!")
                print("\nDigite um pais valido!")
            }
        }

        print "CEP: "
        def cepEmpresa = System.in.newReader().readLine()

        if(cepEmpresa == '' || !(cepEmpresa ==~ /^[0-9]{5}-[0-9]{3}$/)) {
            print("\nO CEP digitado não atende aos requisitos!")
            print("\nDigite um CEP valido!")

            for (cepEmpresa = System.in.newReader().readLine(); cepEmpresa == '' || !(cepEmpresa ==~ /^[0-9]{5}-[0-9]{3}$/); cepEmpresa = System.in.newReader().readLine()) {
                print("\nO CEP digitado não atende aos requisitos!")
                print("\nDigite um CEP valido!")
            }
        }

        print "Senha: "
        def senhaEmpresa = System.in.newReader().readLine()

        if(senhaEmpresa == '' || !(senhaEmpresa ==~ /^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!#@%&]).{6,15}$/)) {
            print("\nA senha digitada não atende aos requisitos!")
            print("\nDigite uma senha valida!")

            for (senhaEmpresa = System.in.newReader().readLine(); senhaEmpresa == '' || !(senhaEmpresa ==~ /^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!#@%&]).{6,15}$/); senhaEmpresa = System.in.newReader().readLine()) {
                print("\nA senha digitada não atende aos requisitos!")
                print("\nDigite uma senha valida!")
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

        print("Escolha o ID da empresa que deseja excluir!")
        def id = System.in.newReader().readLine()

        bd.excluirEmpresaBD(id)
        bd.printEmpresaBD()

        print("Empresa excluida com sucesso!\n")
    }
}