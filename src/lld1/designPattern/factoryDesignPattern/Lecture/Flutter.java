package designPattern.factoryDesignPattern.Lecture;

public class Flutter {
    SupportedPlatform supportedPlatform;

    public Flutter(SupportedPlatform supportedPlatform) {
        this.supportedPlatform = supportedPlatform;
    }

    public void setTheme() {
        System.out.println("Theme is being set");
    }

    public void setRefreshRate() {
        System.out.println("Refresh Rate is set");
    }

    public UIFactory createFactory() {
        return UIFactoryFactory.getUIFactory(supportedPlatform);
    }
}
