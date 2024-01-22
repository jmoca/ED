
public class Fecha {
    private final Integer dia;
    private final Integer mes;
    private final Integer ano;
    public Fecha(Integer dia,Integer mes,Integer ano){
        this.dia =dia;
        this.mes =mes;
        this.ano= ano;
    }
    public Integer getDia(){
        return dia;
    }
    public Integer getMes(){
        return mes;
    }
    public Integer getAno(){
        return ano;
    }
    public String toString(){
        return " "+dia+"/"+mes+"/"+ano;
    }
}

