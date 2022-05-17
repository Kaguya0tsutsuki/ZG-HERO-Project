class Vaga {

    public criarVaga(){
        BD bd = new BD()

        print "Nome: "
        def nomeVaga = System.in.newReader().readLine()

        if(nomeVaga == '') {
            print("\nO nome digitado não atende aos requisitos!")
            print("\nDigite um nome valido!")

            for (nomeVaga = System.in.newReader().readLine(); nomeVaga == ''; nomeVaga = System.in.newReader().readLine()) {
                print("\nO nome digitado não atende aos requisitos!")
                print("\nDigite um nome valido!")
            }
        }

        print "Descrição: "
        def descricaoVaga = System.in.newReader().readLine()

        if(descricaoVaga == '' || descricaoVaga.length() == 100) {
            print("\nA descrição digitada não atende aos requisitos!")
            print("\nDigite uma descrição valida!")

            for (descricaoVaga = System.in.newReader().readLine(); descricaoVaga == '' || descricaoVaga.length() == 100; descricaoVaga = System.in.newReader().readLine()) {
                print("\nA descrição digitada não atende aos requisitos!")
                print("\nDigite uma descrição valida!")
            }
        }

        print "Local: "
        def localVaga = System.in.newReader().readLine()

        if(localVaga == '') {
            print("\nO local digitado não atende aos requisitos!")
            print("\nDigite um local valido!")

            for (localVaga = System.in.newReader().readLine(); localVaga == ''; localVaga = System.in.newReader().readLine()) {
                print("\nO local digitado não atende aos requisitos!")
                print("\nDigite um local valido!")
            }
        }

        bd.printEmpresaBD()

        print "Digite o ID da empresa que atende a vaga: "
        def empresaVaga = System.in.newReader().readLine()

        if(bd.connectedList("SELECT * FROM empresa WHERE id = "+empresaVaga+";") == null || empresaVaga == '') {
            print("\nO id digitado não atende aos requisitos!")
            print("\nDigite um id valido!")

            for (empresaVaga = System.in.newReader().readLine(); bd.connectedList("SELECT * FROM empresa WHERE id = "+empresaVaga+";") == null || empresaVaga == ''; empresaVaga = System.in.newReader().readLine()) {
                print("\nO id digitado não atende aos requisitos!")
                print("\nDigite um id valido!")
            }
        }

        bd.criarVagaBD(nomeVaga, descricaoVaga, localVaga, empresaVaga)

        print "Vaga criada com sucesso!"
    }

    public printVaga(){
        BD bd = new BD()

        bd.printVagaBD()
    }

    public excluirVaga(){
        BD bd = new BD()

        bd.printVagaBD()

        print "ID: "
        def idVaga = System.in.newReader().readLine()

        if(idVaga == '' || bd.connectedList("SELECT * FROM empresa WHERE id = "+idVaga+";") == null) {
            print("\nO id digitado não atende aos requisitos!")
            print("\nDigite um id valido!")

            for (idVaga = System.in.newReader().readLine(); idVaga == '' || bd.connectedList("SELECT * FROM empresa WHERE id = "+idVaga+";") == null; idVaga = System.in.newReader().readLine()) {
                print("\nO id digitado não atende aos requisitos!")
                print("\nDigite um id valido!")
            }
        }

        bd.excluirVagaBD(idVaga)
        bd.printVagaBD()

        print "Vaga excluida com sucesso!"
    }
}
