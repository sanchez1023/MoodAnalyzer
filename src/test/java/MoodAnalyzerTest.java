import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void analyserTest() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = moodAnalyser.analyzeMood();
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenHappyMessage_whenGetMood_shouldReturnHappyMood() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = moodAnalyser.analyzeMood();
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void givenNullMessage_whenAnalyzeMood_ShouldReturnHappyMood() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyzeMood();
        Assert.assertEquals("HAPPY", mood);
    }
    @Test public  void givenNullMessage_WhenAnayzleMood_ShouldEReturnExecption() throws MoodAnalysisException {
        try {
            	            MoodAnalyser moodAnalyser = new MoodAnalyser(null);
            	            String mood = moodAnalyser.analyzeMood();
        } catch (MoodAnalysisException moodAnalysisException) {
            Assert.assertEquals("Invalid Message", moodAnalysisException.getMessage());
        }
    	    }

}
