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
        Esse método precisa verificar o tipo de contrato para aplicar a regra de negócio correta para o pagamento
         */
    }
}
//agora suponha que a empresa comece a trabalhar com outro tipo de contrato o ContratoPj
//ao invés de alteramos o método da classe já existente acrescentando apenas um outro if e isso pode gerar bugs
//separe o método extensivel por trás de uma interface, e abstraia o contexto em uma interface
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
//Agora cada classe deverá implementar a sua remuneração expecífica tirando essa responsabilidade do método calcular
class FolhaDePagamentoN{
    private double saldo;
    //recebe o tipo de contrato
    public void calcula(){
        /*
        E cada contrato tem implementado seu tipo de remuneração
         */
    }
}