package designPattern.factoryDesignPattern.Lecture;

import designPattern.factoryDesignPattern.Lecture.components.button.Button;
import designPattern.factoryDesignPattern.Lecture.components.button.MacButton;
import designPattern.factoryDesignPattern.Lecture.components.dropDown.DropDown;
import designPattern.factoryDesignPattern.Lecture.components.dropDown.MacDropDown;
import designPattern.factoryDesignPattern.Lecture.components.menu.MacMenu;
import designPattern.factoryDesignPattern.Lecture.components.menu.Menu;
public class MacFactory implements UIFactory{

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }

    @Override
    public Button createButton () {
        return new MacButton();
    }

    @Override
    public DropDown createDropDown() {
        return new MacDropDown();
    }
}
