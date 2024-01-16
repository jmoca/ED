package ED.Prac2;

import java.util.Date;

public class Fecha {
    private Integer dia;
    private Integer mes;
    private Integer ano;
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
        return "- "+dia+"/"+mes+"/"+ano;
    }
}
