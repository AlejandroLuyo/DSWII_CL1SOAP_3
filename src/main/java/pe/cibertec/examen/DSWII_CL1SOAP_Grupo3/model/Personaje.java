package pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "personaje")

public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpersonaje;
    private String nompersonaje;
    private String apepersonaje;
    private String fecnacpersonaje;
}