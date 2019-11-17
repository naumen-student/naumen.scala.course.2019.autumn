# Scala collection
---
## Коллекции

* списки
* множества
* наборы
* массивы
* вектора
* Option



---
### Списки. List

 * однородны
   * List[String] не может содержать элементы Int
 * ковариантны
   * если T подтип S, то и List[T] подтип List[S]
    
    
    
---
### List. Создание 1
```scala 
val list0 = List() 
//list0: List[Nothing] = List()

val list1 = List(1, 2, 3) 
//list1: List[Int] = List(1, 2, 3)

val list2 = List.range(1,5) 
//list2: List[Int] = List(1, 2, 3, 4)
val list2a = List.range(1, 5, 2) 
//list2a: List[Int] = List(1, 3)

val list3 = List.fill(5)("lol") 
//list3: List[String] = List("lol", "lol", "lol", "lol", "lol")

val list4 = List.tabulate(5)(n => n/2.0) 
//list4: List[Double] = List(0.0, 0.5, 1.0, 1.5, 2.0)

```


---
### List. Создание 2

Nil - пустой список
```scala
val empty = Nil 
//empty: Nil.type = List()


val list = 3 :: 2 :: 1 :: Nil 
//list: List[Int] = List(3, 2, 1)

val d = Nil 
//d: Nil.type = List()
val c = 3 :: d 
//c: List[Int] = List(3)
val b = 2 :: c 
//b: List[Int] = List(2, 3)
val a = 1 :: b 
//a: List[Int] = List(1, 2, 3)

```


---
### List. Шаблоны
```scala
val List(a, b, c) = List(1, 2, 3) 
//a: Int = 1
//b: Int = 2
//c: Int = 3

val x :: y :: z = List(1, 2, 3) 
//x: Int = 1
//y: Int = 2
//z: List[Int] = List(3)
```


---
### List. Шаблоны
```scala
val List(a, b, c) = List(1, 2, 3, 4) 
//scala.MatchError: List(1, 2, 3, 4) (of class 
//  scala.collection.immutable.$colon$colon)
//  ammonite.$sess.cmd33$.<clinit>(cmd33.sc:1)

val x :: y :: z = List(1, 2, 3, 4, 5) 
//x: Int = 1
//y: Int = 2
//z: List[Int] = List(3, 4, 5)

val x :: y :: z = List(1, 2) 
//x: Int = 1
//y: Int = 2
//z: List[Int] = List()

```


---
### Методы. head, tail, isEmpty
```scala
val head = List(1, 2, 3, 4, 5).head 
//head: Int = 1

val tail = List(1, 2, 3, 4, 5).tail 
//tail: List[Int] = List(2, 3, 4, 5)

val isEmpty = List(1, 2, 3, 4, 5).isEmpty 
//isEmpty: Boolean = false

val isEmptyNil = Nil.isEmpty 
//isEmptyNil: Boolean = true
```

---
### List. много других методов
 Scala предоставляет множество методов для работы с коллекциями


---
### List. методы высшего порядка
 Методы, которе не принимают никаких параметоров

---
### map, foreach
```scala
val abc = List(97 ,98, 99).map(_.toChar) 
//abc: List[Char] = List('a', 'b', 'c')

abc.foreach(println)
//a
//b
//c

```


---
### filter, partition



---
### find



---
### takeWhile, dropWhile



---
### span


---
### forAll, exist, contains


---
### :\ /:


---
### sortWith

```scala
val sort1 = List(10, 5, 8, 1, 7).sortWith(_ > _) 
//res22: List[Int] = List(10, 8, 7, 5, 1)

val sort2 = List("banana", "pear", "apple", "orange").sortWith(_ < _) 
//sort2: List[String] = List("apple", "banana", "orange", "pear")

val sort3 = List("banana", "pear", "apple", "orange").sortWith(_.length < _.length) 
//sort3: List[String] = List("pear", "apple", "banana", "orange")
```

