package cl.docker.helper;

import cl.docker.model.TestDocker;
import cl.docker.repository.TestDockerDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Component
public class NegocioHelper {

    @Autowired
    TestDockerDAO testDockerDAO;

    private static final Logger LOGGER = LoggerFactory.getLogger(NegocioHelper.class);

    public void accion() {
        insert("Inicio Proceso");
        LOGGER.debug("Inicio Proceso");
        for (int i = 1; i <=10; i++){

            try {
                Thread.sleep(1000);
                insert("Ciclo N°: "+i);
                LOGGER.debug("Ciclo N°: "+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
        insert("Fin Proceso");
        LOGGER.debug("Fin Proceso");
    }
    private void insert(String mensaje){
        ZoneId zoneId = ZoneId.of("Chile/Continental");
        TestDocker testDocker = new TestDocker();
        testDocker.setFecha(LocalDateTime.now(zoneId));
        testDocker.setMensaje(mensaje);

        testDockerDAO.save(testDocker);

    }
}

