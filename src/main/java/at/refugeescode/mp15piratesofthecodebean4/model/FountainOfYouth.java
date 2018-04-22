package at.refugeescode.mp15piratesofthecodebean4.model;

import org.springframework.stereotype.Service;

@Service
public class FountainOfYouth {

    private boolean findMermaid;
    private boolean getMermaidTears;
    private boolean findChalice;
    private boolean drinkTheTear;

    public FountainOfYouth() {
    }

    public FountainOfYouth(boolean findMermaid, boolean getMermaidTears, boolean findChalice, boolean drinkTheTear) {
        this.findMermaid = findMermaid;
        this.getMermaidTears = getMermaidTears;
        this.findChalice = findChalice;
        this.drinkTheTear = drinkTheTear;
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
