package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int sauvgarde;

        Dé lance = new Dé()  ;
        Joueur resulta = new Joueur();

        int tab[] = {0,0,0,0,0};

        for (int i=0;i<10;i++)
        {
            System.out.println("tour numéro "+(i+1));

            for (int j=0;j<5;j++)
            {
                sauvgarde = lance.lancedé();
                System.out.println("le joueur"+(j+1)+" a "+sauvgarde);
                tab[j] = resulta.score(tab[j],sauvgarde);/*il faut ajouter des get/setScore()*/
            }
        }
/*****Correct *****/
        int max = tab[0];
        int indice = 1;

        for (int j=1;j<5;j++)
        {
            if (tab[j]>max)
            {
                max=tab[j];
                indice=j+1;
            }

        }
        System.out.print("le gagnient est le joueur "+indice+" avec un score de : "+max+" points.");
    }
}

