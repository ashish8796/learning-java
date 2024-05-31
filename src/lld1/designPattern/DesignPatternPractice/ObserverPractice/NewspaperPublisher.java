package designPattern.DesignPatternPractice.ObserverPractice;

import java.util.ArrayList;
import java.util.List;

public class NewspaperPublisher extends Observable{
    private List<String> paper = new ArrayList<>();

    public void publishNewPaper(String newsPaper) {
        paper.add(newsPaper);

        notifyChange();
    }
}
