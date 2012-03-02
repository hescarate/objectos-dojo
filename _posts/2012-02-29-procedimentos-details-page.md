---
layout: post
title: "Procedimento para criar um Details Page"
author: "Hellen Escarate"
user: "hescarate"
published: "true"
tags: 
 - procedimento
 - details page
 - jetty
---

## Procedimento para criar um Details Page


1. Atualizar submódulos:
      $ ./submodules 

2. - Pensar na URL:
* Saber qual propriedade (essa propriedade deve ser única) vai ser usada.

3. Definir link na tabela. 

4. verificar o TesteDeBuscarAEntidadeEmQuestao:
* se está correto e testa a busca dessa propriedade. Caso contrário, implementar esse teste. 
* verificar se o Buscardor está usando NativeSql, caso contrário refatorar; 

5. Criar a classe DetailsPage que irá possuir o método de busca.
* extends NomeDoProjetoBdPage
* @Get - não esquecer

6. Cria a classe DetailsPageMeta e definir qual informação de fato será exibida.

7. Criar DetailsPage.html e incluí-lo no módulo(bindPage()) 
pacote ui.page.bd

8. rodar o Jetty:
`ATENÇÃO:` Antes de rodar o Jetty compilar as dependências do projeto:
      $ mvn-ci -am -pl :riskoffice-ro-previdencia-web

      $ mvn-jetty -pl :riskoffice-ro-previdencia-web

Acessar:
http://localhost:8080/ e verificar se a página de detalhes exibe conforme o esperado.


Caso apareça erro quando tentar logar, rode o TesteDeServiço. 

Caso falhe dando a mensagem de que já está em uso:
é necessário clicar no monitor e matar o processo.  
