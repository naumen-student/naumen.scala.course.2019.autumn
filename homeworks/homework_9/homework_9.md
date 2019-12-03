# Домашнее задание №9

## 1. BooleanAlgebra.scala
Реализовать исходные типы для логического типа-суммы BooleanAlgebra (аналоги True и False), базовые операции над логическим типом (and, or, not).
<br>Методы объекта BooleanAlgebra getTrue и getFalse нужны для проведения тестов. Они должны возвращать соответствующие экземпляры BooleanAlgebra.
* [ADT](https://nrinaudo.github.io/scala-best-practices/definitions/adt.html);
* [Pattern matching](https://docs.scala-lang.org/tour/pattern-matching.html);
* [PartialFunction](https://www.scala-lang.org/api/2.12.1/scala/PartialFunction.html).


## 2. DigitalRoot.scala
Digital root (далее корень) числа - рекурсивная сумма всех цыфр в числе. Т.е. корень числа с одним разрядом - само число, корень числа с N разрядов - корень суммы всех цифр числа.
<br>**Пример:**

  0) findRoot(99);
  1) 99 - два разряда => складываем цифры из всех разрядов;
  2) 9 + 9 = 18;
  3) findRoot(18);
  4) 18 - два разряда => складываем цифры из всех разрядов;
  5) 1 + 8 = 9;
  6) findRoot(9);
  7) 9 - один разряд => само число и есть корень.
* [Digital root](https://en.wikipedia.org/wiki/Digital_root);
* [Recursion](https://alvinalexander.com/scala/scala-recursion-examples-recursive-programming).

## 3. ListFilter.scala
Реализовать функцию фильтрации используя хвостовую рекурсию. 
<br>Для примера описана функция iterativeFilter, любой цикл можно переписать с использованием хвостовой рекурсии.

* [Tail recursion](https://alvinalexander.com/scala/fp-book/tail-recursive-algorithms);
* [List filter](https://alvinalexander.com/scala/scala-list-class-filter-method-function-examples).

## 4. ListFlatMap.scala
Используя комбинацию имеющихся функций (map и flatten) описать функцию flatMap.
* map - применяет заданную функцию ко всем элементам списка и возвращает список результатов применения;
* flatten - уменьшает уровень вложенности списка (был: список списков, стало: список - объединение всех списков);
* flatMap - применяет заданную функцию, которая возвращает список, ко всем элементам списка и возвращает объединение всех результатов применения функции;
* [flatten](https://alvinalexander.com/scala/how-to-flatten-list-lists-in-scala-with-flatten-method);
* [flatMap](https://www.brunton-spall.co.uk/post/2011/12/02/map-map-and-flatmap-in-scala/).

## 5. Logger.scala
Реализовать следующие функции:
1) `log(dateTime: ZonedDateTime, level: LogLevel, msg: Message): LogItem`;
2) `curriedLog: ZonedDateTime => LogLevel => Message => LogItem` с помощью функции из `log`;
3) `errorLog: ZonedDateTime => Exception => Message => LogItem` - частичное применение `curriedLog`;
4) `logNow`  - частичное применение `curriedLog`.
<br><br>
* [Currying | Partially apply](https://alvinalexander.com/scala/fp-book/partially-applied-functions-currying-in-scala)