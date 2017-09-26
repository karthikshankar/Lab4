/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 * Class for Reclamation Project.
 */
public class ReclamationProject {

    /**
     * This method returns a a string and is of type static.
     * @param a First string parameter in method which is used for manipulation.
     * @param b Second string parameter in method which is used for manipulation.
     * @return String
     */
    static String doit(final String a, final String b) {

        String newA = a;
        String newB = b;

        if (newA.length() > newB.length()) {
            String c = newA;

            newA = newB;
            newB = c;
     }

        String r;

        if (newA.equals(newB)) {
            r = "";
        } else {
            r = "";
        }
        /*
         * For loop with i which goes through the length of the string and each character
         */
        for (int i = 0; i < newA.length(); i++) {
            for (int j = newA.length() - i; j > 0; j--) {
                for (int k = 0; k < newB.length() - j; k++) {
                    if (newA.regionMatches(i, newB, k, j) && j > r.length()) {
                        r = newA.substring(i, i + j);
                    }
               }
            }
        } return r; }
}
