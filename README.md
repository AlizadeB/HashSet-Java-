# Java-da HashSet sinfi

Burada qısaca HashSet sinfi haqqında məlumat və nümunələr öz əksini tapacaq.

## HashSet strukturu

#### HashSet sinfini çağırma

```http
  HashSet<Tip*> dəyişənAdı = new HashSet<>();
```
 *non-primitivlər (int, boolean, char ...) istifadə oluna bilməz.
 
 Wrapper siniflər istifadə oluna bilər : `String`, `Integer`,`Long`...

## HashSet sinfinin əlaqələri

![sinif əlaqələri](https://tutorialspoint.dev/image/hashset.png)


**HashSet** sinfi `Set` interfeysinin və `AbstractSet` sinfinin xüsusiyyətlər miras alıb. Java-dakı HashSet təməlini HashMap üzərində qurduğu üçün unikal dəyərlərə malik, təkrarlanmayan dəyərlər alır.
Həmçinin HashSet dəyərləri ardıcıl şəkildə tutacağına söz vermir. Bu da onun strukturu ilə bağlı bir xüsusiyyətdir.

## HashSet-in mühüm xüsusiyyətləri aşağıdakılardır:
- **HashSet** elementləri `hashing mexanizmdən` istifadə edərək saxlayır.
- **HashSet** `yalnız unikal elementləri` ehtiva edir.
- **HashSet** `null` dəyərə `icazə verir`.
- **HashSet** sinfi `sinxronlaşdırılmayıb`.
- **HashSet** daxiletmə qaydasına görə saxlamır (`not ordered`). Burada elementlər `hashcode` əsasında daxil edilir.
- **HashSet** `axtarış əməliyyatları` üçün ən yaxşı yanaşmadır.
- **HashSet**-in ilkin tutumu `16`, yükləmə əmsalı isə `0,75`-dir.


## HashSet sinfi üçün **Big O notasiyası**

|    vəziyyətlər  | notasiyası                |
| :------- | :------------------------- |
| `əlavə etmə (add)` | `O(1)` | 
| `seçmə (get) ` | `O(1)` | 
| `silmə (remove)` | `O(1)` | 
| `ehtiva etmə (contains)` | `O(1)` | 

## HashSet sinfinə aid bəzi **metodlar**

| Metod    | Açıqlama                       |
| :------- | :-------------------------------- |
| `add()` | Veriləni **HashSet**-in **sonuna** əlavə edir. |
| `remove()` | Veriləni **HashSet**-dən silir. |
| `contains()` | Verilənin **HashSet**-də olub olmadığını yoxlayır. |
| `size()` |  **HashSet**-in ölçüsünü geri qaytarır. |
| `toArray()` | **HashSet**-in **massivə** çevirir. |
| `isEmpty()` | **HashSet**-in boş olduğunu yoxlayır. |
| `clear()` | **HashSet**-i təmizləyir. |


Metodlar əlbəttəki bununla bitmir. Ətraflı məlumat üçün fərdi şəkildə internetdə axtara bilərsiniz.
