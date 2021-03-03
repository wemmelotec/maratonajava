package br.com.abc.javacore.colecoes.classes;

public class Celular {
    private String nome;
    private String IMEI;//responsavél por identificar unicamente um celular

    public Celular(String nome, String IMEI) {
        this.nome = nome;
        this.IMEI = IMEI;
    }
    //implementação do método equals manualmente
    //Reflexivo = x.equals(x) tem que ser true para tudo que for diferente de null
    //Simetrico para x e y diferente de null, se x.equals(y) = true, y.equals(x) = true
    //Transitividade
    //Consistente x.equals(y) deve sempre retornar o mesmo valor
    //para x diferente de null, x.equals(null) tem que retornar falso
    //o x é o this e o y é o obj
    @Override
    public boolean equals(Object obj) {
        //verificar se é nulo
        if(obj == null) return false;
        //verificar se o objeto na memória o this está no mesmo endereço de memória do obj, retorna true
        if(this == obj) return true;
        //verificar se o objeto passado é da mesma classe, através do getClass
        if(this.getClass() != obj.getClass()) return false;

        //se chegar até aqui, eu tenho certeza que o obj não é nulo e é do tipo Celular
        //então posso fazer um cast para a classe celular tranquilamente, pois o obj que eu recebi no parâmentro veio gernérico
        Celular outroceluar = (Celular) obj;
        //operador ternário, se for diferente de nulo faça o primeiro, se não for nulo faça o segundo
        return IMEI != null ? IMEI.equals(outroceluar.getIMEI()) :  false;
    }

    //implementação do método hascode, com o mesmo atributo que foi utilizado para comparação no equals
    //se x.equals(y) == true então y.hascode() == x.hascode() tem que retornar true.
    //se y.hascode() == x.hascode(), não necessariamentos o equals será igual (lembrar da explicação com os nomes nas caixas,
    //onde nomes diferentes poderiam ter o mesmo hash).
    //se x.equals(y) = false não precisa fazer nada no hash, pois eles já são diferentes
    //se y.hashcode() != x.hashcode() então x.equals(y) deverá ser false
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
