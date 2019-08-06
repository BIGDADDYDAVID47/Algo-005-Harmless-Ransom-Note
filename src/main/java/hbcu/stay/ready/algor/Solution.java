package hbcu.stay.ready.algor;
import java.until.*;

public class Solution {
    Map<String, Integer> magezineMap;
    Map<String, Integer> noteMap;


    public Solution(String magazine, String note) {
        Collection<String> magazineText = Arrays.aslist(magazine.split(" "));
        Collection<String> noteText = Arrays.asList(note.split(" "));
        magazineMap = new HashMap<String, Integer>();
        noteMap = new HashMap<String, Integer>();

        for (String value : magazineText) {
            if (magazineMap.get(value) == null) {
                magazineMap.put(value, 0);
            }
            Integer currentValue = magazineMap.get(value);
            currentValue++;
            magazineMap.put(value, currentValue);
        }

        for (String value : magazineText) {
            if (noteMap.get(value) == null) {
                noteMap.put(value, 0);
            }
            Integer currentValue = noteMap.get(value);
            currentValue++;
            noteMap.put(value, currentValue);

        }
    }
    public boolean solve (){
        for(String ransomWord  : noteMap.keySet()){
            Integer ransomValue = noteMap.get(ransomWord);
            Integer magazineValue =   magazineMap.get(ransomWord);
        }
    }
}



    //public Boolean harmlessRansomNote(String message , String magazineText){
        //return null;
   // }
//}
