package at.refugeescode.mp15piratesofthecodebean4.view;

import at.refugeescode.mp15piratesofthecodebean4.model.FountainOfYouth;
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
        fountainOfYouth.setFindMermaid(true);
        return "redirect:/";
    }

    @GetMapping("/getMermaidTears")
    String getMermaidTears() {
        fountainOfYouth.setGetMermaidTears(true);
        return "redirect:/";
    }

    @GetMapping("/findChalice")
    String findChalice() {
        fountainOfYouth.setFindChalice(true);
        return "redirect:/";
    }

    @GetMapping("/drinkTheTear")
    String drinkTheTear() {
        fountainOfYouth.setDrinkTheTear(true);
        return "redirect:/";
    }

    @GetMapping
    String page() {
        return "index";
    }

}
