package petemuan2.Soal;

public class bingo {

    public bingo() {
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

        for (int i = 0; i < 6; i++) {
            System.out.println("There was a farmer who had a dog,");
            System.out.println("And Bingo was his name-o.");

            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(lirik[i][k]);
                    if (k < 4) {
                        System.out.print("-");
                    }
                }
                System.out.println();
            }

            System.out.println("And Bingo was his name-o.\n");
        }
    }

    public static void main(String[] args) {
        new bingo();
    }
}