import java.util.HashMap;

class RnaTranscription {

    private HashMap<Character,Character> transformMap = new HashMap<>();
    RnaTranscription(){
        transformMap.put('G','C');
        transformMap.put('C','G');
        transformMap.put('T','A');
        transformMap.put('A','U');
    }
    String transcribe(String dnaStrand) {
        String rna = "";
        for(int i=0 ; i<dnaStrand.length() ; i++ ){
            rna = rna + transformMap.get(dnaStrand.charAt(i));
        }
        return rna;
    }

}
