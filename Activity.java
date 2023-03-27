public class Activity
{
    private String description;
    private int timeInSeconds;
    private int startTime;

    public Activity(String description, int timeInSeconds, int startTime)
    {
        this.description = description;
        this.timeInSeconds = timeInSeconds;
        this.startTime = startTime;
    }
    
    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public int getTimeInSeconds()
    {
        return this.timeInSeconds;
    }

    public void setTimeInSeconds(int timeInSeconds)
    {
        this.timeInSeconds = timeInSeconds;
    }
    
    public int getStartTime()
    {
        return this.startTime;
    }

    public void setStartTime(int startTime)
    {
        this.startTime = startTime;
    }
    
    public int getEndTime()
    {
        return this.startTime + this.timeInSeconds;
    }
}
