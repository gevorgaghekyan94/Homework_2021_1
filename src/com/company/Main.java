package com.company;

import com.company.starwars.*;

public class Main {

    public static void main(String[] args) {

        LukeSkywalker lukeSkywalker = new LukeSkywalker();
        DarthVader darthVader = new DarthVader();
        Leia leia = new Leia();
        Han han = new Han();
        R2D2 r2D2 = new R2D2();

        lukeSkywalker.relationTo(darthVader);
        lukeSkywalker.relationTo(leia);
        lukeSkywalker.relationTo(han);
        lukeSkywalker.relationTo(r2D2);

        System.out.println(CustomMath.giveNextPrime(28));
    }
}
