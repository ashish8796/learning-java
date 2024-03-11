package designPattern.factoryDesignPattern.Lecture;

import designPattern.factoryDesignPattern.Lecture.components.button.AndroidButton;
import designPattern.factoryDesignPattern.Lecture.components.button.Button;
import designPattern.factoryDesignPattern.Lecture.components.dropDown.AndroidDropDown;
import designPattern.factoryDesignPattern.Lecture.components.dropDown.DropDown;
import designPattern.factoryDesignPattern.Lecture.components.menu.AndroidMenu;
import designPattern.factoryDesignPattern.Lecture.components.menu.Menu;
public class AndroidFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Button createButton () {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
