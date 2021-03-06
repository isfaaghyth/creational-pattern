# creational-pattern
Sebagai syarat tugas mata kuliah Pola Desain Perangkat Lunak.

1. membuat ```interface()``` Item.
```java
import util.Packing;

public interface Item {
   String name();
   Packing packing();
   float price();
}
```
Pada interface ini, penerapannya sebagai pola object untuk mengidentifikasi masing-masing kue, seperti name(), packing(), dan price().

2. Membuat ```interface()``` Packing.
```java
package util;

public interface Packing {
    String pack();
}
```
Pada interface ini, penerapan sebagai pola object untuk mengidentifikasi jenis packing nya.

3. Membuat ```implements()``` Packing
```java

package pack;

import util.Packing;

public class Topples implements Packing {

    @Override
    public String pack() {
       return "Topples";
    }
    
}
```
Program diatas mengimplements dari interface Packing bahwa keluaran dari program tersebut adalah packing menggunakan topples

4.Membuat ```implements()``` Packing
```java
package pack;

import util.Packing;

public class Daun implements Packing {

    @Override
    public String pack() {
        return "Daun";
    }
    
}
```
Program diatas mengimplements dari interface Packing bahwa keluaran dari program tersebut adalah packing menggunakan Daun

5.Membuat ```implements()``` Item
```java
package type;

import pack.Topples;
import util.Item;
import util.Packing;

public abstract class KueKering implements Item {
    
    @Override
    public Packing packing() {
        return new Topples();
    }

    @Override
    public abstract float price();
        
    
}
```
Program diatas mengimplements dari interface item dimana program diatas menjelaskan utk kue kering keluaran packingnya adalah topples dengan harga tertentu

6.Membuat ```implements()``` Item
```java
package type;

import util.Item;
import util.Packing;
import pack.Daun;

public abstract class KueBasah implements Item {

    @Override
    public Packing packing() {
        return new Daun();
    }

    @Override
    public abstract float price();
        
    
}
```
Program diatas mengimplements dari interface item dimana program diatas menjelaskan utk kuebasag keluaran packingnya adalah Daun dengan harga tertentu

7. Membuat ```extends()``` KueKering


```java
package kue.kering;

import type.KueKering;

public class Kukis extends KueKering {

    @Override
    public float price() {
        return 15.0f;
    }

    @Override
    public String name() {
       return "Kukis";
    }
    
}
```

```java
package kue.kering;

import type.KueKering;

public class Nastar extends KueKering {

    @Override
    public float price() {
       return 25.0f;
    }

    @Override
    public String name() {
        return "Nastar";
    }
    
}
```
Program diatas mengekstends dari kelas KueKering, dimana pada object ini mendefinisikan kue kering jenis Kukis dan Nastar dengan harga yang berbeda

8. Membuat ```ekstends()``` KueBasah
```java
package kue.basah;

import type.KueBasah;

public class Nagosari extends KueBasah {

    @Override
    public float price() {
        return 10.0f;
    }

    @Override
    public String name() {
        return "Nagosari";
    }
    
}
```
```java
package kue.basah;

import type.KueBasah;

public class Pancong extends KueBasah {

    @Override
    public float price() {
       return 5.0f;
    }

    @Override
    public String name() {
        return "Pancong";
    }
    
}
```
Program diatas mengekstends dari kelas KueBasah, dimana pada object ini mendefinisikan kue basah jenis Nagosari dan Pancong dengan harga yang berbeda


Happy coding!
