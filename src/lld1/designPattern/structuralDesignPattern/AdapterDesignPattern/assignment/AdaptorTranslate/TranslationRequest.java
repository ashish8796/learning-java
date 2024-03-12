package designPattern.structuralDesignPattern.AdapterDesignPattern.assignment.AdaptorTranslate;

public class TranslationRequest {
    private String text;
    private String sourceLang;
    private String targetLang;

    private Double confidenceThreshold;

    public Double getConfidenceThreshold() {
        return confidenceThreshold;
    }

    public String getText() {
        return text;
    }

    public String getSourceLang() {
        return sourceLang;
    }

    public String getTargetLang() {
        return targetLang;
    }
}
