package vinh.country_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import vinh.country_service.entity.Country;
import vinh.country_service.form.CountryFilterForm;
import vinh.country_service.repository.ICountryRepository;
import vinh.country_service.spectification.CountrySpeccification;

import java.util.List;
@Service
public class CountryService implements ICountryService{
    @Autowired
    private ICountryRepository countryRepository;
    @Override
    public List<Country> getAllCountry(CountryFilterForm form) {
        Specification<Country> where = CountrySpeccification.buildwhere(form);
        return countryRepository.findAll(where);
    }
}
