package designPattern.structuralDesignPattern.AdapterDesignPattern.assignment.AdaptorTranslate;

import java.util.List;

public interface TranslationProviderAdapter {
    public String translate(TranslationRequest translationRequest);
    public List<String> getLanguages();
}
