package designPattern.factoryDesignPattern.Lecture;

import designPattern.factoryDesignPattern.Lecture.components.button.Button;
import designPattern.factoryDesignPattern.Lecture.components.dropDown.DropDown;
import designPattern.factoryDesignPattern.Lecture.components.menu.Menu;

public class Main {
    public static void main(String[] args) {
        Flutter flt = new Flutter(SupportedPlatform.MAC);
        UIFactory factory = flt.createFactory();
        Button btn = factory.createButton();
        DropDown dp = factory.createDropDown();
        Menu mn = factory.createMenu();
    }
}
