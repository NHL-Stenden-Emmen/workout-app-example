import java.util.ArrayList;
import java.util.Iterator;

public class App
{
    private ArrayList<Workout> workouts;
    
    public App()
    {
        this.workouts = new ArrayList<>();
    }
    
    public ArrayList<Workout> getWorkouts()
    {
        return this.workouts;
    }
    
    public void addWorkout(Workout workout)
    {
        this.workouts.add(workout);
    }
    
    public int getTotalSecondsOfWorkouts()
    {
        int total = 0;
        
        for (Workout workout : this.workouts)
        {
            total += workout.getTotalDuration();
        }
        
        return total;
    }
    
    public ArrayList<Workout> removeWorkoutsThatAreTooLong()
    {
        Iterator<Workout> it = this.workouts.iterator();
        ArrayList<Workout> deleted = new ArrayList<>();
        
        while (it.hasNext())
        {
            Workout workout = it.next();
            if (workout.getTotalDuration() > 600)
            {
                deleted.add(workout);
                it.remove();
            }
        }
        
        return deleted;
    }
}
