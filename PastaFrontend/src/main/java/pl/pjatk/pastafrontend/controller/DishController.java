package pl.pjatk.pastafrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import pl.pjatk.pastafrontend.model.Dish;

import java.util.Arrays;
import java.util.List;

@Controller
public class DishController {

    WebClient webClient = WebClient.create("http://localhost:8081");

    @GetMapping("/dishes")
    public String showAllDishes(Model model) {
        Dish[] dishes = webClient
                .get()
                .uri("/dishes")
                .retrieve()
                .bodyToMono(Dish[].class)
                .block();

        List<Dish> dishesList = Arrays.asList(dishes);
        model.addAttribute("dishes", dishesList);

        return "dishes";
    }

//    @GetMapping("/dish/{id}")
//    public String showDish(Model model) {
//        Dish[] dish = webClient
//                .get()
//                .uri("/dish")
//                .retrieve()
//                .bodyToMono(Dish[].class)
//                .block();
//
////        List<Dish> dishList = Arrays.asList(dish);
//        model.addAttribute("dish", dish[0]);
//
//        return "dish";
//    }
}
