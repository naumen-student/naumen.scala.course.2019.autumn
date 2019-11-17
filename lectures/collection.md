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

val list1 = List(1,2,3)

val list2 = List.range(1,5)

val list2 = List.fill('lol')(5)

val list2 = List.tabulate
 
```


---
### List. Создание 2

```scala
val list = 3 :: 2 :: 1 :: Nil
```
```scala
val d = Nil
val c = 3 :: d
val b = 2 :: c
val a = 1 :: b
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
def bubbleSort(arr:Array[Int])={
var temp=0
for(i<- 1 until arr.length-1 ; j<- 1 until (arr.length-1-i)){
  if(arr(j-1)>arr(j)) {
    temp=arr(j-1)
    arr(j-1)=arr(j)
    arr(j)=temp 
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