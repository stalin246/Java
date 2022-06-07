public class Autos {
    private String matricula;
    private String nombreConductor;
    private String apellidoCodnuctor;
    private int tipoAuto;

    public Autos(String matricula, String nombreConductor, String apellidoCodnuctor, int tipoAuto) {
        this.matricula = matricula;
        this.nombreConductor = nombreConductor;
        this.apellidoCodnuctor = apellidoCodnuctor;
        this.tipoAuto = tipoAuto;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public String getApellidoCodnuctor() {
        return apellidoCodnuctor;
    }

    public void setApellidoCodnuctor(String apellidoCodnuctor) {
        this.apellidoCodnuctor = apellidoCodnuctor;
    }

    public int getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(int tipoAuto) {
        this.tipoAuto = tipoAuto;
    }
}
