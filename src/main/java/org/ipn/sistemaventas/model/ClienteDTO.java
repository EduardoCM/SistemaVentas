package org.ipn.sistemaventas.model;

import java.util.Date;

public class ClienteDTO {
    
    private int codigo;
    private String nombre;
    private String apellidos;
    private String pais;
    private String sexo;
    private Date fechaNacimiento;

    public ClienteDTO(){
        
    }

    public ClienteDTO(int codigo, String nombre, String apellidos, String pais, String sexo, Date fechaNacimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.pais = pais;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "ClienteDTO{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", pais=" + pais + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
    

    
    
    
}
