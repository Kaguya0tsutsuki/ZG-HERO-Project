const botaoSalvarCandidato = document.getElementById("salvar");
botaoSalvarCandidato?.addEventListener("click", criarCandidato);

const nomeCandidato = document.getElementById("nome") as HTMLInputElement;
const cpfCandidato = document.getElementById("cpf") as HTMLInputElement;
const idadeCandidato = document.getElementById("idade") as HTMLInputElement;
const emailCandidato = document.getElementById("email") as HTMLInputElement;
const estadoCandidato = document.getElementById("estado") as HTMLInputElement;
const cepCandidato = document.getElementById("cep") as HTMLInputElement;
const descricaoCandidato = document.getElementById("descricao") as HTMLInputElement;

const pythonCandidato = document.getElementById("python") as HTMLInputElement;
const javaCandidato = document.getElementById("java") as HTMLInputElement;
const groovyCandidato = document.getElementById("groovy") as HTMLInputElement;
const cCandidato = document.getElementById("c") as HTMLInputElement;
const jsCandidato = document.getElementById("js") as HTMLInputElement;

const senhaCandidato = document.getElementById("senha") as HTMLInputElement;
const confirmarSenhaCandidato = document.getElementById("confirmar_senha") as HTMLInputElement;

let candidatos: any[] = []

function criarCandidato(this: HTMLElement, ev: Event) {
  ev.preventDefault();

  if(validarNomeCandidato() === false){
    return
  }else if(validarCPFCandidato() === false){
    return
  }else if(validarIdadeCandidato() === false){
    return
  }else if(validarEmailCandidato() === false){
    return
  }else if(validarEstadoCandidato() === false){
    return
  }else if(validarCEPCandidato() === false){
    return
  }else if(validarDescricaoCandidato() === false){
    return
  }else if(validarSenhaCandidato() === false){
    return
  }

  let candidato = new Candidato(nomeCandidato.value, cpfCandidato.value, idadeCandidato.value, emailCandidato.value,
  estadoCandidato.value, cepCandidato.value, descricaoCandidato.value, [pythonCandidato.checked, javaCandidato.checked,
  groovyCandidato.checked, cCandidato.checked, jsCandidato.checked], senhaCandidato.value)

  candidatos.push(candidato)
  alert("Candidato criado com sucesso!")
  console.log(candidato)

  limparDadosCandidato()

}

function limparDadosCandidato(){

  nomeCandidato.value = ""
  cpfCandidato.value = ""
  emailCandidato.value = ""
  idadeCandidato.value = ""
  estadoCandidato.value = ""
  cepCandidato.value = ""
  descricaoCandidato.value = ""

  pythonCandidato.checked = false
  javaCandidato.checked = false
  cCandidato.checked = false
  groovyCandidato.checked = false
  jsCandidato.checked = false

  senhaCandidato.value = ""
  confirmarSenhaCandidato.value = ""

}

function validarNomeCandidato(){

  let validaRNome = new RegExp(/[A-Z????????????????????????????????????????????????????????????????][a-z????????????????????????????????????????????????????????????????]/),
  testarNome = validaRNome.test(nomeCandidato.value);

  if(nomeCandidato.value === ""){
    alert("Nome n??o Informado!")
    return false
  }else if(testarNome === false){
    nomeCandidato.value = ""
    alert("Nome Inv??lido!")
    return false
  }
  return true
}

function validarCPFCandidato(){

  let validarCPF = new RegExp(/^[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}$/),
    testarCPF = validarCPF.test(cpfCandidato.value);

  if(cpfCandidato.value === ""){
    alert("CPF n??o Informado!")
    return false
  }else if(testarCPF === false){
    cpfCandidato.value = ""
    alert("CPF Inv??lido! Utilizar XXX.XXX.XXX-XX")
    return false
  }
  return true
}

function validarIdadeCandidato(){

  let validarIdade = new RegExp(/^[0-9]$/),
    testarIdade = validarIdade.test(idadeCandidato.value)

  if(idadeCandidato.value === ""){
    alert("Idade n??o Informada!")
    return false
  }
  return true
}

function validarEmailCandidato(){

  let validarEmail = new RegExp(/[a-zA-Z0-9_]+@[a-zA-Z0-9_]+\.[a-zA-Z0-9_]+/),
    testarEmail = validarEmail.test(emailCandidato.value)

  if(emailCandidato.value === ""){
    alert("Email n??o Informado!")
    return false
  }else if(testarEmail === false){
    emailCandidato.value = ""
    alert("Email Inv??lido! Utilizar email@example.com")
    return false
  }
  return true
}

function validarEstadoCandidato(){

  let validarEstado = new RegExp(/[A-Z????????????????????????????????????????????????????????????????][a-z????????????????????????????????????????????????????????????????]/),
    testarEstado = validarEstado.test(estadoCandidato.value)

  if(estadoCandidato.value === ""){
    alert("Estado n??o Informado!")
    return false
  }else if(testarEstado === false){
    estadoCandidato.value = ""
    alert("Estado Inv??lido!")
    return false
  }
  return true
}

function validarCEPCandidato(){

  let validarCEP = new RegExp(/^[0-9]{5}-[0-9]{3}$/),
    testarCEP = validarCEP.test(cepCandidato.value)

  if(cepCandidato.value === ""){
    alert("CEP n??o Informado!")
    return false
  }else if(testarCEP === false){
    cepCandidato.value = ""
    alert("CEP Inv??lido! Utilizar XXXXX-XXX")
    return false
  }
  return true
}

function validarDescricaoCandidato(){

  if(descricaoCandidato.value === ""){
    alert("Descri????o n??o Informada!")
    return false
  }
  return true
}

function validarSenhaCandidato(){

  let validarSenha = new RegExp(/^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!#@%&]).{6,15}$/),
    testarSenha = validarSenha.test(senhaCandidato.value);
  if(senhaCandidato.value === ""){
    alert("Senha n??o Informada!")
    return false
  }else if(confirmarSenhaCandidato.value === ""){
    alert("Confirma????o de senha n??o Informada!")
    return false
  }else if(testarSenha === false){
    senhaCandidato.value = ""
    alert("Senha Inv??lida!")
    return false
  }

  if(confirmarSenhaCandidato.value === ""){
    alert("Confirma????o de senha n??o Informada!")
    return false
  }else if(senhaCandidato.value != confirmarSenhaCandidato.value){
    senhaCandidato.value = ""
    confirmarSenhaCandidato.value = ""
    alert("As senhas n??o s??o semelhantes!")
    return false
  }
  return true
}

class Candidato{
  nome: string
  cpf: string
  idade: string
  email: string
  estado: string
  cep: string
  descricao: string
  competencia: any[]
  senha: string

  constructor(nome: string, cpf: string, idade: string, email: string, estado: string, cep: string, descricao: string, competencia: any[], senha: string){
    this.nome = nome
    this.cpf = cpf
    this.idade = idade
    this.email = email
    this.estado = estado
    this.cep = cep
    this.descricao = descricao
    this.competencia = competencia
    this.senha = senha

  }
}