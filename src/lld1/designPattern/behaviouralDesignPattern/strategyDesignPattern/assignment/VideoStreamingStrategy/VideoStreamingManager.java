package designPattern.behaviouralDesignPattern.strategyDesignPattern.assignment.VideoStreamingStrategy;

public class VideoStreamingManager {
    private QualityAdjustmentStrategy qualityAdjustmentStrategy;
    private Video video;

    public VideoStreamingManager(Video video, QualityAdjustmentStrategy qualityAdjustmentStrategy) {
        this.qualityAdjustmentStrategy = qualityAdjustmentStrategy;
        this.video = video;
    }

    public VideoStreamingManager( QualityAdjustmentStrategy qualityAdjustmentStrategy) {
        this.qualityAdjustmentStrategy = qualityAdjustmentStrategy;
    }

    public Video streamVideo() {
        return qualityAdjustmentStrategy.adjust(video);
    }
}