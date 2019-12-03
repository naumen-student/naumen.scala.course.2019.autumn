import java.time.ZonedDateTime

sealed trait LogLevel

object LogLevel {
    case object Info extends LogLevel
    case object Warn extends LogLevel
    final case class Error(exception: Exception) extends LogLevel
}

trait Logger {

    import Logger._

    // Создание логируемых сообщений
    private def info(dateTime: ZonedDateTime, msg: Message): LogItem  = s"${dateTime.toString} [info]: $msg"
    private def warn(dateTime: ZonedDateTime, msg: Message): LogItem  = s"${dateTime.toString} [warn]: $msg"
    private def error(dateTime: ZonedDateTime, exception: Exception, msg: Message): LogItem = s"${dateTime.toString} [ERROR]: $msg"

    private def currentZonedDateTime = ZonedDateTime.now()

    /**
      * Для разных level'ов вызывается разная функция создания логируемых сообщений
      */
    def log(dateTime: ZonedDateTime, level: LogLevel, msg: Message): LogItem = level match {
        //TODO
    }

    /**
      * Каррированная функция log
      */
    def curriedLog: ZonedDateTime => LogLevel => Message => LogItem = ???

    /**
      * Создаёт логируемое сообщения только для ошибок
      */
    def errorLog: ZonedDateTime => Exception => Message => LogItem = ???

    /**
      * Создаёт логируемые сообщения для данного момента времени
      */
    def logNow: LogLevel => Message => LogItem = ???

}

object Logger {
    type Message = String
    type LogItem = String
}
