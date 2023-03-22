public class TestTelevisor {
    public static void main(String[] args) {
        System.out.println("prueba");

        telelvisor rota= new telelvisor();

        rota.setFecha("15 de marzo del 2023");
        rota.setDueño("Daniel");
        rota.setDaño("Pantalla rota");
        rota.toString();

        rota.setFecha("21 de marzo del 2023");
        rota.setDueño("daniel");
        rota.setDaño("Se hizo cambio de la pantalla por no tener arreglo ");
        rota.toString();
    }


}
