package cl.docker.scheduler;

import cl.docker.helper.NegocioHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class Scheduler {

    @Autowired
    private NegocioHelper helper;

    //@Scheduled(cron = "0 50 16 * * *") // se ejecuta a las 7 Am todos los dias
    @Scheduled(cron = "0 0/5 * * * *") // se ejecuta cada 5 minutos
    private void start1() {
        helper.accion();
    }


}
