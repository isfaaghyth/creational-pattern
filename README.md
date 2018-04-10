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

