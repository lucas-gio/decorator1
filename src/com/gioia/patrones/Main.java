package com.gioia.patrones;

import com.gioia.patrones.domain.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pizza muzarella = new Muzzarella();
        Pizza napolitana = new Napolitana();
        Pizza fugazetta = new Fugazetta();
        Pizza calabresa = new Calabresa();

        ExtraDeAlbahaca albahaca = new ExtraDeAlbahaca(null);
        ExtraDeAnana anana = new ExtraDeAnana(null);
        ExtraDeFaina faina = new ExtraDeFaina(null);
        ExtraDeTomate tomate = new ExtraDeTomate(null);

        System.out.println("Muzarella sale $" + muzarella.getCost());
        System.out.println("Napolitana sale $" + napolitana.getCost());
        System.out.println("Fugazetta sale $" + fugazetta.getCost());
        System.out.println("Calabresa sale $" + calabresa.getCost());

        System.out.println("El extra de albahaca sale $" + albahaca.getCost());
        System.out.println("El extra de anana sale $" + anana.getCost());
        System.out.println("El extra de faina sale $" + faina.getCost());
        System.out.println("El extra de tomate sale $" + tomate.getCost());

        Pizza muzzarellaConFaina = new Muzzarella();
        muzzarellaConFaina = new ExtraDeFaina(muzzarellaConFaina);
        System.out.println("La muzzarela con faina sale $" + muzzarellaConFaina.getCost());

        Pizza muzzaEspecial = new Muzzarella();
        muzzaEspecial = new ExtraDeFaina(muzzaEspecial);
        muzzaEspecial = new ExtraDeAlbahaca(muzzaEspecial);
        muzzaEspecial = new ExtraDeTomate(muzzaEspecial);
        muzzaEspecial = new ExtraDeAnana(muzzaEspecial);

        System.out.println("La muzzarela con faina, albahaca, tomate, y ananá sale $" + muzzaEspecial.getCost());

        Pizza napolitanaConTomate = new Napolitana();
        napolitanaConTomate = new ExtraDeTomate(napolitanaConTomate);
        System.out.println("La napolitana con tomate sale $" + napolitanaConTomate.getCost());

    }
}
