import java.util.ArrayList;

public class ListaAlquileres {
    public ListaAlquileres() {

        ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();
            }
            ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();

        public int getMayorAlquiler() {
              int mayorAlquilerAux = 0;
              for (int i = 0; i < alquileres.size(); i++) {
                  if (alquileres.get(i).alquilerFinal() > mayorAlquilerAux){
                      mayorAlquilerAux=alquileres.get(i).alquilerFinal();
                  }
              }
              return mayorAlquilerAux;
          }
            public int getMenorAlquiler() {
                int menorAlquilerAux = 1000000;
                for (int i = 0; i < alquileres.size(); i++) {
                    if (alquileres.get(i).alquilerFinal() < menorAlquilerAux) {
                        menorAlquilerAux = alquileres.get(i).alquilerFinal();
                    }
                }
                return menorAlquilerAux;
            }
            public int getPromedioAlquiler() {
                int promedioAcumulado = 0;
                int promedioTotal = 0;
                for (int i = 0; i < alquileres.size(); i++) {
                    promedioAcumulado += alquileres.get(i).alquilerFinal();
                }
                promedioTotal = promedioAcumulado/alquileres.size();
                return promedioTotal;
            }
            public void agregarAlquiler(Alquiler alquiler){
                this.alquileres.add(alquiler);
    }
}
