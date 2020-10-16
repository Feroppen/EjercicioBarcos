/* En un puerto se alquilan amarras para  barcos  de distinto tipo.
Para cada ALQUILER se guarda el nombre y DNI del cliente,
 las fechas  inicial  y final de  alquiler,  la posición  del amarre y el barco que  lo ocupará. */

public class Alquiler {
    public String nombre;
    public int dni;
    public byte cantdias;
    public String mes;
    public int pos_amarre;
    public Barco barco;

    public Alquiler(String nombre,int dni,byte cantdias,String mes, int pos_amarre,Barco barco)
    {   this.nombre=nombre;
        this.dni=dni;
        this.cantdias=cantdias;
        this.mes=mes;
        this.pos_amarre=pos_amarre;
        this.barco=barco;
    }

    public int alquilerFinal() {
        int moduloDelBarco = barco.alquilerPorDia();
        return cantdias * moduloDelBarco;
    }
}
