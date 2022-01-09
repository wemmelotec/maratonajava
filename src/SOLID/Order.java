package SOLID;

public class Order {

    public void calculateTotalSum(){}
    public void getItems(){}
    public void getItemCount(){}
    public void addItem(){}
    public void deleteItem(){}

    public void printOrder(){}
    public void showOrder(){}

    public void load(){}
    public void save(){}
    public void update(){}
    public void delete(){}

    /*
    Essa classe viola o princ�pio do SRP, pois realiza tr�s tipos distintos de tarefa
    - ela lida com as informa��es do pedido
    - � respons�vel pela exibi��o
    - e manipula��o dos dados
    problemas: falta de coes�o, alto acoplamento, dificuldade em implementar testes automatizados, dificuldade em reaproveitar o c�digo
     */
}
//refatorando essa classe, ela poderia ser dividida em tr�s classe cada uma com suas responsabilidades

class OrderNew{
    public void calculateTotalSum(){}
    public void getItems(){}
    public void getItemCount(){}
    public void addItem(){}
    public void deleteItem(){}
}

class OrderRepository{
    public void load(){}
    public void save(){}
    public void update(){}
    public void delete(){}
}

class OrderView{
    public void printOrder(){}
    public void showOrder(){}
}

