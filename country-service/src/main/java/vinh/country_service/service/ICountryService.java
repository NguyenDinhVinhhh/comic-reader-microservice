package vinh.country_service.service;

import vinh.country_service.entity.Country;
import vinh.country_service.form.CountryFilterForm;

import java.util.List;

public interface ICountryService {
    List<Country> getAllCountry(CountryFilterForm form);

}
