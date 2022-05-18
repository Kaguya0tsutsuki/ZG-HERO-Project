class Competencia {

    public criarCompetencia(){
        BD bd = new BD()

        print "\nNome: "
        def nomeCompetencia = System.in.newReader().readLine()

        if(nomeCompetencia == '') {
            print("\nO nome digitado não atende aos requisitos!")
            print("\nDigite um nome valido!")

            for (nomeCompetencia = System.in.newReader().readLine(); nomeCompetencia == ''; nomeCompetencia = System.in.newReader().readLine()) {
                print("\nO nome digitado não atende aos requisitos!")
                print("\nDigite um nome valido!")
            }
        }

        bd.criarCompetenciaBD(nomeCompetencia)
        bd.printCompetenciaBD()

        print "\nCompetencia criada com sucesso!\n"
    }

    public printCompetencia(){
        BD bd = new BD()

        bd.printCompetenciaBD()
    }

    public excluirCompetencia(){
        BD bd = new BD()

        bd.printCompetenciaBD()

        print("\nEscolha o ID da competencia que deseja excluir!\n")
        def id = System.in.newReader().readLine()

        bd.excluirCompetenciaBD(id)
        bd.printCompetenciaBD()

        print("\nCompetencia excluida com sucesso!\n")
    }
}
