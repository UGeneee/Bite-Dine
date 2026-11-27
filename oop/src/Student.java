
public class Student extends Person{
    private String program;
    private int yearLevel;

    public void setProgram(String p) {
        program = p; 
    }
    public String getProgram() { 
        return program; 
    }
    public void setYearLevel(String y) { 
        yearLevel = Integer.parseInt(y.trim()); 
    }
    public int getYearLevel() { 
        return yearLevel; 
    }
}
