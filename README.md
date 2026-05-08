# Séries de Dados

Este projeto é um código inicial de um exercício usado para praticar os conceitos de **Classes Abstratas e Interfaces**.

## Orientações Gerais

- Você deve fazer um passo de cada vez, testá-lo, fazer o commit e enviar suas alterações.
Somente depois disso é que você deve passar para o próximo passo.

- **ATENÇÃO**: **desligue o GitHub Copilot para fazer o exercício!**
  - Se você utilizá-lo você não estará realmente exercitando os conceitos aprendidos e
    não terá o domínio adequado para desenvolver as habilidades necessárias para se tornar
	um bom programador/desenvolvedor.
  - Sem contar ainda a questão do plágio.
  - Lembre-se que você pode (e deve) consultar os materiais da disciplina para fazer o exercício.

- Esse arquivo README pode ser melhor visualizado no VS Code (com formatação adequada) 
  abrindo-o no modo de visualização. Para isso, basta apertar Ctrl+Sfhit+V com ele aberto.

## Passo 1 - Contexto e Classe para Séries de dados

As atividades de hoje têm por objetivo exemplificar a importância do uso dos conceitos de **Classes Abstratas e Interfaces**.

Este projeto tem um pasta (pacote) chamada `series` com uma interface, uma classe e um tipo enumerador.
Uma série de dados tem uma periodicidade, um intervalo (dado por um período inicial e um final) e valores numéricos (dados) correspondentes a cada período.
Séries de dados podem ser, por exemplo:

- Das temperaturas de uma cidade, com periodicidade diária, do dia 1 ao dia 30.
- Das vendas de uma loja, com periodicidade mensal, do mês 1 ao mês 12.

A interface fornecida (`ISerieDados`) é genérica e serve para qualquer tipo de série de dados para um determinado período.
A tabela abaixo apresenta outros possíveis exemplos de séries de dados.

| Tema                | Dois tipos de dados              | Periodicidade | Período Inicial | Período Final |
| ------------------- | -------------------------------- | ------------- | --------------- | ------------- |
| Acidentes           | fatais e não fatais              | diária        |         1       |       30      |
| Ações               | Vale e Petrobrás                 | horária       |         8       |       18      |
| Clima               | temperaturas de duas cidades     | diária        |         1       |       30      |
| Vídeo Youtube       | visualizações e curtidas         | diária        |         1       |       30      |
| Balança comercial   | importações e exporatações       | mensal        |         1       |       12      |
| Consumo de energia  | residencial e comercial          | mensal        |         1       |       12      |
| Produção agrícola   | soja e milho                     | anual         |      2015       |     2025      |
| Tráfego de internet | downloads e uploads              | horária       |         0       |       23      |
| Saúde pública       | casos de gripe e dengue          | semanal       |         1       |       52      |
| Transporte público  | passageiros e viagens            | diária        |         1       |       30      |
| Mercado imobiliário | vendas e aluguéis                | mensal        |         1       |       12      |
| Educação            | matrículas e evasões             | anual         |      2015       |     2025      |
| Poluição do ar      | CO2 e partículas finas           | diária        |         1       |       30      |
| Comércio eletrônico | pedidos e devoluções             | semanal       |         1       |       52      |
| Produção industrial | automóveis e motocicletas        | mensal        |         1       |       12      |
| Turismo             | turistas nacionais e estrangeiros| mensal        |         1       |       12      |
| Esportes            | gols e assistências              | semanal       |         1       |       38      |
| Mercado financeiro  | ações e títulos                  | diária        |         1       |       30      |
| Agricultura urbana  | hortaliças e frutas              | mensal        |         1       |       12      |
| Segurança pública   | roubos e furtos                  | diária        |         1       |       30      |
| Produção de energia | solar e eólica                   | mensal        |         1       |       12      |
| Mobilidade urbana   | carros e bicicletas              | horária       |         6       |       22      |
| Saúde mental        | consultas e internações          | mensal        |         1       |       12      |
| Eventos culturais   | quantidade e ingressos vendidos  | semanal       |         1       |       52      |

