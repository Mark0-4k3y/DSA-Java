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
        System.out.println(genomeData.substring(startIndex, endIndex+3));
    }
}
