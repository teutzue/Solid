package flowsolid;

public class Control implements WordPairControlInterface{
    
    /**
     * Pre: Post: A new word pair is added to the existing collection of word
     * pairs. This method does not save to file!
     */
    @Override
    public void add(String question, String answer){
        
    }
    /**
     * Pre: Post: Returns the number of wordpairs in the collection (not the
     * file).
     */
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
