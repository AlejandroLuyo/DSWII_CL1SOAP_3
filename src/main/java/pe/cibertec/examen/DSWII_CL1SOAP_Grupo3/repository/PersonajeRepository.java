package pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.model.Personaje;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje,Integer> {
}
