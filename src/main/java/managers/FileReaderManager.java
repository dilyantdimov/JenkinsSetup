package managers;

import dataProvider.ConfigFileReader;

public class FileReaderManager {

    private FileReaderManager() {
    }

    private static FileReaderManager fileReaderManager;
    private static ConfigFileReader configFileReader;

    public static FileReaderManager getInstance(){
        return (fileReaderManager == null) ? fileReaderManager = new FileReaderManager() : fileReaderManager;
    }

    public ConfigFileReader getConfigFileReader(){
        return (configFileReader == null) ? configFileReader = new ConfigFileReader() : configFileReader;
    }

}
