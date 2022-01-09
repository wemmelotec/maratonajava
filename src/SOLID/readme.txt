SOLID � o primo do Clean Code
S�o 5 principios utilizados na programa��o OO.
Ele torna o processo de desenvolver mais f�cil de manter e evoluir.
Em qualquer linguagem que suporta POO, o SOLID pode ser aplicado.

S - single responsibility principle - princ�pio da responsabilidade �nica
    Uma classe deve ser especializada em um �nico assunto e possuir apenas uma responsabilidade dentro do software
    Classe de exemplo Order
    Esse princ�pio tamb�m poder ser aplicado a m�todos e fun��es
O - open-closed principle - princ�pio aberto-fechado (se parece muito com o Design Pattern Strategy)
    Objetos ou entidade devem estar abertos para extens�o e fechados para modifica��o
    Quando um novo comportamento ou recurso for ser adicionado a um software devemos extender e n�o alterar o c�digo fonte original
    Classe de exemplo SystemRH
L - liskov substitution principle - princ�pio da substitui��o de liskov
    Uma classe derivada deve ser substitu�da por sua classe base e n�o acontecer nada de errado
    Classe de exemplo Main
I - interface segregation principle - princ�pio da segrega��o da interface
    Uma classe n�o deve ser for�ada a implementar interfaces e m�todos que n�o ir� utilizar
    � melhor criar interfaces mais espec�ficas ao inv�s de criamos interfaces muito gen�ricas
D - dependecy inversion principle - princ�pio da invers�o de depend�ncia
    Devemos depender de abstra��es e n�o de implementa��es
    Abstra��es n�o devem depender de detalhes e sim detalhes devem depender de abstra��es

Esses princ�pios separa��o responsabilidades, diminuindo o acoplamento e facilitando na refatora��o estimulando o
reaproveitamento do c�digo

