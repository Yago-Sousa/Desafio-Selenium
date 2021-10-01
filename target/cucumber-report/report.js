$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/preencherFormulario.feature");
formatter.feature({
  "name": "Preencher Formulario",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "Preenchendo Formulario",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "preencher a aba Vehicle Data",
  "keyword": "Quando "
});
formatter.match({
  "location": "preencherFormularioSteps.preencherAAbaVehicleData()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher a aba Insurant Data",
  "keyword": "E "
});
formatter.match({
  "location": "preencherFormularioSteps.preencherAAbaInsurantData()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher a aba Product Data",
  "keyword": "E "
});
formatter.match({
  "location": "preencherFormularioSteps.preencherAAbaProductData()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher a aba Price Option",
  "keyword": "E "
});
formatter.match({
  "location": "preencherFormularioSteps.preencherAAbaPriceOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher a aba Send Quote",
  "keyword": "E "
});
formatter.match({
  "location": "preencherFormularioSteps.preencherAAbaSendQuote()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema verifica a mensagem de sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "preencherFormularioSteps.oSistemaVerificaAMensagemDeSucesso()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});