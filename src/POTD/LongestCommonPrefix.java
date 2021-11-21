package POTD;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static int[] longestCommonPrefix(String s1, String s2){
        int a[]=new int[2];
        int i=0,max=0;
        while(i<s2.length())
        {
            int k=i,j=0;
            while(j<s1.length() && k<s2.length()&& s1.charAt(j)==s2.charAt(k))
            {
                //  System.out.print(s1.charAt(j));
                k++;j++;
            }
            max=Math.max(max,j);
            i++;
        }
        //  System.out.print(max);
        if(max==0)
        {
            a[0]=-1;
        }
        else{
            a[0]=0;
            a[1]=max-1;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(longestCommonPrefix("orbiivcfczgdatbkaytxwzdondvazjwpczxkwzraaaecthnvggteiysvcpwdausevrqrsjstjwxffkaltvrbulyyaudcqvglowdggxbpvzwalxogufhotioteryvoeicbnljkoahnxibwwhqdrhwzxsfpqadujixytijjjqziaaewjwccfyddqjuijzduhctclemwwlexnkvwizzoyctqlnzxoetyioavsorrbvoqflpqlqgluzdgoefckaatpdohtgaxdqnlcebpuhapgfxwkcaucbnrgebbmdypuoaysdnnkpesuboedrbhuqbauedghcydsabmeoboffjcgzglqjvkawmucqdlubpmbqyfhcwmhfoogxzxguhiswdwmiigjzumpuuywsnezdufctcjqmrkiwhwerepqyehsyirqvxryrwbmbmepfpzeyvkrzajzesteakwvhnwalznmnrbuicygxjxylixrbtvbdrzngxnrwcglujfcmellpkmctltueqvkjuxprmippoajyinmmyxdjjfevayzqtlzqiojxybmndxllmxzlwcwgjadjaebvqalaqxxpyjedippvooimtgucixoierfwsrwkqubqfftqwinmxvzsdtwltmvxeatytrillkbtpvlofyaetzwyttlofiljkghexspletgvqrjvpkakjyietvszdfknlutlojyseenuxxpohrysqixldpkivxvitpvhatbezoawnpkwjkpbummzdzhayflrugawcbabrayhrkdcxsdrgsrmrampfzibgkxinzlgbjntwrvtlbmstfemisdnslpavokkovqphekfxiaijmaeugqcbtrvggvdxfnlcdajjnqgvqpedrizaabbtswbbteyatlcwnoiaeovvdbaxlzxlcygwwhzpnzpgkrfahnambyjhzlelkbwobfkxmkmcjbiwupwccwqg","uznwmrhyufmvkyszigbuhlsdbofdmxjjyyfkroiltuievcffigzrtrvuhcaucldakkldyvprszxnecsmkugendavhapjmukyexdcsutmutzyvumiosmbxmwfpnodhadnxgpsblevegvbahlqcxrzmqebfvgpvjcvpupqfvnlbiodsatuznvldcoixuxudcpvwelbcbodjejdecxgpttuviduecokeefaksdottsfabigfgmxbgryqusuziefojibcnpvjhcjklpstcpuiguydouewzjlkrmmhbkqlmzxzopssgmcnicswxwtwheibqvithyevzevptnicckpknjhmhakogspypzrwxyuycpoxewzgiqtxzcjgetxkmmkbobanbumdladpycygtrgutpdzlajzovccwcqaycfjeibclzkgsqanifmtfxsusuyqzoqxsyjwgkatllbfdesljggpdalxvjnwygvqegpmspgdcjignctxiaonazkxiyvigrbkzqwsfexiogodkjatlqioptlatjkzcllbbhthorpezfhjqkecapqsidubmecoqnsrulakerofyyrpivrkkheumyxzdzpvmhmjvpvbgkhfkyusvneiwjcijajmbzjqiwzfnuhtgoaqmukhjrpfauojwzyxyhnjfooslxorlokzlwjunaanuqzqpzqqifzoupifnwyankayhjsujukgklyckqsswtiskrzxpzackccrlxnwrxecifeuvynrrxlbqkbgkdkufpnsmaqdavhkanfxluperciinlqxoctvrindifjkaqvcgaaruryntivitnhjqcghktnvywfbocfuchoyammwwjerxoapqiwbblwbjdeygksktijuwxqsiwjhklwbtvcwgaaqfeqlqkykthgpgwkostwfhsgapkzwmzorfefwofihmozumjkgeilldtosfnorocl")));
    }
}
