package poo;

import java.util.Random;

public class Buzz {
    //Atributos
    private String frases [] = {"Eu sou Buzz Lightyear", "Ao infinito, e além! ", "Buzz Lightyear ao resgate!!",
                                "Buzz Lightyear se apresentando para o serviço", "Eu sou Buzz Lightear, patrulheiro espacial", "Buzz Lightyear, desligando!!",};
    private Random rand = new Random();
    private String golpes [] = {"SHUTO-UTI", "HAITO-UTI", "AGUE-ZUKI", "TEISHO-UTI", "KAKE-UKE", "OI-ZUKI", "TETTSUI-UTI"};

    //Métodos
    void abrirVisor(){
        System.out.println("visor aberto");
    }
    void fecharVisor(){
        System.out.println("visor fechado");
    }
    void falar(){

        System.out.println(frases[rand.nextInt(6)]);
    }

    void disparaLaser(){

        System.out.println("laser disparado");
    }
    void golpear(){
        System.out.println(golpes[rand.nextInt(7)]);
    }
}


