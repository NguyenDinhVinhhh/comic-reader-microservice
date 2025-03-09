package vinh.category_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vinh.category_service.entity.Category;

public interface ICategoryRepository extends JpaRepository<Category,Integer> {
}
