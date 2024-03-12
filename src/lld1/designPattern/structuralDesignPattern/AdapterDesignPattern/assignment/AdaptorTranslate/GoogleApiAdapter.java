package designPattern.structuralDesignPattern.AdapterDesignPattern.assignment.AdaptorTranslate;

import designPattern.structuralDesignPattern.AdapterDesignPattern.assignment.AdaptorTranslate.external.GoogleTranslateApi;
import designPattern.structuralDesignPattern.AdapterDesignPattern.assignment.AdaptorTranslate.external.GoogleTranslationRequest;

import java.util.List;

public class GoogleApiAdapter implements TranslationProviderAdapter{
    private GoogleTranslateApi googleTranslateApi = new GoogleTranslateApi();

    @Override
    public String translate(TranslationRequest translationRequest) {
        GoogleTranslationRequest request = new GoogleTranslationRequest(translationRequest.getText(), translationRequest.getSourceLang(), translationRequest.getTargetLang(), translationRequest.getConfidenceThreshold());
        return googleTranslateApi.convert(request);
    }

    @Override
    public List<String> getLanguages() {
        return googleTranslateApi.getLanguages();
    }
}
