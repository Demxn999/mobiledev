import java.io.File

data class Message(var address: String?, var topic: String?, var body: String?, var closing: String?, var sender: String?) {
    init {
        address = address?.let {Br(it)}
        topic = topic?.let {Br(it)}
        body = body?.let {Br(it)}
        closing = closing?.let {Br(it)}
        sender = sender?.let {Br(it)}
    }
    companion object {
        private fun Br(letter: String): String {
            return letter.replace("\n", "<br>")
        }
    }
    fun toHTML(): String {
        return  "<style>" +
                "@import url('https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&display=swap');" +
                "body{font-family: 'Montserrat', sans-serif;}" +
                "td{padding: 10px;}" +
                "</style>" +
                "<table bordercolor=\"blue\" border=\"1px\" cellspacing\n=\"1px\">" +
                (sender?.let { "<tr><td bgcolor= \"lightblue\">Отправитель: </td><td bgcolor= \"#E0FFFF\">$it</td></tr> \n" }?: "") +
                (address?.let { "<tr><td bgcolor= \"lightblue\">Адрес отправителя: </td><td bgcolor= \"#E0FFFF\">$it</td></tr> \n" }?: "") +
                (topic?.let { "<tr><td bgcolor= \"lightblue\">Тема: </td><td bgcolor= \"#E0FFFF\">$it</td></tr> \n" }?: "") +
                (body?.let { "<tr><td bgcolor= \"lightblue\">Сообщение: </td><td bgcolor= \"#E0FFFF\"> $it" + (closing?.let {"<br><br>$it"}?:" ")   + "</td></tr> \n" }?: "") +
                "</table>"
    }
}

fun main() {
    val messages = arrayOf(
        Message("yandex.ru", "Продам слона",
            "Хочу большого индийского слона",
            "Илья, Директор Слонов \n\"ElephantWorld\"\n123456, г. Иркутск, Слоновья Гора, оф. 66",
            "Голобородов Илья Алексеевич"
        )
    )
    for (i in messages.indices){
        File("letter$i.html").writeText(messages[i].toHTML())
    }
}