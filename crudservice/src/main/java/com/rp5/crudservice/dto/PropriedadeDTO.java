package com.rp5.crudservice.dto;

public class PropriedadeDTO {
    private String latitude;
    private String longitude;
    private Long idBairro;
    private Long idProprietario;

    public PropriedadeDTO(String latitude, String longitude, Long idBairro, Long idProprietario) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.idBairro = idBairro;
        this.idProprietario = idProprietario;
    }

    public PropriedadeDTO() {
    }

    public Long getIdBairro() {
        return idBairro;
    }

    public void setIdBairro(Long idBairro) {
        this.idBairro = idBairro;
    }

    public Long getIdProprietario() {
        return idProprietario;
    }

    public void setIdProprietario(Long idProprietario) {
        this.idProprietario = idProprietario;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
