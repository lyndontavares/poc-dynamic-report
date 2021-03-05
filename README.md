# Campos personalizados em Relatórios

A ideia deste POC é testar campos dinâmicos ou personalizados para relatórios em jasper.

## Definições

Campo dinâmico é um conceito muito amplo. A ideia é poder selecionar quais campos serão mostrados no relatório.
Para simplificar, teremos as seguintes possibiliadews de campos dinâmicos:

1. Coluna: Coluna de uma tabela do banco de dados.
2. Json: Definação de campo, persistida em campo JSON de uma tabela do banco de dados.
3. Calculado: Definição de campo, com processinamento dinâmico, não persistido em nanco de dados.

> Este POC não atende a situações onde groups do report possam ser selecioandos ou não antes de preview ou impressão

## Artefatos

O Jasper report oferece uma report design para produção de reports. Opcionalmente podemos implmentar o report em um formato
específco (XML).

Opcionalmente podemos criar um report em classes de objetos Java usando API do Jasper. Neste caso, todo op trabalho, inclusive o layout do report fica definido em classes e métodos em java.

> Não existe um API específica para parsing de XML para Object, nem de Object para XML.

## Soluções

Das soluções encontradas, 2 estratégias factíveis para criação de report dinâmicos:

### Codificação de report em classes Java

todas as etapas de criação, incluindo layout, feitas em classes Java.

### Utilização de template (XML)

Utiliza-se uma template inicial (XML) que será utilizada por API, a ser desenvolvida, para criação do report.

## Frontend

No frontend faz necessário um diálogo de seleção de colunas possíveis para o report. Não faz parte deste POC.

## Backend

Será criado um projeto Springboot banco em memória. E várias classes de testes para cada aspecto do POC.

## Status do POC

> working in progress
