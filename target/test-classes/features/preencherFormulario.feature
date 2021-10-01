#language: pt
#enconding: UTF-8

Funcionalidade: Preencher Formulario


 Cenario: Preenchendo Formulario
    Quando preencher a aba Vehicle Data 
    E preencher a aba Insurant Data
    E preencher a aba Product Data
    E preencher a aba Price Option
    E preencher a aba Send Quote
    Entao o sistema verifica a mensagem de sucesso 