import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void analyserTest() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = moodAnalyser.analyzeMood();
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenHappyMessage_whenGetMood_shouldReturnHappyMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = moodAnalyser.analyzeMood();
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void givenNullMessage_whenAnalyseMood_ShouldReturnHappyMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyzeMood();
        Assert.assertEquals("HAPPY", mood);
    }
}
