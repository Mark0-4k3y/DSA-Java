package Miscellaneous;

public class GeneStringProblem
{
    //ATG represent the starting code of a gene.
    //TAA represents the end of the string.
    //ATG...........TAA represent a whole gene, and we have to a gene code from given string.
    public static void main(String[] args)
    {

        String genomeData= "GAGTGCCTGAAGTTACCCAAGGAACCAGCCTAATCTCAGGAGCAATCCTG\n" +
                "CTAACCTGACAAAAATTAGCACCCCTGTCCATCCTTTATCAAATCATCCC\n" +
                "CTCAATCGACATCAATCTCCTCATTATCTCAGGATTACTATCAATCCTAG\n" +
                "TAGGAGGCTGAGGAGGTCTTAACCAAACCCAGCTACGTAAAATCTTGGCC\n" +
                "TACTCATCAATCGCTCACATGGGCTGGATACTCATCATTATACCCTACAA\n" +
                "CCCTTCTCTCACCATCCTGAACCTTGTAATCTACATCCTAATAACGCTCT\n" +
                "CCATCTTCATGATCCTAATAAACAATTACTCTACCTCCACATCTACCCTG\n" +
                "TCCCTACTCTGGAATAACACCCCAATAATAATGATCATGCTCATGATCAC\n" +
                "CCTACTATCACTAGGTGGCCTCCCACCACTATCAGGATTTATGCCCAAAT\n" +
                "GACTAATCATCTATGAACTAACTAAAAACGACAACATCATCCTACCTGCA\n" +
                "TCCATAGCCATATTTGCTTTGCTTAATCTATACTTCTATATACGCCTAAT\n" +
                "CTACTCCTCCTCACTCACTATATTCCCATCAACAAACAACATAAAAATAA\n" +
                "AATGACAATTTACCAACCCCAAATACCTCACCCTCCTTTCTCCCCTGATC\n" +
                "ATTCTATCGACCCTAATTCTTCCACTCACCCCAACCCTCTCCATTCTGGA";

        int startIndex=genomeData.indexOf("ATG");
        int endIndex=genomeData.indexOf("TAA", startIndex);
        System.out.println("\nThe first founded gene: "+genomeData.substring(startIndex, endIndex+3)+"\n");

        //We have to check the length to complete one codon, One codon=3characters or Nucleotide.
        boolean isValid=false;
        if((endIndex-startIndex)%3==0) {
            System.out.println("In the first time: ");
            System.out.println("Valid gene is: "+genomeData.substring(startIndex, endIndex+3));
            return;
        }

        while(!isValid && endIndex<genomeData.length()){
            endIndex=genomeData.indexOf("TAA", endIndex+1);
            if((endIndex-startIndex)%3==0) isValid=true;
        }System.out.println("Valid gene is: "+genomeData.substring(startIndex, endIndex+3));
    }
}
