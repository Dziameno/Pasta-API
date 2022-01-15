package pl.pjatk.pastafrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.reactive.function.client.WebClient;
import pl.pjatk.pastafrontend.model.Dish;
import pl.pjatk.pastafrontend.model.DishData;

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

    @GetMapping("/dish/{id}")
    public String showDish(Model model, @PathVariable long id) {
        DishData[] dish = webClient
                .get()
                .uri("/dish/"+id)
                .retrieve()
                .bodyToMono(DishData[].class)
                .block();

        List<DishData> dishList = Arrays.asList(dish);
        model.addAttribute("dish", dishList);

        return "dish";
    }

    @GetMapping("/vege")
    public String showAllVegeDishes(Model model) {
        Dish[] dishes = webClient
                .get()
                .uri("/vege")
                .retrieve()
                .bodyToMono(Dish[].class)
                .block();

        List<Dish> vegeDishesList = Arrays.asList(dishes);
        model.addAttribute("dishes", vegeDishesList);

        return "vege";
    }

    @GetMapping("/noodles")
    public String showAllNoodlesTypes(Model model) {
        DishData[] dishes = webClient
                .get()
                .uri("/noodles")
                .retrieve()
                .bodyToMono(DishData[].class)
                .block();

        List<DishData> noodlesList = Arrays.asList(dishes);
        model.addAttribute("dishes", noodlesList);

        return "noodles";
    }
}
