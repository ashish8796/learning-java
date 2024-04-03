package designPattern.behaviouralDesignPattern.strategyDesignPattern.assignment.VideoStreamingStrategy;

public class MediumQualityStrategy implements QualityAdjustmentStrategy{
    public VideoQuality supportsType() {
        return VideoQuality.MEDIUM;
    }

    public Video adjust(Video video) {
        video.setCodec(VideoCodec.H265);
        video.setBitrate(1000);
        return video;
    }
}
