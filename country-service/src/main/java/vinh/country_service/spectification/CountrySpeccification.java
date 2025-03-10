package vinh.country_service.spectification;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;
import vinh.country_service.entity.Country;
import vinh.country_service.form.CountryFilterForm;


public class CountrySpeccification {

    private static final String SEARCH ="SEARCH";
    public static Specification<Country> buildwhere(CountryFilterForm form)
    {
        Specification<Country> whereSearch = new SpectificationImpl(SEARCH,form.getSearch());
        return Specification.where(whereSearch);
    }
    private static class SpectificationImpl implements Specification<Country>
    {
        private String key ;
        private Object value;

        public SpectificationImpl(String key, Object value) {
            this.key = key;
            this.value = value;
        }


        @Override
        public Predicate toPredicate(Root<Country> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
            if(value == null)
            {
                return null;
            }
            switch (key)
            {
                case SEARCH ->
                {
                    return criteriaBuilder.like(root.get("name"),"%"+value+"%");
                }
            }
            return null;
        }
    }
}
