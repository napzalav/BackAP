package com.portfolio.cda.Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyecto {
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    @NotBlank
    private String img;
    @NotBlank
    private String pagina;
    @NotBlank
    private String repositorio;
    
    //Constructor

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String descripcionP, String img, String pagina, String repositorio) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.img = img;
        this.pagina = pagina;
        this.repositorio = repositorio;
    }
    
    //Getter y Setter

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public String getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(String repositorio) {
        this.repositorio = repositorio;
    }
    
}
