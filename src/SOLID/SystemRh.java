package SOLID;

public class SystemRh {
}
//tipo de contrato
class ContratoClt{
    public void salario(){}
}
//tipo de contrato
class Estagio{
    public void bolsaAuxilio(){}
}
//processar folha de pagamento
class FolhaDePagamento{
    private double saldo;
                        //recebe um contrato
    public void calcula(){
        /*
        Esse m�todo precisa verificar o tipo de contrato para aplicar a regra de neg�cio correta para o pagamento
         */
    }
}
//agora suponha que a empresa comece a trabalhar com outro tipo de contrato o ContratoPj
//ao inv�s de alteramos o m�todo da classe j� existente acrescentando apenas um outro if e isso pode gerar bugs
//separe o m�todo extensivel por tr�s de uma interface, e abstraia o contexto em uma interface
//transformariamos nosso sistema de folha de pagamento como mostrado abaixo
interface Remuneravel{
    public void remuneracao();
}
class ContratoCltN implements Remuneravel{

    @Override
    public void remuneracao() {

    }
}
class EstagioN implements Remuneravel {

    @Override
    public void remuneracao() {

    }
}
class ContratoPj implements Remuneravel{

    @Override
    public void remuneracao() {

    }
}
//Agora cada classe dever� implementar a sua remunera��o expec�fica tirando essa responsabilidade do m�todo calcular
class FolhaDePagamentoN{
    private double saldo;
    //recebe o tipo de contrato
    public void calcula(){
        /*
        E cada contrato tem implementado seu tipo de remunera��o
         */
    }
}