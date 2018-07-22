/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longest.common.subsequence;

/**
 *
 * @author Benjamin
 */
public class LongestCommonSubsequence {

    public static int[][] createTable(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int[][] table = new int[lenA + 1][lenB + 1];

        return table;
    }

    public static int lcs(String a, String b, int table[][]) {
        int maximum =0;
        int lenA = a.length();
        int lenB = b.length();
        
        for (int i = 0; i < lenA; i++) {

            for (int k = 0; k < lenB; k++) {
                boolean matched = a.charAt(i) == b.charAt(k);
               int v1 = table[i][k];
                if (matched) v1 +=1;
                int v2 = table[i][k+1];
                int v3 = table[i+1][k];
                table[i+1][k+1] = Math.max(v1, Math.max(v2, v3));
                
            }
        }
        return table[lenA][lenB];
    }
        /**
         * @param args the command line arguments
         */
    public static void main(String[] args) {
        String a = "TCGAACA";
        String b = "ACGAAGT";
        System.out.println(lcs (a,b,createTable(a,b)));
        
        // TODO code application logic here
    }

}
