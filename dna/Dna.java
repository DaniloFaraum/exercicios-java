public class Dna{
    public static boolean divideByThree(String dna){
            int dnaLength = dna.length();
            if(dnaLength % 3 == 0){
                return true;
            }
            else{
                return false;
            }
        }

        public static boolean startWith(String dna){
            if(dna.indexOf("ATG") == 0){
                return true;
            }
            else{
                return false;
            }
        }

        public static boolean endWith(String dna){
            if(dna.indexOf("TGA") == dna.length()-3){
                return true;
            }
            else{
                return false;
            }
        }

        public static String protein(String dna){
            String dnaProtein;
            if(divideByThree(dna) && startWith(dna) && endWith(dna)){
                dnaProtein = dna.substring(3, dna.indexOf("TGA"));
            }
            else{
                dnaProtein = "Sem proteina";
            }
            return dnaProtein;
        }

    public static void main(String[] args) {
        String dna1 = "ATGCGATACTGA";
        String dna2 = "ATGCGATAGA";
        String dna3 = "ATGCACTTCTGA";

        System.out.println(protein(dna1));
        System.out.println(protein(dna2));
        System.out.println(protein(dna3));       
    }
}