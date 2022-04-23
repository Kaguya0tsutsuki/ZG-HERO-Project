const botaoSalvarEmpresa = document.getElementById("salvar");
botaoSalvarEmpresa?.addEventListener("click", criarEmpresa);

const nomeEmpresa = document.getElementById("nome") as HTMLInputElement;
const cnpjEmpresa = document.getElementById("cnpj") as HTMLInputElement;
const emailEmpresa = document.getElementById("email") as HTMLInputElement;
const paisEmpresa = document.getElementById("pais") as HTMLInputElement;
const estadoEmpresa = document.getElementById("estado") as HTMLInputElement;
const cepEmpresa = document.getElementById("cep") as HTMLInputElement;
const descricaoEmpresa = document.getElementById("descricao") as HTMLInputElement;

const pythonEmpresa = document.getElementById("python") as HTMLInputElement;
const javaEmpresa = document.getElementById("java") as HTMLInputElement;
const groovyEmpresa = document.getElementById("groovy") as HTMLInputElement;
const cEmpresa = document.getElementById("c") as HTMLInputElement;
const jsEmpresa = document.getElementById("js") as HTMLInputElement;

const senhaEmpresa = document.getElementById("senha") as HTMLInputElement;
const confirmarSenhaEmpresa = document.getElementById("confirmar_senha") as HTMLInputElement;

let empresas: any[] = []

function criarEmpresa(this: HTMLElement, ev: Event) {
  ev.preventDefault();

  if(validarNomeEmpresa() === false){
    return
  }else if(validarCNPJEmpresa() === false){
    return
  }else if(validarEmailEmpresa() === false){
    return
  }else if(validarPaisEmpresa() === false){
    return
  }else if(validarEstadoEmpresa() === false){
    return
  }else if(validarCEPEmpresa() === false){
    return
  }else if(validarDescricaoEmpresa() === false){
    return
  }else if(validarSenhaEmpresa() === false){
    return
  }

  let empresa = new Empresa(nomeEmpresa.value, cnpjEmpresa.value, emailEmpresa.value, paisEmpresa.value, estadoEmpresa.value,
  cepEmpresa.value, descricaoEmpresa.value, [pythonEmpresa.checked, javaEmpresa.checked, groovyEmpresa.checked, cEmpresa.checked,
  jsEmpresa.checked], senhaEmpresa.value);

  empresas.push(empresa)
  alert("Empresa criada com sucesso!")
  console.log(empresas)

  limparDadosEmpresa()

}

function validarNomeEmpresa(): boolean {

  let validarNome = new RegExp(/[A-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ][a-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ]/),
      testarNome = validarNome.test(nomeEmpresa.value);
    if(nomeEmpresa.value === ""){
      alert("Nome não Informado!")
      return false
    }else if(testarNome === false){
      nomeEmpresa.value = ""
      alert("Nome Inválido!")
      return false
    }
    return true
}

function validarCNPJEmpresa(): boolean {

  let validarCNPJ = new RegExp(/^\d{2}\.\d{3}\.\d{3}\/\d{4}\-\d{2}$/),
    testarCNPJ = validarCNPJ.test(cnpjEmpresa.value);
  if(cnpjEmpresa.value === ""){
    alert("CNPJ não Informado!")
    return false
  }else if(testarCNPJ === false){
    cnpjEmpresa.value = ""
    alert("CNPJ Inválido! Utilizar XX.XXX.XXX/0001-XX")
    return false
  }
  return true
}

function validarEmailEmpresa(): boolean {

    let validarEmail = new RegExp(/[a-zA-Z0-9_]+@[a-zA-Z0-9_]+\.[a-zA-Z0-9_]+/),
      testarEmail = validarEmail.test(emailEmpresa.value);
    if(emailEmpresa.value === ""){
      alert("Email não Informado!")
      return false
    }else if(testarEmail === false){
      emailEmpresa.value = ""
      alert("Email Inválido! Utilizar email@example.com")
      return false
    }
    return true
}

function validarPaisEmpresa(): boolean {

  let validarPais = new RegExp(/[A-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ][a-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ]/),
    testarPais = validarPais.test(paisEmpresa.value);
  if(paisEmpresa.value === ""){
    alert("País não Informado!")
    return false
  }else if(testarPais === false){
    paisEmpresa.value = ""
    alert("País Inválido!")
    return false
  }
  return true

}

function validarEstadoEmpresa(): boolean {

  let validarEstado = new RegExp(/[A-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ][a-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ]/),
    testarEstado = validarEstado.test(estadoEmpresa.value);
  if(estadoEmpresa.value === ""){
    alert("Estado não Informado!")
    return false
  }else if(testarEstado === false){
    estadoEmpresa.value = ""
    alert("Estado Inválido!")
    return false
  }
  return true

}

function validarCEPEmpresa(): boolean {

  let validarCEP = new RegExp(/^[0-9]{5}-[0-9]{3}$/),
    testarCEP = validarCEP.test(cepEmpresa.value);
  if(cepEmpresa.value === ""){
    alert("CEP não Informado!")
    return false
  }else if(testarCEP === false){
    cepEmpresa.value = ""
    alert("CEP Inválido! Utilizar XXXXX-XXX")
    return false
  }
  return true

}

function validarDescricaoEmpresa(): boolean {

  if(descricaoEmpresa.value === ""){
    alert("Descrição não Informada!")
    return false
  }
  return true

}

function validarSenhaEmpresa(): boolean {

  let validarSenha = new RegExp(/^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!#@%&]).{6,15}$/),
    testarSenha = validarSenha.test(senhaEmpresa.value);
  if(senhaEmpresa.value === ""){
    alert("Senha não Informada!")
    return false
  }else if(confirmarSenhaEmpresa.value === ""){
    alert("Confirmação de senha não Informada!")
    return false
  }else if(testarSenha === false){
    senhaEmpresa.value = ""
    alert("Senha Inválida!")
    return false
  }

  if(confirmarSenhaEmpresa.value === ""){
    alert("Confirmação de senha não Informada!")
    return false
  }else if(senhaEmpresa.value != confirmarSenhaEmpresa.value){
    senhaEmpresa.value = ""
    confirmarSenhaEmpresa.value = ""
    alert("As senhas não são semelhantes!")
    return false
  }
  return true

}


function limparDadosEmpresa(){
  nomeEmpresa.value = ""
  cnpjEmpresa.value = ""
  emailEmpresa.value = ""
  paisEmpresa.value = ""
  estadoEmpresa.value = ""
  cepEmpresa.value = ""
  descricaoEmpresa.value = ""
  pythonEmpresa.checked = false
  javaEmpresa.checked = false
  cEmpresa.checked = false
  groovyEmpresa.checked = false
  jsEmpresa.checked = false
  senhaEmpresa.value = ""
  confirmarSenhaEmpresa.value = ""
}

class Empresa{

  cnpj: string
  pais: string
  competencia: any[]
  nome: string
  email: string
  estado: string
  cep: string
  descricao: string
  senha: string

  constructor(nome: string, cnpj: string, email: string, pais: string, estado: string, cep: string, descricao: string, competencia: any[], senha: string) {
      this.cnpj = cnpj
      this.pais = pais
      this.competencia = competencia
      this.nome = nome
      this.email = email
      this.estado = estado
      this.cep = cep
      this.descricao = descricao
      this.senha = senha
  }

}