public class autoPremium extends Autos{
    private String inter;
    private String aire;
    private String insumos;


    public autoPremium(String matricula, String nombreConductor, String apellidoCodnuctor, int tipoAuto,String inter,String aire,String insumos) {
        super(matricula, nombreConductor, apellidoCodnuctor, tipoAuto);
        this.inter=inter;
        this.aire=aire;
        this.insumos=insumos;
    }

    public String getInsumos() {
        return insumos;
    }

    public void setInsumos(String insumos) {
        this.insumos = insumos;
    }

    public String getInter() {
        return inter;
    }

    public void setInter(String inter) {
        this.inter = inter;
    }

    public String getAire() {
        return aire;
    }

    public void setAire(String aire) {
        this.aire = aire;
    }

    @Override
    public String toString(){
        return "Nombre y apellido del conductor:"+getNombreConductor()+" "+getApellidoCodnuctor()+"\nServicio de internet:"+getInter()+"\nServicio de aire acondicionado:"+getAire()+"\nServicio de insumos:"+getInsumos();
    }

}
