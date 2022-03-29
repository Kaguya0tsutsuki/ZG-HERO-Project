package Main

class Main {

    static void main(String[] args) {
//                        0         1       2         3               4         5        6              7
        String[] cC = ["Java", "Groovy", "C#", "Java Script", "Type Script", "C++", "Python", "Spring Framework"]
        assert cC instanceof String[]
        assert !(cC instanceof List)

        Candidato candidato1 = new Candidato("João Marcos", "132.454.634-75", 29, "joaomarcos@gmail.com", "GO", "76600-000", "Formado em Sistemas da Informação, 5 anos de experiência.", cC[1], cC[6])
        Candidato candidato2 = new Candidato("Maria das Graças", "496.625.874-64", 46, "mariadasgraca@gmail.com", "TO", "36512-000", "Programador a mais de 20 anos, Pos graduação em redes.", cC[2], cC[5], cC[7])
        Candidato candidato3 = new Candidato("José Antônio", "374.847.256-76", 31, "joseantonio@gmail.com", "GO", "76600-000", "Cursando Ciências da Computação, 9 periodo.", cC[0], cC[4], cC[5])
        Candidato candidato4 = new Candidato("Marcos Viniccius", "835.874.924-82", 26, "marcosviniccius@gmail.com", "MT", "58832-000", "Novo no ramo de programação, Formado em T.I.", cC[0], cC[4])
        Candidato candidato5 = new Candidato("Suelen Batista", "924.373.952-89", 38, "suelenbatista@gmail.com", "BH", "40020-176", "10 anos de experiência em Java Script e Spring Framework.", cC[3], cC[6], cC[7])

//                        0         1       2         3               4         5        6              7
        String[] cE = ["Java", "Groovy", "C#", "Java Script", "Type Script", "C++", "Python", "Spring Framework"]
        assert cE instanceof String[]
        assert !(cE instanceof List)

        Empresa empresa1 = new Empresa("Goias Turismo", "35.534.746/0001-36", "goiasturismo@gt.gov.br", "Brasil", "GO", "76495-000","Empresa expecializada em Turismo, a procura de proficionais em programação.", cE[1], cE[5], cE[6])
        Empresa empresa2 = new Empresa("Assembleia", "74.356.856/0001-64", "assembleia@al.leg.br", "Brasil", "GO", "75396-000","Empresa do estado, focada em manter todos os sites do governo funcionando.", cE[0], cE[3], cE[4], cE[7])
        Empresa empresa3 = new Empresa("Saneago", "76.763.756/0001-82", "saneago@gov.br", "Brasil", "GO", "76304-000","Empresa de saneamento basico do estado.", cE[2], cE[4], cE[6])
        Empresa empresa4 = new Empresa("Enel", "13.873.363/0001-76", "enel@gov.br", "Brasil", "GO", "76363-000","Empresa de distribuição, contrata-se programador com experiência.", cE[4], cE[5])
        Empresa empresa5 = new Empresa("Minas Bank", "84.857.245/0001-46", "minabank@bank.com.br", "Brasil", "GO", "72960-000","Empresa bancaria, trabalhando para manter o seu dinheiro seguro.", cE[0], cE[1], cE[3], cE[4], cE[7])

        System.out.println(candidato1)
        System.out.println(candidato2)
        System.out.println(candidato3)
        System.out.println(candidato4)
        System.out.println(candidato5)

        System.out.println("")

        System.out.println(empresa1)
        System.out.println(empresa2)
        System.out.println(empresa3)
        System.out.println(empresa4)
        System.out.println(empresa5)
    }
}