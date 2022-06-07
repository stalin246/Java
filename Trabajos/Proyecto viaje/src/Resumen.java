import java.util.Objects;

public class Resumen {
    private String lug;
    private String nom;
    private String apell;
    private String matr;
    private double pagar;
    private String fe;
    private int tipo;
    private String ai;
    private String in;
    private String ins;

    public Resumen(String fe, String lug, String nom, String apell, String matr, double pagar,int tipo,String ai,String in,String ins) {
        this.fe = fe;
        this.lug = lug;
        this.nom = nom;
        this.apell = apell;
        this.matr = matr;
        this.pagar = pagar;
        this.tipo=tipo;
        this.ai=ai;
        this.in=in;
        this.ins=ins;
    }

    public String getAi() {
        return ai;
    }

    public void setAi(String ai) {
        this.ai = ai;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public String getIns() {
        return ins;
    }

    public void setIns(String ins) {
        this.ins = ins;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Resumen(String fe) {
        this.fe = fe;
    }


    public String getFe() {
        return fe;
    }

    public void setFe(String fe) {
        this.fe = fe;
    }

    public String getLug() {
        return lug;
    }

    public void setLug(String lug) {
        this.lug = lug;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApell() {
        return apell;
    }

    public void setApell(String apell) {
        this.apell = apell;
    }

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public double getPagar() {
        return pagar;
    }

    public void setPagar(double pagar) {
        this.pagar = pagar;
    }

    @Override
    public String toString(){
        return "Resumen: "+ fe+"\n VIAJE: Tu ubicacion------>"+lug+"\nAUTO TIPO :"+tipo+"\nMATRICULA: "+matr+"\nCONDUCTOR :"+nom+" "+apell+"\n Caracteristicas del servicio: "+"\nInternet: "+in+"\nAire Acondicionado :"+ai+"\nInsumos :"+ins+"\nPAGASTE :"+pagar;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        Resumen resu1 = (Resumen) obj;
        if(!Objects.equals(this.fe, resu1.fe)){
            return false;
        }
        return true;
    }


}
