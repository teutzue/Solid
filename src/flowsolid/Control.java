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
    /**
     * Pre: At least one word pair must be present Post: Returns a question
     * randomly selected from the collection of word pairs.
     */
    @Override
    public String getRandomQuestion(){
        return "";
    }
    /**
     * Pre: Post: Returns true if (question, quess) exists as a word pair in the
     * collection, otherwise false.
     */
    @Override
    public boolean checkGuess(String question, String quess){
        return true;
    }
    /**
     * Pre: Post: Returns the answer corresponding to the question if this
     * exists in the collection. Otherwise it returns null.
     */
    @Override
    public String lookup(String question){
        return "";
    }
    /**
     * Pre: Post: Word pairs are read from the file "filename" and added to the
     * collection of word pairs. Returns true if successfully done. Otherwise it
     * returns false.
     */
    @Override
    public boolean load(String filename){
        return true;
    }
    /**
     * Pre: Post: All word pairs from the collection has been written to the
     * file "filename" Returns true if successfully done. Otherwise false.
     */
    @Override
    public boolean save(String filename){
        return true;
    }
    /**
     * Pre: Post: The existing collection of word pairs is cleared
     */
    @Override
    public void clear(){
        
    }
}
