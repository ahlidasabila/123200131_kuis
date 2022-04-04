/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penilaian;
import Kriteria.InputNilai;
import Kriteria.Designer;
import Kriteria.Manager;
import Kriteria.Programmer;
import java.util.Scanner;

/**
 *
 * @author ahlida
 */
public class Main {

    public static void main(String[] args) {
       try{
       Scanner input= new Scanner(System.in);
        System.out.println("Pelamaran Lowongan Pekerjaan");
        System.out.println(" 1. Programmer");
        System.out.println(" 2. Designer");
        System.out.println(" 3. Manager");
        System.out.print(" Pilih Jenis Pekerjaan : ");
        int pilih = input.nextInt();
        
        //scanner berupa data
        System.out.println("=== FORMULIR PELAMAR ===");
        Scanner data= new Scanner(System.in);
        System.out.print(" Nama Lengkap : ");
        String nama = data.next();
        
        System.out.println("---Penilaian---");
        System.out.println("Keterangan: Nilai yang valid berada di antara 0-100");
        
        if (pilih == 1){
            //programmer
            System.out.print("Input Nilai Programming Knowledge : ");
            int nilaiSatu= data.nextInt();
            System.out.print("Input Nilai Clean Coding : ");
            int nilaiDua = data.nextInt();
            System.out.print("Input Nilai Debugging : ");
            int nilaiTiga = data.nextInt();
            Programmer programmer = new Programmer(nama,nilaiSatu,nilaiDua,nilaiDua);
            do{
                System.out.println("=== MENU ===");
                System.out.println(" 1. Tampilkan Hasil");
                System.out.println(" 2. Ubah Nilai Pelamar");
                System.out.println(" 3. Exit");
                System.out.print(" Pilih : ");
                int Menu = input.nextInt();
                if (Menu == 1){
                    System.out.println("Nilai Akhir : " + programmer.NilaiTotal());
                    System.out.println("Keterangan : " + programmer.Keterangan());
                }
                else if (Menu == 2){
                    System.out.print("Input Nilai Programming Knowledge : ");
                    programmer.inputNilaiSatu(input.nextInt());
                    System.out.print("Input Nilai Clean Coding : ");
                    programmer.inputNilaiDua(input.nextInt());
                    System.out.print("Input Nilai Debugging : ");
                    programmer.inputNilaiTiga(input.nextInt());
                    
                }
                else {
                    System.out.println("Terimakasih");
                    break;
                }
            }while(true);
        }
        else if (pilih == 2){
            System.out.print("Input Nilai Design Portofolio : ");
            int nilaiSatu= data.nextInt();
            System.out.print("Input Nilai Prototyping : ");
            int nilaiDua = data.nextInt();
            System.out.print("Input Nilai Creativity : ");
            int nilaiTiga = data.nextInt();
            Designer designer = new Designer(nama,nilaiSatu,nilaiDua,nilaiTiga);
            do{
                System.out.println("=== MENU ===");
                System.out.println(" 1. Tampilkan Hasil");
                System.out.println(" 2. Ubah Nilai Pelamar");
                System.out.println(" 3. Exit");
                System.out.print(" Pilih : ");
                int Menu = input.nextInt();
                
                if (Menu == 1){
                    System.out.println("Nilai Akhir : " + designer.NilaiTotal());
                    System.out.println("Keterangan : " + designer.Keterangan());
                }
                else if (Menu == 2){
                    System.out.print("Input Nilai Design Portofolio : ");
                    designer.inputNilaiSatu(input.nextInt());
                    System.out.print("Input Nilai Prototyping : ");
                    designer.inputNilaiDua(input.nextInt());
                    System.out.print("Input Nilai Creativity : ");
                    designer.inputNilaiTiga(input.nextInt());
                }
                else {
                     System.out.println("Terimakasih");
                    break;
                }
            }while(true);
        }
        else if(pilih == 3){
            System.out.print("Input Nilai Innovation : ");
            int nilaiSatu= data.nextInt();
            System.out.print("Input Nilai Decision Making : ");
            int nilaiKedua = data.nextInt();
            System.out.print("Input Nilai Communication: ");
            int nilaiTiga = data.nextInt();
            Manager manager = new Manager(nama,nilaiSatu,nilaiKedua,nilaiTiga);
            do{
                System.out.println("=== MENU ===");
                System.out.println(" 1. Tampilkan Hasil");
                System.out.println(" 2. Ubah Nilai Pelamar");
                System.out.println(" 3. Exit");
                System.out.print(" Pilih : ");
                int Menu = input.nextInt();
                
                if (Menu == 1){
                    System.out.println("Nilai Akhir : " + manager.NilaiTotal());
                    System.out.println("Keterangan : " + manager.Keterangan());
                }
                else if (Menu == 2){
                    System.out.print("Input Nilai Innovation : ");
                    manager.inputNilaiSatu(input.nextInt());
                    System.out.print("Input Nilai Decision Making  : ");
                    manager.inputNilaiDua(input.nextInt());
                    System.out.print("Input Nilai Communication: ");
                    manager.inputNilaiTiga(input.nextInt());
                }
                else {
                    System.out.println("Terimakasih");
                    break;
                }
            }while(true);
        }
        else{
            System.out.println("=== Input SALAH ===");
            System.out.println("(Mohon Input Ulang)");
        }
        }
        catch(Exception error){
            System.out.println("Error karena " +error.getMessage());
        }
    }
}