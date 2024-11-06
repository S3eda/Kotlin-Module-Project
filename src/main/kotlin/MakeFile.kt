import java.util.Scanner

class MakeFile {
    var textScanner = Scanner(System.`in`)

    fun makeArchiv() {
        val archiveName = Variables.printComand.notNull()
        println("Файл <<$archiveName>> создан")
        Variables.archiveMap.put(archiveName, mutableMapOf())
    }

    fun makeNotes(){
        val noteName = Variables.printComand.notNull()
        println("Введите текст заметки")
        var text = ""
        while(true) {
            var preText = textScanner.nextLine()
            if (preText.trim() == "") {
                println("Заметка не может быть пустой")
            } else {
                text = preText
                break
            }
        }
        println("Заметка <<$noteName>> создана успешно")
        Variables.archiveMap[Variables.archiveList[Variables.element]]!!.put(noteName, text)
    }
}