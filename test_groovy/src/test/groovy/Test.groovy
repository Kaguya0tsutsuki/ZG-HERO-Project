import spock.lang.Specification
import spock.lang.Unroll

import static Main.criarCandidato
import static Main.criarEmpresa
import static Main.printCandidato
import static Main.printEmpresa

class Test extends Specification{

    @Unroll
    def "Verificar criarCandidato"() {

        given:
        Candidato candidato = new Candidato('João', '123.456.789-10', '21', 'emailtest@gmail.com', '74000-000', 'GO', 'sem descrição')
        criarCandidato(candidato)

        when:
        File file = new File('Candidato.txt')
        def line, i = 0
        def list = []

        file.withReader { reader ->
            while ((line = reader.readLine()) != null && (i != 8)) {
                list.add(line)
            }
            i++
        }

        then:
        assert list.toString() == '[João, 123.456.789-10, 21, emailtest@gmail.com, GO, 74000-000, sem descrição, []]'
        if (list.toString() == '[João, 123.456.789-10, 21, emailtest@gmail.com, GO, 74000-000, sem descrição, []]'){
            println '\nCandidato Criado com Sucesso!'
            File f = new File('Candidato.txt')
            f.text = ''
        }else {
            println '\nCandidato não Criado!'
        }


    }

    @Unroll
    def "Verificar criarEmpresa"() {

        given:
        Empresa empresa = new Empresa('ZG', '12.345.678/9101-12', 'emailtest@gmail.com', 'Brasil', 'GO', '74000-000', 'sem descrição')
        criarEmpresa(empresa)

        when:
        File file = new File('Empresa.txt')
        def line, i = 0
        def list = []

        file.withReader { reader ->
            while ((line = reader.readLine()) != null && (i != 8)) {
                list.add(line)
            }
            i++
        }

        then:
        assert list.toString() == '[ZG, 12.345.678/9101-12, emailtest@gmail.com, 74000-000, GO, Brasil, sem descrição, []]'
        if (list.toString() == '[ZG, 12.345.678/9101-12, emailtest@gmail.com, 74000-000, GO, Brasil, sem descrição, []]'){
            println '\nEmpresa Criada com Sucesso!'
            File f = new File('Empresa.txt')
            f.text = ''
        }else {
            println '\nEmpresa não Criada!'
        }

    }

    def "Verificar printCandidato"() {

        given:
        Candidato candidato = new Candidato('João', '123.456.789-10', '21', 'emailtest@gmail.com', '74000-000', 'GO', 'sem descrição')
        criarCandidato(candidato)

        when:
        File file = new File('Candidato.txt')

        def line, i = 0
        def list = []
        def result

        file.withReader { reader ->
            while ((line = reader.readLine()) != null && (i != 8)) {
                list.add(line)
                if(list.size() == 8){
                    result = "Candidato 1:" + '\n' + "Nome: " + list[0] + '\n' +
                            "CPF: " + list[1] + '\n' + "Idade: " + list[2] + '\n' +
                            "Email: " + list[3] + '\n' + "Estado: " + list[4] + '\n' +
                            "CEP: " + list[5] + '\n' + "Descrição: " + list[6] + '\n' +
                            "Competencia: " + list[7]
                    i = 0
                }else {
                    i++
                }
            }
        }

        then:
        assert result == 'Candidato 1:\n' + 'Nome: João\n' + 'CPF: 123.456.789-10\n' + 'Idade: 21\n' +
        'Email: emailtest@gmail.com\n' + 'Estado: GO\n' + 'CEP: 74000-000\n' + 'Descrição: sem descrição\n' + 'Competencia: []'
        if (result == 'Candidato 1:\n' + 'Nome: João\n' + 'CPF: 123.456.789-10\n' + 'Idade: 21\n' +
                'Email: emailtest@gmail.com\n' + 'Estado: GO\n' + 'CEP: 74000-000\n' + 'Descrição: sem descrição\n' + 'Competencia: []'){
            '\n' + printCandidato()
            println '\nCandidato Impresso com Sucesso!'
            File f = new File('Candidato.txt')
            f.text = ''
        }else {
            println '\nCandidato não Impresso!'
        }

    }

    def "Verificar printEmpresa"() {

        given:

        Empresa empresa = new Empresa('ZG', '12.345.678/9101-12', 'emailtest@gmail.com', 'Brasil', 'GO', '74000-000', 'sem descrição')
        criarEmpresa(empresa)

        when:
        File file = new File('Empresa.txt')

        def line, i = 0
        def list = []
        def result

        file.withReader { reader ->
            while ((line = reader.readLine()) != null && (i != 8)) {
                list.add(line)
                if(list.size() == 8){
                    result = "Empresa 1:" + '\n' + "Nome: " + list[0] + '\n' +
                            "CNPJ: " + list[1] + '\n' + "Email: " + list[2] + '\n' +
                            "CEP: " + list[3] + '\n' + "Estado: " + list[4] + '\n' +
                            "País: " + list[5] + '\n' + "Descrição: " + list[6] + '\n' +
                            "Competencia: " + list[7]
                    i = 0
                }else {
                    i++
                }
            }
        }

        then:
        assert result == 'Empresa 1:\n' + 'Nome: ZG\n' + 'CNPJ: 12.345.678/9101-12\n' + 'Email: emailtest@gmail.com\n' +
                'CEP: 74000-000\n' + 'Estado: GO\n' + 'País: Brasil\n' + 'Descrição: sem descrição\n' + 'Competencia: []'

        if (result == 'Empresa 1:\n' + 'Nome: ZG\n' + 'CNPJ: 12.345.678/9101-12\n' + 'Email: emailtest@gmail.com\n' +
                'CEP: 74000-000\n' + 'Estado: GO\n' + 'País: Brasil\n' + 'Descrição: sem descrição\n' + 'Competencia: []'){
            '\n' + printEmpresa()
            println '\nEmpresa Impresso com Sucesso!'
            File f = new File('Empresa.txt')
            f.text = ''
        }else {
            println '\nEmpresa não Impresso!'
        }

    }
}