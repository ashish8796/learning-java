package designPattern.creationalDesignPattern.factoryDesignPattern.Lecture;

import designPattern.creationalDesignPattern.factoryDesignPattern.Lecture.components.button.AndroidButton;
import designPattern.creationalDesignPattern.factoryDesignPattern.Lecture.components.button.Button;
import designPattern.creationalDesignPattern.factoryDesignPattern.Lecture.components.dropDown.AndroidDropDown;
import designPattern.creationalDesignPattern.factoryDesignPattern.Lecture.components.dropDown.DropDown;
import designPattern.creationalDesignPattern.factoryDesignPattern.Lecture.components.menu.AndroidMenu;
import designPattern.creationalDesignPattern.factoryDesignPattern.Lecture.components.menu.Menu;
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
