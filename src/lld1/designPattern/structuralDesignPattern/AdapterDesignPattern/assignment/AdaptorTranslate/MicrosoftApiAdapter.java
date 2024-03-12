package designPattern.structuralDesignPattern.AdapterDesignPattern.assignment.AdaptorTranslate;

import designPattern.structuralDesignPattern.AdapterDesignPattern.assignment.AdaptorTranslate.external.MicrosoftTranslateApi;

import java.util.List;

public class MicrosoftApiAdapter implements TranslationProviderAdapter{
    private MicrosoftTranslateApi microsoftTranslateApi = new MicrosoftTranslateApi();

    public String translate(TranslationRequest translationRequest) {
        return microsoftTranslateApi.translate(translationRequest.getText(), translationRequest.getSourceLang(), translationRequest.getTargetLang());
    }

    @Override
    public List<String> getLanguages() {
        return microsoftTranslateApi.getSupportedLanguages();
    }
}
