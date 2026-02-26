/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petemuan2.Soal;

/**
 *
 * @author ANONYMOUS
 */
public class Bingo {

    public Bingo() {
        tampilkanLagu();
    }

    void tampilkanLagu() {
        String[][] lirik = {
            {"B", "I", "N", "G", "O"},
            {"(clap)", "I", "N", "G", "O"},
            {"(clap)", "(clap)", "N", "G", "O"},
            {"(clap)", "(clap)", "(clap)", "G", "O"},
            {"(clap)", "(clap)", "(clap)", "(clap)", "O"},
            {"(clap)", "(clap)", "(clap)", "(clap)", "(clap)"}
        };

        for (int i = 0; i < lirik.length; i++) {
            System.out.println("There was a farmer who had a dog,");
            System.out.println("And Bingo was his name-o.");

            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < lirik[i].length; k++) {
                    System.out.print(lirik[i][k]);
                    if (k < lirik[i].length - 1) {
                        System.out.print("-");
                    }
                }
                System.out.println();
            }

            System.out.println("And Bingo was his name-o.\n");
        }
    }
}