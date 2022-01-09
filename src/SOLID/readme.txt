SOLID é o primo do Clean Code
São 5 principios utilizados na programação OO.
Ele torna o processo de desenvolver mais fácil de manter e evoluir.
Em qualquer linguagem que suporta POO, o SOLID pode ser aplicado.

S - single responsibility principle - princípio da responsabilidade única
    Uma classe deve ser especializada em um único assunto e possuir apenas uma responsabilidade dentro do software
    Classe de exemplo Order
    Esse princípio também poder ser aplicado a métodos e funções
O - open-closed principle - princípio aberto-fechado (se parece muito com o Design Pattern Strategy)
    Objetos ou entidade devem estar abertos para extensão e fechados para modificação
    Quando um novo comportamento ou recurso for ser adicionado a um software devemos extender e não alterar o código fonte original
    Classe de exemplo SystemRH
L - liskov substitution principle - princípio da substituição de liskov
    Uma classe derivada deve ser substituída por sua classe base e não acontecer nada de errado
    Classe de exemplo Main
I - interface segregation principle - princípio da segregação da interface
    Uma classe não deve ser forçada a implementar interfaces e métodos que não irá utilizar
    É melhor criar interfaces mais específicas ao invés de criamos interfaces muito genéricas
D - dependecy inversion principle - princípio da inversão de dependência
    Devemos depender de abstrações e não de implementações
    Abstrações não devem depender de detalhes e sim detalhes devem depender de abstrações

Esses princípios separação responsabilidades, diminuindo o acoplamento e facilitando na refatoração estimulando o
reaproveitamento do código

