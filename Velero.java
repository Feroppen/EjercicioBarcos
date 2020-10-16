public class Velero extends Barco {
 private byte cantmastiles;

    public Velero(int matricula, int eslora, int aniofabricacion, byte cantmastiles) {
        super(matricula, eslora, aniofabricacion);
        this.cantmastiles = cantmastiles;
    }

    @Override
    public int alquilerPorDia() {
        return super.alquilerPorDia() + cantmastiles;
    }
}
