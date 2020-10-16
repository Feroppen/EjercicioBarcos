public class Yates extends Barco {
    private int potenciaCV;
    private int cantcamarotes;

    public Yates(int matricula, int eslora, int aniofabricacion, int potenciaCV, int cantcamarotes) {
        super(matricula, eslora, aniofabricacion);
        this.potenciaCV = potenciaCV;
        this.cantcamarotes = cantcamarotes;
    }

    @Override
    public int alquilerPorDia() {
        return super.alquilerPorDia() + (potenciaCV + cantcamarotes);
    }
}