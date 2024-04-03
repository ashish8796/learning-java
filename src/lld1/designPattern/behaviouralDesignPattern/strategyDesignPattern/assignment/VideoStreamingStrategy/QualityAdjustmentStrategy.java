package designPattern.behaviouralDesignPattern.strategyDesignPattern.assignment.VideoStreamingStrategy;

public interface QualityAdjustmentStrategy {
    VideoQuality supportsType();

    Video adjust(Video video);
}
