package springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springdatajpa.model.entity.DepartamentoEntity;
import springdatajpa.model.entity.OrganizacaoEntity;

public interface OrganizacaoRepository extends JpaRepository<OrganizacaoEntity, Integer> {
}
