import java.time.ZonedDateTime

sealed trait LogLevel

object LogLevel {
    case object Info extends LogLevel
    case object Warn extends LogLevel
    final case class Error(exception: Exception) extends LogLevel
}

trait Logger {

    import Logger._

    private def info(dateTime: ZonedDateTime, msg: Message): LogItem  = s"${dateTime.toString} [info]: $msg"
    private def warn(dateTime: ZonedDateTime, msg: Message): LogItem  = s"${dateTime.toString} [warn]: $msg"
    private def error(dateTime: ZonedDateTime, exception: Exception, msg: Message): LogItem = s"${dateTime.toString} [ERROR]: $msg"


    def log(dateTime: ZonedDateTime, level: LogLevel, msg: Message): LogItem = ???

    def fixedTimeLog: (LogLevel, Message) => LogItem = ???

}

object Logger {
    type Message = String
    type LogItem = String
}
