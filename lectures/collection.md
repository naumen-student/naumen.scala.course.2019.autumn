# Чистый код
---
## Что такое чистый код
---
### Списи. List

 * однородны
    ** List[String] не может содержать элементы Int
 * ковариантны
    ** если T подтип S, то и List[T] подтип List[S]
    
    
    
---
### List. Создание
```scala 
val list1 = List(1,2,3)

val list2 = List.range(1,5)

val list2 = List.fill('lol')(5)

val list2 = List.tabulate
 
```


---
### List. Создание

```scala
val list = 3 :: 2 :: 1 :: Nil
```
```shell script

```


---
### List. Шаблоны
```scala
val List(a, b, c) = List(1, 2, 3)
val a :: b :: c = List(1, 2, 3)
```


---
### Методы. head, tail, isEmpty
```scala
head

tail

isEmpty

```

---
### List. много других методов
 Scala предоставляет множество методов для работы с коллекциями


---
### List. методы высшего порядка
 Методы, которе не принимают никаких параметоров

---
### map, flatMap, foreach



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
### sortWith, ~~sorted~~ 


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
### не всё умеет Sorted*

```scala
case class Cat (name: String, age: Int)
val s = collection.SortedSet(Cat("Мурзик", 2), Cat("Murka", 1))
//  error: No implicit Ordering defined for Person.
```

---
### *sorted по максимому

```scala
case class Cat (name: String, age: String) extends Ordered [Cat] {
    def compare (that: Cat): Int = {
        if (this.name == that.name)
            0
        else if (this.name > that.name)
            1
        else 
           −1
    }
}
```

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
