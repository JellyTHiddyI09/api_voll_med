package med.voll.api.domain.consulta.desafio;

import jakarta.validation.ValidationException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DatosCancelamientoDeConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Component("ValidadorHorarioAntecedenciaCancelamiento")
public class ValidadorHorarioAntecedencia {

   /** @Autowired
    private ConsultaRepository repository;

    public void validar(DatosCancelamientoDeConsulta datos){
        var consulta = repository.getReferenceById(datos.idConsulta());
        var ahora = LocalDateTime.now();
        var diferenciaEntreHoras = Duration.between(ahora,consulta.getFecha()).toHours();

        if(diferenciaEntreHoras <24){
            throw new ValidationException("La consulta solo puede ser cancelada con antescedencia minima de 24 horas");
        }
    }**/

}
