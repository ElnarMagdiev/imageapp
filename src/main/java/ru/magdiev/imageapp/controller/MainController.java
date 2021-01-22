package ru.magdiev.imageapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.magdiev.imageapp.entity.Order;
import ru.magdiev.imageapp.repo.OrderRepo;

import java.util.List;

@Controller
public class MainController {
    private OrderRepo orderRepo;

    @GetMapping("/")
    public String homePage(Model model) {
        List<Order> orders = orderRepo.findByActiveTrue();
        model.addAttribute("orders", orders);
        return "index";
    }

    @Autowired
    public void setOrderRepo(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }
}
