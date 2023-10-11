public class Twofer {
    public String twofer(String name) {
        String cookies = "One for you, one for me.";
        if(name==null){

            return cookies;}

        return "One for "+name+", one for me.";
    }
}
