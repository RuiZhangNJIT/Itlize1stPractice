
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue+valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String str="";
        for(int i=valueToBeReversed.length()-1;i>=0;--i)
        {
            str+=valueToBeReversed.charAt(i);
        }
        
        return str;
        
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        
        int left=0;
        int right=word.length();
        
        int middle=left+(right-left)/2;
        
        return word.charAt(middle);
        
        
        
        
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String str="";
        
        for(int idx=0;idx<value.length();++idx)
        {
           if(value.charAt(idx)==charToRemove)
             continue;
           else
             str+=value.charAt(idx);
        }
        
        return str;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        
        String ret="";
        String[] splited=sentence.split("\\s+");
        if(splited.length==0)
        return ret;
        else
         return splited[splited.length-1];
        
    }
}
