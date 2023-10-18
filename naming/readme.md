"Qual o método ou estratégia que você usa atualmente para nomear variáveis/métodos/funções em código?"
Antes de tudo, é importante usar nomes que são comumente usados. 
Uma classe builder, por exemplo, não terá sua função facilmente compreendida se não ter "Builder" no nome.
O mesmo vale para classes, variáveis, métodos, funções, módulos, etc.
Essa é a parte "genérica" do nome, mas uma parte específica relacionado ao programa é necessária.
Clarificando: uma classe não pode ser chamada "builder" pois, apesar de explicar a sua função, não explica o que está sendo construído. Mesmo que o contexto explique, não é boas práticas deixar isso para o contexto, então precisamos adicionar algo a mais.
Por outro lado, uma classe chamada "telaBuilder" (em camel case, por hábito) acerta em relação a ser conscisa o suficiente pra ser eficiente mas longa o suficiente pra explicar sua função. Essa regra serve para TUDO, incluíndo variáveis. 

"Isso é consciente ou não?"
Não é conscience no sentido de ser um esforço consciente, pois faço normalmente enquanto programo, mas não é algo "natural", mas sim algo desenvolvido após anos de começar a codar.

"Para que o naturalize serve?"

O naturalize é uma ferramenta que, dado um pedaço de código, vai ser criado candidatos de como estilizar/convencionar esse código em relação a convenções de código. Esses candidatos são ordenados em relação a um score criado usando a própria codebase a que o código pertence, para manter a uniformidade do projeto.
