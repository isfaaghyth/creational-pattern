package builder;

import util.Item;

import java.util.ArrayList;
import java.util.List;

public class Kue {
    private List<Item> items = new ArrayList<>();

    public void tambahKue(Item item) {
        items.add(item);
    }

    public float getHarga() {
        float cost = 0.0f;

        for (Item i: items) {
            cost += i.price();
        }

        return cost;
    }

    public void tampilkanKue() {
        for (Item i: items) {
            System.out.println("Nama Kue: " + i.name());
            System.out.println("Pembungkus: " + i.packing());
            System.out.println("Harga: " + i.price());
        }
    }
}
