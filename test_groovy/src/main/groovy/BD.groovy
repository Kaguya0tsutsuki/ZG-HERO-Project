import groovy.sql.Sql

class BD {



    public connected(def script) {

        def db = [url: 'jdbc:postgresql://localhost/linketinder', user: 'kaguya', password: 'Antonio0202@', driver: 'org.postgresql.Driver']
        def sql = Sql.newInstance(db.url, db.user, db.password, db.driver)

        sql.execute(script)

        sql.close()
    }

    public connectedList(def x) {

        def db = [url: 'jdbc:postgresql://localhost/linketinder', user: 'kaguya', password: 'Antonio0202@', driver: 'org.postgresql.Driver']
        def sql = Sql.newInstance(db.url, db.user, db.password, db.driver)

        sql.eachRow(x) { row ->
            println "$row"
        }

        sql.close()
    }

    public criarCandidatoBD(def nome, def sobrenome, def nascimento, def email, def cpf, def pais, def cep, def descricao, def senha){

        def script = "INSERT INTO candidato (nome, sobrenome, data_nascimento, email, cpf, pais, cep, descricao, senha) " +
                "VALUES (" + "'" + nome + "'" + ", " + "'" + sobrenome + "'" + ", " + "'" + nascimento + "'" + ", " + "'" +
                email + "'" + ", " + "'" + cpf + "'" + ", " + "'" + pais + "'" + ", " + "'" + cep + "'" + ", " + "'" +
                descricao + "'" + ", " + "'" + senha + "'" + ");"

        connected(script)
    }

    public criarEmpresaBD(def nome, def cnpj, def email, def descricao, def pais, def cep, def senha){

        def script = "INSERT INTO candidato (nome, sobrenome, data_nascimento, email, cpf, pais, cep, descricao, senha) " +
                "VALUES (" + "'" + nome + "'" + ", " + "'" + cnpj + "'" + ", " + "'" + email + "'" + ", " + "'" +
                descricao + "'" + ", " + "'" + pais + "'" + ", " + "'" + cep + "'" + ", " + "'" + senha + "'" + ");"

        connected(script)
    }

    public criarVagaBD(def nome, def descricao, def local){

        def script = "INSERT INTO candidato (nome, sobrenome, data_nascimento, email, cpf, pais, cep, descricao, senha) " +
                "VALUES (" + "'" + nome + "'" + ", " + "'" + descricao + "'" + ", " + "'" + local + "'" + ");"

        connected(script)
    }

    public criarCompetenciaBD(def nome){

        def script = "INSERT INTO competencia (nome) " +
                "VALUES (" + "'" + nome + "'" + ");"

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

}
