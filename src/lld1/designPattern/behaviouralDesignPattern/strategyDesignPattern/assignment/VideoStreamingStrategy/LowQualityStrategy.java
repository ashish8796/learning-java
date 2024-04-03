package designPattern.behaviouralDesignPattern.strategyDesignPattern.assignment.VideoStreamingStrategy;

public class LowQualityStrategy implements QualityAdjustmentStrategy{
    public VideoQuality supportsType() {
        return VideoQuality.LOW;
    }

    public Video adjust(Video video) {
        video.setCodec(VideoCodec.H264);
        video.setBitrate(500);
        return video;
    }
}
