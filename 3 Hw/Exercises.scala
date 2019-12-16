import scala.collection._

object Exercises {

  def prettyBooleanFormatter1(x: Any): String = {
    if (x.getClass.getTypeName == "java.lang.Boolean")
      if(x == true) "pravda" else "lozh"
    else x.toString();
  }

  def prettyBooleanFormatter2(x: Any): String = {
    x match {
      case true => "pravda";
      case false => "lozh";
      case _ => x.toString();
    }
  }

  def prettyBooleanFormatter3(x: Any): String = {
    if(!x.isInstanceOf[Boolean]) x.toString()
    else if (x == true) "pravda" else "lozh";
  }



  def max1(xs: Seq[Int]): Int = {
    if(xs.length==0) throw new Exception("there's no elements")
    else xs.max
  };

  def max2(xs: Seq[Int]): Seq[Int] = {
    if(xs.length==0) Seq[Int]() else Seq[Int](xs.max);
  }

  def max3(xs: Seq[Int]): Option[Int] =
    if (xs.length==0) None else Some(xs.max);




  def sumIntegers[CollectionType <: Iterable[Int]](xs: CollectionType): Int = xs.sum

  def sum1(x: Int, y: Int): Int =
    sumIntegers(Seq[Int](x,y));

  def sum2(x: Int, y:Int): Int= {
    sumIntegers(List[Int](x,y));
  };

  def sum3(x: Int, y: Int): Int= {

    case class Capped1[A] (x:A, y:A)
      extends Iterable[A] {

      var xIsAvailable: Boolean = true;
      var yIsAvailable: Boolean = true;


      def iterator: Iterator[A] = new AbstractIterator[A] {

        def hasNext = xIsAvailable || yIsAvailable;
        def next(): A = {
          if(xIsAvailable){
            xIsAvailable = false;
            x;
          }

          else{
            yIsAvailable = false;
            y;
          };

        }
      }
    }


    sumIntegers(Capped1[Int](x,y))
  }
}




