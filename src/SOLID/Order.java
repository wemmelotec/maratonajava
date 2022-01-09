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
    Essa classe viola o princípio do SRP, pois realiza três tipos distintos de tarefa
    - ela lida com as informações do pedido
    - é responsável pela exibição
    - e manipulação dos dados
    problemas: falta de coesão, alto acoplamento, dificuldade em implementar testes automatizados, dificuldade em reaproveitar o código
     */
}
//refatorando essa classe, ela poderia ser dividida em três classe cada uma com suas responsabilidades

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

