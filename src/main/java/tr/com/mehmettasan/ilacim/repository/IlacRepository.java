package tr.com.mehmettasan.ilacim.repository;


import tr.com.mehmettasan.ilacim.domain.Ilac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IlacRepository  extends JpaRepository<Ilac, Long> {
}