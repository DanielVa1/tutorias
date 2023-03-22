public class telelvisor {
    private String Fecha;
    private String Dueño;
    private String Daño;
    public telelvisor (String Fecha, String Dueño, String Daño){
        this.Fecha = Fecha;
        this.Dueño = Dueño;
        this.Daño = Daño;



    }
public telelvisor (){

}

public String getFecha() {return Fecha;}

    public void setFecha(String fecha) {Fecha = fecha;}

    public String getDueño() {return Dueño;}

    public void setDueño(String dueño) {Dueño = dueño;}

    public String getDaño() {return Daño;}

    public void setDaño(String daño) {Daño = daño;}

    public String toString(){
        System.out.println( " Dato del Televisor");
        System.out.println("Fecha: " + getFecha());
        System.out.println("Dueño: " + getDueño());
        System.out.println("Daño: " + getDaño());
        return "";
    }







}

