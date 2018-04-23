package at.refugeescode.mp15piratesofthecodebean4.view;

import at.refugeescode.mp15piratesofthecodebean4.controller.FountainOfYouth;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class indexController {

    private FountainOfYouth fountainOfYouth;

    public indexController(FountainOfYouth fountainOfYouth) {
        this.fountainOfYouth = fountainOfYouth;
    }

    @ModelAttribute("stepOne")
    Boolean stepOne() {
        return fountainOfYouth.isFindMermaid();
    }

    @ModelAttribute("stepTwo")
    Boolean stepTwo() {
        return fountainOfYouth.isGetMermaidTears();
    }

    @ModelAttribute("stepThree")
    Boolean stepThree() {
        return fountainOfYouth.isFindChalice();
    }

    @ModelAttribute("stepFour")
    Boolean stepFour() {
        return fountainOfYouth.isDrinkTheTear();
    }

    @GetMapping("/findMermaid")
    String findMermaid() {
        fountainOfYouth.setFindMermaid(false);
        return "redirect:/";
    }

    @GetMapping("/getMermaidTears")
    String getMermaidTears() {
        fountainOfYouth.setGetMermaidTears(false);
        return "redirect:/";
    }

    @GetMapping("/findChalice")
    String findChalice() {
        fountainOfYouth.setFindChalice(false);
        return "redirect:/";
    }

    @GetMapping("/drinkTheTear")
    String drinkTheTear() {
        fountainOfYouth.setDrinkTheTear(false);
        return "redirect:/";
    }

    @GetMapping
    String page() {
        return "index";
    }

}
