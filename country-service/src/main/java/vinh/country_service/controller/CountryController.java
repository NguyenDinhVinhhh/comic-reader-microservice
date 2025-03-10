package vinh.country_service.controller;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vinh.country_service.dto.CountryDTO;
import vinh.country_service.entity.Country;
import vinh.country_service.form.CountryFilterForm;
import vinh.country_service.service.ICountryService;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/countries")
public class CountryController {
    @Autowired
    private ICountryService countryService;
    @Autowired
    private ModelMapper modelMapper;
    @GetMapping
    public List<CountryDTO> getAllCountry(CountryFilterForm form)
    {
        List<Country> countries =  countryService.getAllCountry(form);
        return modelMapper.map(countries,new TypeToken<List<CountryDTO>>(){}.getType());
    }
}
