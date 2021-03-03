package br.com.abc.javacore.colecoes.classes;

public class Celular {
    private String nome;
    private String IMEI;//responsav�l por identificar unicamente um celular

    public Celular(String nome, String IMEI) {
        this.nome = nome;
        this.IMEI = IMEI;
    }
    //implementa��o do m�todo equals manualmente
    //Reflexivo = x.equals(x) tem que ser true para tudo que for diferente de null
    //Simetrico para x e y diferente de null, se x.equals(y) = true, y.equals(x) = true
    //Transitividade
    //Consistente x.equals(y) deve sempre retornar o mesmo valor
    //para x diferente de null, x.equals(null) tem que retornar falso
    //o x � o this e o y � o obj
    @Override
    public boolean equals(Object obj) {
        //verificar se � nulo
        if(obj == null) return false;
        //verificar se o objeto na mem�ria o this est� no mesmo endere�o de mem�ria do obj, retorna true
        if(this == obj) return true;
        //verificar se o objeto passado � da mesma classe, atrav�s do getClass
        if(this.getClass() != obj.getClass()) return false;

        //se chegar at� aqui, eu tenho certeza que o obj n�o � nulo e � do tipo Celular
        //ent�o posso fazer um cast para a classe celular tranquilamente, pois o obj que eu recebi no par�mentro veio gern�rico
        Celular outroceluar = (Celular) obj;
        //operador tern�rio, se for diferente de nulo fa�a o primeiro, se n�o for nulo fa�a o segundo
        return IMEI != null ? IMEI.equals(outroceluar.getIMEI()) :  false;
    }

    //implementa��o do m�todo hascode, com o mesmo atributo que foi utilizado para compara��o no equals
    //se x.equals(y) == true ent�o y.hascode() == x.hascode() tem que retornar true.
    //se y.hascode() == x.hascode(), n�o necessariamentos o equals ser� igual (lembrar da explica��o com os nomes nas caixas,
    //onde nomes diferentes poderiam ter o mesmo hash).
    //se x.equals(y) = false n�o precisa fazer nada no hash, pois eles j� s�o diferentes
    //se y.hashcode() != x.hashcode() ent�o x.equals(y) dever� ser false
    @Override
    public int hashCode() {
        return IMEI != null? IMEI.hashCode(): 1;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "nome='" + nome + '\'' +
                ", IMEI='" + IMEI + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }




}
