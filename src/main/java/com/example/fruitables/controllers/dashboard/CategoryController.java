package com.example.fruitables.controllers.dashboard;

import com.example.fruitables.dtos.category.CategoryCreateDto;
import com.example.fruitables.dtos.category.CategoryDto;
import com.example.fruitables.dtos.category.CategoryUpdateDto;
import com.example.fruitables.entities.Category;
import com.example.fruitables.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/dashboard/category")
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("/")
    public String index(Model model){
        List<CategoryDto> categoryDtoList = categoryService.getDashboardCategories();
        model.addAttribute("categories",categoryDtoList);
        return "dashboard/category/category.html";
    }

    @GetMapping("/create")
    public String create(){
        return "dashboard/category/create.html";
    }

    @PostMapping("/create")
    public String create(CategoryCreateDto categoryCreateDto){
        boolean result = categoryService.createCategory(categoryCreateDto);
        return "redirect:/dashboard/category/";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id, Model model) {
        CategoryUpdateDto categoryUpdateDto = categoryService.getUpdatedCategory(id);
        model.addAttribute("category", categoryUpdateDto);
        return "dashboard/category/update.html";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable Long id,CategoryUpdateDto categoryUpdateDto){
        boolean result = categoryService.updateCategory(id,categoryUpdateDto);
        return "redirect:/dashboard/category/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id,Model model){
        boolean result = categoryService.removeCategory(id);
        model.addAttribute("result",result);
        return "redirect:/dashboard/category/";
    }


}
