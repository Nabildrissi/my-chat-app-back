package nabil.com.demo.portfolio.Repository;

import nabil.com.demo.portfolio.Entity.Attachement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachementRepository extends JpaRepository<Attachement, Long> {
}
