public class MoodAnalyser {
    String message;

    public MoodAnalyser(){

    }
    public MoodAnalyser(String message){
        this.message=message;

    }

    public String analyzeMood() {
        try {
            if (this.message.contains("Sad"))
                return "SAD";
            return "HAPPY";
        }
        catch (NullPointerException nullPointerException){
            return  "HAPPY";
        }
    }
}

