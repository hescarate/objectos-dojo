
## Details Page


## Caso de uso


### Procedimento 

1 - atualizar submódulos:
      $ ./submodules 


2 - Pensar na URL:
a) Saber qual propriedade (deve ser única) vai ser usada.

3 - Definir link na tabela. 


4) verificar o TesteDeBuscarEntidade se está correto e testa a busca dessa propriedade.
Caso contrário implementar esse teste. 
a) verificar se o Buscardor está usando NativeSql, caso contrário refatorar; 

5) Criar a classe DetailsPage que irá possuir o método de busca.
extends NomeDoProjetoBdPage
@Get - não esquecer

6)Cria a classe DetailsPageMeta e definir qual informação de fato será exibida. 

7) Criar DetailsPage.html e incluí-lo no módulo. 


bindPage(){
at("/bd/")
}



