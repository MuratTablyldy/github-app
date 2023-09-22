package kz.tabyldy.coreapi.exceptions

class HttpException(
    override val message:String?,
    val code:Int?
    ,exception:Exception
):Exception(exception)