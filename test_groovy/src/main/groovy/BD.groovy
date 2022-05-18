import groovy.sql.Sql

class BD {

    public connected(def script) {

        def db = [url: 'jdbc:postgresql://localhost/linketinder', user: 'kaguya', password: 'Antonio0202@', driver: 'org.postgresql.Driver']
        def sql = Sql.newInstance(db.url, db.user, db.password, db.driver)

        sql.execute(script)

        sql.close()
    }

    public connectedList(def script) {

        def db = [url: 'jdbc:postgresql://localhost/linketinder', user: 'kaguya', password: 'Antonio0202@', driver: 'org.postgresql.Driver']
        def sql = Sql.newInstance(db.url, db.user, db.password, db.driver)
        def dado = ""

        sql.eachRow(script) { row ->
            println "$row"
            dado = "$row"
        }

        sql.close()

        return dado
    }

    public connectedID(def script) {

        def db = [url: 'jdbc:postgresql://localhost/linketinder', user: 'kaguya', password: 'Antonio0202@', driver: 'org.postgresql.Driver']
        def sql = Sql.newInstance(db.url, db.user, db.password, db.driver)
        def dado

        sql.eachRow(script) { row ->
            dado = "$row.id"
        }

        sql.close()

        return dado
    }

    public criarCandidatoBD(def nome, def sobrenome, def nascimento, def email, def cpf, def pais, def cep, def descricao, def senha){

        def script = "INSERT INTO candidato (nome, sobrenome, data_nascimento, email, cpf, pais, cep, descricao, senha) " +
                "VALUES (" + "'" + nome + "'" + ", " + "'" + sobrenome + "'" + ", " + "'" + nascimento + "'" + ", " + "'" +
                email + "'" + ", " + "'" + cpf + "'" + ", " + "'" + pais + "'" + ", " + "'" + cep + "'" + ", " + "'" +
                descricao + "'" + ", " + "'" + senha + "'" + ");"

        connected(script)
    }

    public criarEmpresaBD(def nome, def cnpj, def email, def descricao, def pais, def cep, def senha){

        def script = "INSERT INTO empresa (nome, cnpj, email, descricao, pais, cep, senha) " +
                "VALUES (" + "'" + nome + "'" + ", " + "'" + cnpj + "'" + ", " + "'" + email + "'" + ", " + "'" +
                descricao + "'" + ", " + "'" + pais + "'" + ", " + "'" + cep + "'" + ", " + "'" + senha + "'" + ");"

        connected(script)
    }

    public criarVagaBD(def nome, def descricao, def local, def id){

        def script = "INSERT INTO vaga (nome, descricao, local, id_empresa) " +
                "VALUES (" + "'" + nome + "'" + ", " + "'" + descricao + "'" + ", " + "'" + local + "'" + ", " + id + ");"

        connected(script)
    }

    public criarCompetenciaBD(def nome){

        def script = "INSERT INTO competencia (nome) VALUES (" + "'" + nome + "'" + ");"

        connected(script)
    }

    public criarCandidatoCompetencia(def idcandidato, def idcompetencia){

        def script = "INSERT INTO candidato_competencia(id_candidato, id_competencia) VALUES (" + idcandidato + ", " + idcompetencia + ")"

        connected(script)
    }

    public printCandidatoBD(){
        connectedList("SELECT * FROM candidato;")
    }

    public printEmpresaBD(){
        connectedList("SELECT * FROM empresa;")
    }

    public printCompetenciaBD(){
        connectedList("SELECT * FROM competencia;")
    }

    public printVagaBD(){
        connectedList("SELECT * FROM vaga;")
    }

    public excluirCandidatoBD(def id){
        connected("DELETE FROM candidato WHERE id = "+id+";")
    }

    public excluirEmpresaBD(def id){
        connected("DELETE FROM empresa WHERE id = "+id+";")
    }

    public excluirVagaBD(def id){
        connected("DELETE FROM vaga WHERE id = "+id+";")
    }

    public excluirCompetenciaBD(def id){
        connected("DELETE FROM competencia WHERE id = "+id+";")
    }

}
