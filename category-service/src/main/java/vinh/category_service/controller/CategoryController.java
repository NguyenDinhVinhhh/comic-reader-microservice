package vinh.category_service.controller;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vinh.category_service.dto.CategoryDTO;
import vinh.category_service.entity.Category;
import vinh.category_service.service.ICategoryService;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/categories")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public List<CategoryDTO> getAllCategory()
    {
        List<Category> categories = categoryService.getAllCategory();
        return modelMapper.map(categories,new TypeToken<List<CategoryDTO>>(){}.getType());
    }
}
