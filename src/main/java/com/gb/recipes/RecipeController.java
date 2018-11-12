package com.gb.recipes;

import java.util.Optional;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.gb.recipes.entity.Recipe;
import com.gb.recipes.repository.RecipeRepository;
import lombok.Data;

@RestController
public class RecipeController {
	
//    @Autowired
//    NamedParameterJdbcTemplate jdbcTemplate;

    @RequestMapping("/")
    String hello() {
        return "Hello World!";
    }
    
//    @Autowired
//    ProtoBufRecipeRepository protoBufRecipeRepository;

    @Autowired
    private RecipeRepository recipeRepository;

//    @Data
//    static class Result {
//        private final int left;
//        private final int right;
//        private final long answer;
//    }

    // SQL sample
//    @RequestMapping("calc")
//    Result calc(@RequestParam int left, @RequestParam int right) {
//        MapSqlParameterSource source = new MapSqlParameterSource()
//                .addValue("left", left)
//                .addValue("right", right);
//        
//        return null;
//    }
    
    @RequestMapping("/recipe/{id}")
    @ResponseBody
    Recipe recipeFinder(@PathVariable String id) {
        Optional<Recipe> result = recipeRepository.findById(id);//
        if(result.isPresent()) {
        	return result.get();
        }
        
        return null;
    }
}
