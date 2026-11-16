package igreja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import igreja.entity.Despesas;

public interface DespesasRepository extends JpaRepository<Despesas, Long> {

}
