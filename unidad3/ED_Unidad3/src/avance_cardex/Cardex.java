package avance_cardex;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class Cardex implements Comparable<Cardex>  {
    private String clave;
    private int semestre;
    private String materia;
    private int promedio;
    private String periodo;
    private String opcion;
    private int creditos;	
    private String nivelDesempenio;

    public Cardex(String clave, int semestre, String materia, int promedio, String periodo, String opcion, int creditos) {
        this.clave = clave;
        this.semestre = semestre;
        this.materia = materia;
        this.promedio = promedio;
        this.periodo = periodo;
        this.opcion = opcion;
        this.creditos = creditos;
    }
    
    
//    public static void main(String[] args) {
        //2S4	4	LENG.AUTOMAT.I	94	2025 2AGO-DIC	ORDINARIO 2DA	5

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getNivelDesempenio() {
        return nivelDesempenio;
    }

    public void setNivelDesempenio(String nivelDesempenio) {
        this.nivelDesempenio = nivelDesempenio;
    }

    @Override
    public int compareTo(Cardex o) {
        if(Integer.compare(this.semestre, o.semestre)==0){
            return this.clave.compareToIgnoreCase(o.clave);
        }else{
            return Integer.compare(this.semestre, o.semestre);
        }
    }

    @Override
    public String toString() {
        return "Cardex{" + "clave=" + clave + ", semestre=" + semestre + ", materia=" + materia + ", promedio=" + promedio + ", periodo=" + periodo + ", opcion=" + opcion + ", creditos=" + creditos + ", nivelDesempenio=" + nivelDesempenio + '}';
    }
        
    
    
}
