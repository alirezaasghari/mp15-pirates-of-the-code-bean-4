package at.refugeescode.mp15piratesofthecodebean4.controller;

import org.springframework.stereotype.Service;

@Service
public class FountainOfYouth {

    private boolean findMermaid;
    private boolean getMermaidTears;
    private boolean findChalice;
    private boolean drinkTheTear;

    public FountainOfYouth() {
        findMermaid = true;
        getMermaidTears = true;
        findChalice = true;
        drinkTheTear = true;
    }

    public boolean isFindMermaid() {
        return findMermaid;
    }

    public void setFindMermaid(boolean findMermaid) {
        this.findMermaid = findMermaid;
    }

    public boolean isGetMermaidTears() {
        return getMermaidTears;
    }

    public void setGetMermaidTears(boolean getMermaidTears) {
        this.getMermaidTears = getMermaidTears;
    }

    public boolean isFindChalice() {
        return findChalice;
    }

    public void setFindChalice(boolean findChalice) {
        this.findChalice = findChalice;
    }

    public boolean isDrinkTheTear() {
        return drinkTheTear;
    }

    public void setDrinkTheTear(boolean drinkTheTear) {
        this.drinkTheTear = drinkTheTear;
    }
}