Neste passo você deve criar uma classe que possa representar qualquer uma das séries de dados apresentadas.
A classe deverá implementar a interface fornecida `ISerieDados`, sobrescrevendo todos os seus métodos, e
deve ser colocada no mesmo pacote.

- **Atenção**: a interface `ISerieDados` não pode ser alterada!

O construtor da classe deverá receber por parâmetro a identificação da série (tema), sua periodicidade,
o período inicial e o período final, e deve criar uma estrutura de dados (coleção) que guardará os dados da série.
Avalie qual é o melhor tipo de coleção a ser usado para facilitar a implementação dos métodos da classe.

Por fim, a classe deverá ter um método para adicionar um dado para um determinado período.

- Lembre-se que os dados podem ser informados em qualquer ordem (já que o método é chamado para cada período).
- Lembre-se também de tratar o caso do método ser chamado para um período fora do intervalo de periodicidade definido para a série no construtor (neste método e também no método de obter dado).

Veja o exemplo da tabela abaixo para entender melhor o que deve ser implementado.
Repare cada objeto que representa uma série de dados servirá, basicamente, para guardar 
os dados de uma coluna de uma tabela como essa.

| Período | Temperaturas de Lavras | Temperaturas de BH |
| ------- | ---------------------- | ------------------ |
|    1    |   25                   |    31              |
|    2    |   27                   |    29              |
|    3    |   24                   |    28              |
|   ...   |   ...                  |    ...             |
|   30    |   22                   |    26              |

