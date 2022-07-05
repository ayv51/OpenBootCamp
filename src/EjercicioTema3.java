public class EjercicioTema3 {
    public static void main(String[] args) {
        int para = 10;
        int parb = 15;
        int parc = 20;
        int resultado = suma(para, parb, parc);
        Coche miCoche = new Coche();
        miCoche.ModificarPuertas();
        System.out.println(resultado);
        System.out.println(miCoche.puertas);
    }
    public static int suma(int a,int b,int c){
        return a+b+c;
    }
    static class Coche {
        public int puertas = 4;
        public void ModificarPuertas() {

            this.puertas ++;
        }
    }
}
