package com.isaac.learn.mobile;

public class FancyUIServiceAdaptor implements IMultiRestoApp{
    private final FancyUIService fancyUIService;

    public FancyUIServiceAdaptor(FancyUIService fancyUIService) {
        this.fancyUIService = fancyUIService;
    }

    @Override
    public void displayMenu(String xmlData) {
        String jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayMenu(jsonData);
    }

    @Override
    public void displayRecommendation(String xmlData) {
        String jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayRecommendation(jsonData);

    }
    private String convertXmlToJson(String xmlData) {
        return "converted Json data";
    }
}
