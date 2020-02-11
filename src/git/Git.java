
//Author carlos

package git;

public class Git {

 
    public static void main(String[] args) {

        int dni = 12345678;
        char letter = dniletter(dni);
        System.out.println(dni +":"+ letter);
        
        
    }
    private static char dniletter(int dni) {
        
        char letter = 't';
        String letters = "trwagmyfpdxbnjzsqvhlcke";
        int res=dni%23;
        letter = letters.charAt(res);
       
        return letter;
}
}
