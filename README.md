# Séries de Dados

Este projeto é um código inicial de um exercício usado para praticar os conceitos de Classes Abstratas e Interfaces.

## Passo 1 - Contexto e Definição do Tema

As atividades de hoje têm por objetivo exemplificar a importância do uso dos conceitos de **Classes Abstratas e Interfaces**.

Este projeto tem um pasta (pacote) chamada `series` com duas interfaces, uma classe e um enumerável.
Uma série de dados tem uma periodicidade, um intervalo (dado por um período inicial e um final) e valores inteiros (dados) correspondentes a cada período.
Séries de dados podem ser, por exemplo:

- Das temperaturas de uma cidade, do dia 1 ao dia 5, com periodicidade diária.
- Das vendas de uma loja, do mês 4 ao mês 10, com periodicidade mensal.

A interfaces fornecida (`SerieDados`) é genérica e serve para qualquer tipo de série de dados para um determinado período.
A ideia é que você trate séries de dados relacionadas usando essas interfaces.

Neste passo você deve definir quais séries de dados vai tratar.
Você precisa definir necessariamente duas séries de dados que estejam de certa forma relacionadas.
Abaixo estão alguns exemplos, mas você pode (e deve) escolher outro, completando a tabela abaixo.
Ao escolher, valide com o professor, pois a ideia é cada aluno tenha temas diferentes.

| Contexto ou tema  | Dois tipos de dados        | Periodicidade | Período Inicial | Período Final |
| --------          | -----------------------    | ------------- | --------------- | ------------- |
| Acidentes         | fatais e não fatais        | diária        |         1       |       30      |
| Ações             | Vale e Petrobrás           | horária       |         8       |       18      |
| Clima             | temperatura e umidade      | mensal        |         2       |       10      |
| Vídeo Youtube     | visualizações e curtidas   | diária        |         5       |       12      |
| Balança comercial | importações e exporatações | mensal        |         1       |       12      |
| *.. sua resposta* | *.. sua resposta*          | *.. sua resposta* |  *.. sua resposta*   | *.. sua resposta* |

Neste passo, portanto, você deve preencher sua resposta na tabela acima e, em seguida, fazer commit com essa alteração.

## Passo 2 - Criação do Pacote

Este projeto utiliza o conceito de **Pacotes**.
Para saber mais sobre o uso de Pacotes em Java, você pode acessar o material disponibilizado na seção de Estudos Autônomos.

Crie um pacote para colocar as classes das suas séries de dados.
As classes dos três passos seguintes devem pertencer a esse pacote.
Escolha um nome para o pacote que tenha relação com o tema que escolheu.

Para criar um pacote no VS Code, basta criar uma pasta dentro da pasta `src`.

Obs: para facilitar o entendimento, os passos seguintes citarão séries de dados de clima, lembre-se de adaptar as instruções para o seu tema escolhido.

## Passo 3 - Criação de classe para série de dados

Crie, dentro do pacote do Passo 2, **uma classe para representar as suas séries de dados**.

No caso dos dados de clima, por exemplo, a classe poderia se chamar `SerieDadosClima`.
A ideia é que ela seja usada depois para criar dois objetos para representar os dois tipos diferentes de dados de clima (temperatura e umidade relativa do ar, por exemplo).

A classe deverá implementar a interface fornecida `SerieDados`, sobrescrevendo todos os seus métodos.
- **Atenção**: a interface `SerieDados` não pode ser alterada!

O construtor da classe deverá receber por parâmetro a identificação da série (o tema), o período inicial e o período final, bem como sua periodicidade e deve criar uma estrutura de dados (coleção) que guardará os dados da série.

Por fim, a classe deverá ter um método para adicionar um dado para um determinado período.
- Lembre-se que os dados podem ser informados em qualquer ordem (já que o método é chamado para cada período).
- Lembre-se também de tratar o caso do método seja chamado para um período fora do intervalo de periodicidade definido para a série no construtor (neste método e também no de obter dado).

Obs.: lembre-se que como a interface `SerieDados` está em outro pacote, você precisará importá-la usando: `import series.SerieDados`;

Ao terminar, faça um commit e sincronize as alterações.

## Passo 4 - Classe de Regra de Negócio

Crie, dentro do pacote do Passo 2, **uma classe de regra de negócio** que tenha dois atributos da classe de séries de dados que você criou no passo anterior.

Na implementação da classe, crie os dados das suas séries diretamente no código do construtor (*hard coded*).
Lembre-se que, além de criar os objetos das séries, é necessário adicionar os dados de todos os períodos de cada série.

> Obs: claro que em um programa normal poderíamos ter um menu para o usuário informar os dados ou poderíamos obter essas informações de um arquivo.
> Mas vamos fazer "na mão" para não gastar muito tempo.

Por fim, crie um método que retorna uma lista com as duas séries criadas.

> Dica 1: os elementos da lista devem ser do tipo `SerieDados`, pois, se não forem, seria possível alterar as séries fora da classe `Controle`, o que feriria o encapsulamento.

> Dica 2: se usar a lista como atributo da classe (em vez de ter dois atributos, uma para cada série), lembre-se que ela deve ser retornada como uma coleção imutável.

Faça o commit de suas alterações.

## Passo 5 - Classe principal

**Altere o código do método `executar` classe `Principal`** que foi fornecida neste projeto.

Você deve instanciar a classe de regra de negócio, criada no passo anterior, e obter a lista de séries guardando em uma variável com o tipo `List<SerieDados>`.

Para testar se está tudo certo, implemente um loop que mostre os dados das séries conforme o exemplo abaixo:

```text
Dados da Serie Temperaturas em Lavras (DIARIA)
Dia 5: 23
Dia 6: 25
...
Dados da Serie Umidade relativa do ar em Lavras (DIARIA)
Dia 5: 76
Dia 6: 82
...
```

Teste o seu programa e, estando tudo certo, faça um novo commit e sincronize as alterações.

## Passo 6 - Visualização dos dados

Altere o método `executar` da classe `Principal`, **criando um objeto da classe `VisualizadorSeries`** passando a lista de séries como parâmetro.

Em seguida, **chame o método `exibir`** do objeto criado.

Teste seu programa e veja o que acontece.

Obs.: a classe `VisualizadorSeries` utiliza uma biblioteca (*JFreeChart*) que não fazem parte do Java Padrão.
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

Ao terminar, faça um novo commit e sincronize suas alterações no GitHub Classroom.
