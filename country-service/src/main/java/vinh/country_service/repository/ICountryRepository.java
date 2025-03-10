package vinh.country_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import vinh.country_service.entity.Country;
@Repository
public interface ICountryRepository extends JpaRepository<Country,Integer>, JpaSpecificationExecutor<Country> {
}
