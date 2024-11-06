fun main(args: Array<String>) {

    var readComand = ReadComand()

    while(true) {
        readComand.choseComand<String, MutableMap<String, String>>(
            Variables.archiveComandList,
            Variables.archiveMap,
            create = {readComand.makeFile.makeArchiv()},
            Variables.archiveList
        )
        if(Variables.stop == 0) {
            break
        }
        var archiveElement = Variables.element
        Variables.notesList.clear()
        while(true){
            readComand.choseComand<String, String>(
                Variables.notesComandList,
                Variables.archiveMap[Variables.archiveList[Variables.element]]!!,
                create = {readComand.makeFile.makeNotes()},
                Variables.notesList
            )
            if(Variables.stop == 0) {
                break
            }
            println(Variables.archiveMap[Variables.archiveList[archiveElement]]!![Variables.notesList[Variables.element]])
        }
    }
}