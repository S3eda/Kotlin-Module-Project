object Variables {
    var notesList: MutableList<String> = mutableListOf()
    var stop = 1
    var element = -1
    var archiveMap: MutableMap<String, MutableMap<String, String>> = mutableMapOf()
    var archiveList: MutableList<String> = mutableListOf()
    val printComand = PrintComand()
    val archiveComandList: List<String> = listOf("Создать архив", "Выбрать существующий архив", "Выход")
    val notesComandList: List<String> = listOf("Создать заметку", "Выбрать существующую заметку", "Назад")
}
