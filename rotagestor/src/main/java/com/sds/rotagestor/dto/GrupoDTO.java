package com.sds.rotagestor.dto;

import java.io.Serializable;

import com.sds.rotagestor.domain.Grupo;

public class GrupoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer IDGRUPO;
    private String NOME;
   
    public GrupoDTO() {
    }

    public GrupoDTO(Grupo grupo){

        IDGRUPO = grupo.getIDGRUPO();
        NOME = grupo.getNOME();

    }

    public Integer getIDGRUPO() {
        return IDGRUPO;
    }

    public void setIDGRUPO(Integer iDGRUPO) {
        IDGRUPO = iDGRUPO;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String nOME) {
        NOME = nOME;
    }

    

}
