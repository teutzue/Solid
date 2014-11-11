package flowsolid;

public class Control implements WordPairControlInterface{
        
    @Override
    public void add(String question, String answer){
        
    }
    @Override
    public int size(){
        return 0;
    }
    @Override
    public String getRandomQuestion(){
        return "";
    }
    @Override
    public boolean checkGuess(String question, String quess){
        return true;
    }
    @Override
    public String lookup(String question){
        return "";
    }
    @Override
    public boolean load(String filename){
        return true;
    }
    @Override
    public boolean save(String filename){
        return true;
    }
    @Override
    public void clear(){
        
    }
}
