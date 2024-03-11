package designPattern.creationalDesignPattern.factoryDesignPattern.Lecture;

import designPattern.creationalDesignPattern.factoryDesignPattern.Lecture.components.button.Button;
import designPattern.creationalDesignPattern.factoryDesignPattern.Lecture.components.button.MacButton;
import designPattern.creationalDesignPattern.factoryDesignPattern.Lecture.components.dropDown.DropDown;
import designPattern.creationalDesignPattern.factoryDesignPattern.Lecture.components.dropDown.MacDropDown;
import designPattern.creationalDesignPattern.factoryDesignPattern.Lecture.components.menu.MacMenu;
import designPattern.creationalDesignPattern.factoryDesignPattern.Lecture.components.menu.Menu;
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
