package designPattern.behaviouralDesignPattern.strategyDesignPattern.assignment.VideoStreamingStrategy;

public class HighQualityStrategy implements QualityAdjustmentStrategy{
    public VideoQuality supportsType() {
        return VideoQuality.HIGH;
    }

    public Video adjust(Video video) {
        video.setCodec(VideoCodec.VP9);
        video.setBitrate(2000);
        return video;
    }
}
