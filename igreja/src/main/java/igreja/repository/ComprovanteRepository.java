package igreja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import igreja.entity.Comprovante;

@Repository
public interface ComprovanteRepository extends JpaRepository<Comprovante, Long> {

}