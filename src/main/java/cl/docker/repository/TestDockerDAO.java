package cl.docker.repository;

import cl.docker.model.TestDocker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDockerDAO  extends JpaRepository<TestDocker, Long>, JpaSpecificationExecutor<TestDocker> {


}
