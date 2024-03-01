package lld1.designPattern.singletonDesignPattern.assignments.fileBasedConfigurationManager;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {
    private static FileBasedConfigurationManagerImpl instance;

    private  FileBasedConfigurationManagerImpl() {
    }

    public static FileBasedConfigurationManagerImpl  getInstance() {
        if(instance == null) {
            instance = new FileBasedConfigurationManagerImpl();
        }

        return instance;
    }


    @Override
    public String getConfiguration(String key) {
        return properties.getProperty(key);
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
         String value = properties.getProperty(key);
         return convert(key, type);
    }

    @Override
    public void setConfiguration(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        properties.setProperty(key, String.valueOf(value));
    }

    @Override
    public void removeConfiguration(String key) {
        properties.remove(key);
    }

    @Override
    public void clear() {
        properties.clear();
    }

    public static void resetInstance() {
        instance = null;
    }
}
