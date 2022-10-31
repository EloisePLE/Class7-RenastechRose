package Day10_StringMethods;

import java.util.Scanner;

public class Homework17 {
    public static void main(String[] args) {

        String miniBio = "hello my name is <yourname>.       i am <yourage> years old.  i live in <yourcity>.   " +
                "I have been in IT industry for about 6 years. I STarted as MAnual TESter and NOW I am doiNG AuTomaTion Testing. " +
                "I have experience in EducatION, energy,finance and some manY Other AREAs. " +
                "i HAve scrum master and Oracle java Programmer certificates.   i love JaVA.  " +
                " I designed and DEVELoped many automation test cases using BDD FRamework.";
        String name = miniBio.substring(0, 16).replaceFirst("h", "H");
        System.out.println(name+" Isabel.");
        System.out.println("Length: "+name.length()+ "; 1st, 4th and 5th characters: "+name.charAt(0)+name.charAt(3)+name.charAt(4));
        String age = miniBio.substring(35, 60).replaceFirst("i", "I");
        System.out.println(age.replace("<yourage>", "30"));
        System.out.println("Length: "+age.length()+ "; 1st, 4th and 5th characters: "+age.charAt(0)+age.charAt(3)+age.charAt(4));
        String city = miniBio.substring(62, 71).replaceFirst("i", "I");
        System.out.println(city+ " Toronto.");
        System.out.println("Length: "+city.length()+ "; 1st, 4th and 5th characters: "+city.charAt(0)+city.charAt(3)+city.charAt(4));
        String ind = miniBio.substring(86, 131).toLowerCase().replaceFirst("i", "I");
        System.out.println(ind.replace("it", "IT"));
        System.out.println("Length: "+ind.length()+ "; 1st, 4th and 5th characters: "+ind.charAt(0)+ind.charAt(3)+ind.charAt(4));
        String qa = miniBio.substring(132, 198).toLowerCase().replaceFirst("i", "I");
        System.out.println(qa.replace(" i", " I"));
        System.out.println("Length: "+qa.length()+ "; 1st, 4th and 5th characters: "+qa.charAt(0)+qa.charAt(3)+qa.charAt(4));
        String edu = miniBio.substring(198, 271).toLowerCase().replaceFirst("i", "I");
        System.out.println(edu.replace("f", " f"));
        System.out.println("Length: "+edu.length()+ "; 1st, 4th and 5th characters: "+edu.charAt(0)+edu.charAt(3)+edu.charAt(4));
        String cert = miniBio.substring(272, 332).toLowerCase().replaceFirst("i", "I");
        System.out.println(cert.replace("oracle java programmer", "Oracle Java Programmer"));
        System.out.println("Length: "+cert.length()+ "; 1st, 4th and 5th characters: "+cert.charAt(0)+cert.charAt(3)+cert.charAt(4));
        String lov = miniBio.substring(335, 347).toLowerCase().replaceFirst("i", "I");
        System.out.println(lov.replace("j", "J"));
        System.out.println("Length: "+lov.length()+ "; 1st, 4th and 5th characters: "+lov.charAt(0)+lov.charAt(3)+lov.charAt(4));
        String design = miniBio.substring(350, 422).toLowerCase().replaceFirst("i", "I");
        System.out.println(design.replace("bdd", "BDD"));
        System.out.println("Length: "+design.length()+ "; 1st, 4th and 5th characters: "+design.charAt(0)+design.charAt(3)+design.charAt(4));

        System.out.println(name+" Isabel. "+age.replace("<yourage>", "30")+" "+city+ " Toronto. "+ind.replace("it", "IT")+
                " "+qa.replace(" i", " I")+" "+edu.replace("f", " f")+" "
                +cert.replace("oracle java programmer", "Oracle Java Programmer")+" "+
                lov.replace("j", "J")+" "+design.replace("bdd", "BDD"));
        }

    }



