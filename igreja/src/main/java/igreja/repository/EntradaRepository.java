package igreja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import igreja.entity.Entradas;

public interface EntradaRepository extends JpaRepository<Entradas, Long> {

}
