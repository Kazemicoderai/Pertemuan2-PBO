/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petemuan2.Soal;

/**
 *
 * @author ANONYMOUS
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        MatematikaInterface m = new Matematika();

        System.out.println("Pertambahan: 20 + 10 = " + m.pertambahan(20, 10));
        System.out.println("Pengurangan: 10 - 5 = " + m.pengurangan(10, 5));
        System.out.println("Perkalian: 10 * 3 = " + m.perkalian(10, 3));
        System.out.println("Pembagian: 21 / 2 = " + m.pembagian(21, 2));
    }
}