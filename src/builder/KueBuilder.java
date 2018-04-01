package builder;

import kue.basah.Nagosari;
import kue.basah.Pancong;
import kue.kering.Kukis;
import kue.kering.Nastar;

public class KueBuilder {

    public Kue kueBasah() {
        Kue kue = new Kue();
        kue.tambahKue(new Nagosari());
        kue.tambahKue(new Pancong());
        return kue;
    }

    public Kue kueKering() {
        Kue kue = new Kue();
        kue.tambahKue(new Kukis());
        kue.tambahKue(new Nastar());
        return kue;
    }

}
