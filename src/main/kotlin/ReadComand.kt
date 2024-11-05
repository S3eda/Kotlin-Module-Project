import java.util.Scanner

class ReadComand{

    val makeFile = MakeFile()

    fun <F, S>choseComand(list: List<String>, someMap: MutableMap<F,S>, create: () -> Unit, keysList: MutableList<String>) {
        while (true) {
            println("Введите команду")
            Variables.printComand.printList(list)
            var comand = Variables.printComand.notString() - 1
            if (comand in 0..list.size - 1) {
                Variables.stop = 1
                var comandChoise = when {
                    list[0] == list[comand] -> create()
                    list[1] == list[comand] -> {
                        if (Variables.printComand.isEmpty(someMap)) {
                            println("Пока нет ни одного файла")
                        } else {
                            Variables.printComand.printMap(keysList, someMap)
                            choseElement(someMap)
                            break
                        }
                    }

                    list[2] == list[comand] -> {
                        Variables.stop = 0
                        break
                    }

                    else -> return
                }
            } else {
                println("Команды с таким номером нет")
            }
        }
    }

    fun <F,S>choseElement(map: MutableMap<F, S>){
        while(true) {
            Variables.element = Variables.printComand.notString() - 1
            if (Variables.element in 0..map.size - 1) {
                break
            } else {
                println("Команды с таким номером нет")
            }
        }
        return
    }
}
