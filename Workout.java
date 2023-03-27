import java.util.ArrayList;

public class Workout
{
    private String name;
    private double difficulty;
    private ArrayList<Activity> activities;
    
    public Workout(String name, double difficulty)
    {
        this.name = name;
        this.difficulty = difficulty;
        this.activities = new ArrayList<>();
    }
    
    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public double getDifficulty()
    {
        return this.difficulty;
    }

    public void setDifficulty(double difficulty)
    {
        this.difficulty = difficulty;
    }
    
    public ArrayList<Activity> getActivities() 
    {
        return this.activities;
    }
    
    public int getTotalDuration()
    {
        if (this.activities.size() <= 0)
        {
            return -1;
        }
        
        Activity activity = this.activities.get(this.activities.size() - 1);
        
        return activity.getEndTime();
    }
    
    public int getTotalSecondsOfRest()
    {
        if (this.activities.size() <= 1)
        {
            // When there are 0 or 1 activities, there is no rest
            return 0;
        }
        
        int totalRest = 0;
        
        for (int i = 1; i < this.activities.size(); i++)
        {
            Activity second = this.activities.get(i);
            Activity first = this.activities.get(i - 1);
            
            int difference = second.getStartTime() - first.getEndTime();
            totalRest += difference;
        }
        
        return totalRest;
    }
    
    public boolean addActivity(Activity activity)
    {
        if (activity.getStartTime() > this.getTotalDuration())
        {
            this.activities.add(activity);
            return true;
        }
        
        return false;
    }
    
    public String getWorkoutDescription()
    {
        int number = 1;
        String result = "";
        
        for (Activity activity : this.activities)
        {
            result += number + " " + activity.getDescription() + "\n";
            number++;
        }
        
        return result;
    }
}
