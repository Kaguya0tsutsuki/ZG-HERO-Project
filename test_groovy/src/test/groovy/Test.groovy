import spock.lang.Specification
import spock.lang.Unroll

class Test extends Specification{

    @Unroll
    def "Verificar criarCandidato"() {
        Candidato candidato = new Candidato('João', '123.456.789-10', '21', 'emailtest@gmail.com', '74000-000', 'GO', 'sem descrição')

    }

}