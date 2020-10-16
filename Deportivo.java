public class Deportivo extends Barco {
    private int potenciaCV;

    public Deportivo(int matricula, int eslora, int aniofabricacion, int potenciaCV) {
        super(matricula, eslora, aniofabricacion);
        this.potenciaCV = potenciaCV;
    }

    @Override
    public int alquilerPorDia() {
        return super.alquilerPorDia() + potenciaCV;
    }
}
