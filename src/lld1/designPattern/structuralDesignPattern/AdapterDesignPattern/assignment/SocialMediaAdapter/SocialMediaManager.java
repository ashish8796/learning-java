package designPattern.structuralDesignPattern.AdapterDesignPattern.assignment.SocialMediaAdapter;

import designPattern.structuralDesignPattern.AdapterDesignPattern.assignment.SocialMediaAdapter.external.FacebookApi;
import designPattern.structuralDesignPattern.AdapterDesignPattern.assignment.SocialMediaAdapter.external.FacebookPost;
import designPattern.structuralDesignPattern.AdapterDesignPattern.assignment.SocialMediaAdapter.external.TwitterApi;
import designPattern.structuralDesignPattern.AdapterDesignPattern.assignment.SocialMediaAdapter.external.TwitterTweet;

import java.util.List;

public class SocialMediaManager {
    private FacebookApi facebookApi = new FacebookApi();
    private TwitterApi twitterApi = new TwitterApi();

    public void getMessages(Long userId, Long timestamp, String platform) {
        if (platform.equals("facebook")) {
            List<FacebookPost> posts = facebookApi.fetchFacebookPosts(userId, timestamp);
        } else if (platform.equals("twitter")) {
            List<TwitterTweet> tweets = twitterApi.getTweets(userId);
        }

        // Convert the posts/tweets to a common format
    }
}