> Dica: o atributo periodicidade deve ser do tipo do enumerador `Periodicidade`. Para entender o que são tipos enumeradores, sugiro que leia [este artigo](https://www.devmedia.com.br/enumeracoes-em-java/25839).

Ao terminar, faça um commit e sincronize as alterações.

## Passo 2 - Escolha do Tema e Criação do Pacote

Nos próximos passos você deve tratar duas séries de dados relacionadas, escolhendo um dos temas da tabela 
apresentada no passo anterior.

Complete abaixo o nome do tema que você escolheu:

> Digite sua resposta aqui substituindo esse texto pelo tema

Como mencionado no passo anterior, este projeto utiliza o conceito de **Pacotes**.
Para saber mais sobre o uso de Pacotes em Java, você pode acessar o material complementar sobre isso disponibilizado no Campus Virtual (ou [neste link](https://docs.google.com/presentation/d/1D65XwzbNrn0VQJpGSJvPToCobUR5fj0xbGmWt-Vv6V4/edit?usp=sharing)).

- Em resumo, para criar um pacote no VS Code, basta criar uma pasta dentro da pasta `src`.
- Você verá que os arquivos criados dentro dessa nova pasta terão a palavra-chave `package` na primeira linha, indicando que a classe do arquivo pertence a esse pacote.

Crie então um pacote para colocar as classes relacionadas ao tema escolhido, que serão criadas nos
próximos passos.
Escolha um nome para o pacote que tenha relação com o tema que escolheu.

- *Atenção*: por convenção, em Java os nomes dos pacotes começam com letra minúscula.

Faça um commit e sincronize as alterações.

## Passo 3 - Criação de subclasse para séries de dados de tema específico

Crie uma subclasse para representar as séries de dados do tema que você escolheu.
Ela deve ser colocada dentro do pacote criado no passo anterior. 

Se o tema fosse dados de clima, por exemplo, a subclasse poderia se chamar `SerieDadosClima`.
A ideia é que depois sejam criados dois objetos dessa classe para representar as duas 
diferentes séries de dados do tema escolhido (por exemplo: um para temperaturas de Lavras 
e outro para temperaturas de BH).

O construtor da subclasse deve receber apenas uma identificação da série (por exemplo, 
"Temperaturas de Lavras").
A periodicidade, o período inicial e o período final, serão pré-definidos pela própria 
classe, de acordo com o tema escolhido (veja tabela do Passo 1).

> Obs.: lembre-se que a classe que você criou no Passo 1 está em outro pacote, você 
> precisará importá-la usando: `import series.NomeDaClasse;`.

Ao terminar, faça um commit e sincronize as alterações.

## Passo 4 - Classe de Regra de Negócio

Crie, dentro do pacote criado no Passo 2, **uma classe de regra de negócio** que 
tenha dois atributos da subclasse de séries de dados que você criou no passo 3.

Na implementação da classe, crie os dados das suas séries diretamente no código do construtor (*hard coded*).
Lembre-se que, além de criar os objetos das séries, é necessário adicionar os dados de todos os períodos de cada série.

> Obs: claro que em um programa normal poderíamos ter um menu para o usuário informar os dados ou poderíamos obter essas informações de um arquivo.
> Mas vamos fazer "na mão" para não gastar muito tempo aqui.

> Dica 1: para facilitar você pode fazer um loop e utilizar um objeto da classe Random 
> para gerar os dados de cada período, ao invés de ter que digitar um por um.

Por fim, crie um método que retorna uma lista com as duas séries criadas.

> Dica 2: para respeitar o encapsulamento, os elementos da lista devem ser do tipo 
> da interface `ISerieDados`, pois, se não forem, seria possível alterar as séries fora 
> da classe de regra de negócio.

> Dica 3: se preferir usar uma lista como atributo da classe (em vez de ter dois atributos, 
> uma para cada série), lembre-se que ela deve ser retornada como uma coleção imutável.

Faça o commit de suas alterações.

## Passo 5 - Classe principal

**Altere o código do método `executar` classe `Principal`** que foi fornecida neste projeto.

Você deve instanciar a classe de regra de negócio, criada no passo anterior, e obter a lista 
de séries guardando em uma variável de tipo `List<ISerieDados>`.

Para testar se está tudo certo, implemente um loop que mostre os dados das séries conforme o exemplo abaixo:

```text
Dados da Serie Temperaturas de Lavras (DIARIA)
Dia 1: 23
Dia 2: 25
...
Dados da Serie Temperaturas de BH (DIARIA)
Dia 1: 76
Dia 2: 82
...
```

Teste o seu programa e, estando tudo certo, faça um novo commit e sincronize as alterações.

## Passo 6 - Visualização dos dados

Altere o método `executar` da classe `Principal`, **criando um objeto da classe `VisualizadorSeries`** passando a lista de séries como parâmetro.

Em seguida, **chame o método `exibir`** do objeto criado.

Teste seu programa e veja o que acontece.

Obs.: a classe `VisualizadorSeries` utiliza uma biblioteca (*JFreeChart*) que não faz parte do Java Padrão.
Os arquivos necessários para usar a biblioteca se encontram na pasta `lib` deste projeto.

Advinha o que precisa fazer agora? Isso mesmo, um novo commit.

## Passo 7 - Reflexão sobre a atividade

Você chegou a **refletir sobre o que acabamos de fazer**?
Se não, vamos pensar nisso agora respondendo às perguntas abaixo.

1. Quando a classe de `VisualizadorSeries` foi implementada, quem a criou conhecia algum código que você desenvolveu neste exercício?

> ... digite aqui sua resposta ...

2. Como então a classe `VisualizadorSeries` conseguiu mostrar os dados das suas séries mesmo sem conhecer a sua implementação?

> ... digite aqui sua resposta ...

3. O que o polimorfismo tem a ver com o que foi feito?

> ... digite aqui sua resposta ...

4. Para que então servem as interfaces (como tipo de dado)?

> ... digite aqui sua resposta ...

Ao terminar, faça um novo commit e sincronize suas alterações.