---
### sorted
```scala
val a = List(10, 5, 8, 1, 7).sorted
//sort4: List[Int] = List(1, 5, 7, 8, 10)
```

---
### не всё умеет sorted*

```scala
case class Cat (name: String, age: Int)
val s = collection.SortedSet(Cat("Мурзик", 2), Cat("Murka", 1))
//  error: No implicit Ordering defined for Person.
```

---
### sorted по максимому

```scala
case class Cat (name: String, age: String) extends Ordered [Cat] {
    def compare (that: Cat): Int = {
        if (this.name == that.name)
            0
        else if (this.name > that.name)
            1
        else 
            0−1 //ammonite ломается
    }
}
```

---
### Чего же есть другого?


---
### Array


---
### Set, Map

* Set - множество ункальных значений
* Map - можество уникальных ключей

---
### TreeSet, TreeMap
SortedSet



SortedMap

---
### iterator

просто для понимания, что это основной тип
```scala
val it = Iterator("су", "е", "фа")
while (it.hasNext)
  println(it.next())
```


---
### mutable immutable



---

### Равенство
* Set
* Map
* Seq



### Равенство
```
Set(1, 2, 3) != List(1, 2, 3)

Set(1,3,2) == Set(1,2,3)

```

---
### Равенство

- mutable
- immutable
- НЕ-ВА-ЖНО

---
### Scala <=> Java
```scala
import collection.JavaConverters._
// import scala.jdk.CollectionConverters._ //2.13.0

val j1 = java.util.Arrays.asList("hey", "lol")
val j1s = j1.asScala
//j1s: collection.mutable.Buffer[String] = Buffer("hey", "lol")

val s1 = Seq("one", "dva")
val s1j = s1.asJava
//java.util.List[String] = SeqWrapper(List("one", "dva"))

```


---
### Scala <=> Java
```
Iterator               <=>     java.util.Iterator
Iterator               <=>     java.util.Enumeration
Iterable               <=>     java.lang.Iterable
Iterable               <=>     java.util.Collection
mutable.Buffer         <=>     java.util.List
mutable.Set            <=>     java.util.Set
mutable.Map            <=>     java.util.Map
mutable.ConcurrentMap  <=>     java.util.concurrent.ConcurrentMap
```



### Scala => Java

```
Seq           =>    java.util.List
mutable.Seq   =>    java.util.List
Set           =>    java.util.Set
Map           =>    java.util.Map
```

---
### сортируем пузырьком

```
 ЦИКЛ ДЛЯ J=1 ДО N-1 ШАГ 1
   F=0 
   ЦИКЛ ДЛЯ I=1 ДО N-J-1 ШАГ 1 
     ЕСЛИ A[I] > A[I+1] ТО ОБМЕН A[I],A[I+1]:F=1
   СЛЕДУЮЩЕЕ I  
   ЕСЛИ F=0 ТО ВЫХОД ИЗ ЦИКЛА
 СЛЕДУЮЩЕЕ J         
```

---
### Scala в лоб


```scala
def bubblesort[A <% Ordered[A]](arr: Array[A]) : Array[A] {
  
  for (j <- 1 to arr.length-1) {
    for (i <- 0 to (arr.length-1-j)) {
      if (arr(i) > arr(i+1)){
        var t = arr(i)
        arr(i) = arr(i+1)
        arr(i+1) = t
      }
    }
  }
  arr
}
```
---
### Scala, огда не убъют
```scala
def bubblesort[A <% Ordered[A]](list: List[A]): List[A] = {
  def sort(as: List[A], bs: List[A]): List[A] =
    if (as.isEmpty) bs
    else bubble(as, Nil, bs)

  def bubble(as: List[A], zs: List[A], bs: List[A]): List[A] = as match {
    case h1 :: h2 :: t =>
      if (h1 > h2) bubble(h1 :: t, h2 :: zs, bs)
      else bubble(h2 :: t, h1 :: zs, bs)
    case h1 :: Nil => sort(zs, h1 :: bs)
  }

  sort(list, Nil)
}
```
