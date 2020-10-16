/*Un BARCO se caracteriza por su matrícula, su eslora en metros y año de fabricación.*/

public abstract class Barco {
    public int matricula;
    public int eslora;
    public int aniofabricacion;
    public Barco(int matricula,int eslora,int aniofabricacion)  {
        this.matricula=matricula;
        this.eslora=eslora;
        this.aniofabricacion=aniofabricacion;
    }

    public int alquilerPorDia() {
            return eslora * 10 * 2;
    }
}
