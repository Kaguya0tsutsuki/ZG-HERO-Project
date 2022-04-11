"use strict";
const botaoLogar = document.getElementById("logar");
botaoLogar === null || botaoLogar === void 0 ? void 0 : botaoLogar.addEventListener("click", validar);
const login = document.getElementById("login");
function validar(ev) {
    ev.preventDefault();
    if (login.value.length > 14) {
        window.location.replace("empresa.html");
    }
    else {
        window.location.replace("candidato.html");
    }
}
