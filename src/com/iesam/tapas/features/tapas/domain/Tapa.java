package com.iesam.tapas.features.tapas.domain;

public class Tapa {
    private String id;
    private String nombre;
    private String ingredientes;
    private String local;
    private String noParticiapantes;
    private String mediaVotos;
    private String totalVotos;
    private String totalPts;


    public Tapa(String id, String nombre, String ingredientes, String local, String noParticiapantes, String mediaVotos, String totalVotos, String totalPts) {
        this.id = id;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.local = local;
        this.noParticiapantes = noParticiapantes;
        this.mediaVotos = mediaVotos;
        this.totalVotos = totalVotos;
        this.totalPts = totalPts;
    }

    @Override
    public String toString() {
        return "Tapa{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ingredientes='" + ingredientes + '\'' +
                ", local='" + local + '\'' +
                ", noParticiapantes='" + noParticiapantes + '\'' +
                ", mediaVotos='" + mediaVotos + '\'' +
                ", totalVotos='" + totalVotos + '\'' +
                ", totalPts='" + totalPts + '\'' +
                '}' + "\n" ;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNoParticiapantes() {
        return noParticiapantes;
    }

    public void setNoParticiapantes(String noParticiapantes) {
        this.noParticiapantes = noParticiapantes;
    }

    public String getMediaVotos() {
        return mediaVotos;
    }

    public void setMediaVotos(String mediaVotos) {
        this.mediaVotos = mediaVotos;
    }

    public String getTotalVotos() {
        return totalVotos;
    }

    public void setTotalVotos(String totalVotos) {
        this.totalVotos = totalVotos;
    }

    public String getTotalPts() {
        return totalPts;
    }

    public void setTotalPts(String totalPts) {
        this.totalPts = totalPts;
    }
}
