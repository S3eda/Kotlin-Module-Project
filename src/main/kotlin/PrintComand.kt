import java.util.Scanner

class PrintComand {

    fun printList(list: List<String>) {
        var i = 1
        for (name in list) {
            println("$i - $name")
            i = i + 1
        }
    }

    fun <F, S>printMap (someList: MutableList<String>, archiveMap: MutableMap<F, S>){
        println("Список доступных файлов, для выбора укажите номер:")
        var i = 1
        for(key in archiveMap.keys){
            someList.add(key.toString())
            println("$i $key")
            i = i + 1
        }
    }

    fun notNull():String{
        while (true) {
            println("Введите название файла")
            var preName = Scanner(System.`in`).nextLine()
            if (preName.trim() != null){
                return preName
                break
            }
        }
    }

    fun notString():Int{
        var comand = -1
        while(true) {
            val countScanner = Scanner(System.`in`)
            if (countScanner.hasNextInt()) {
                comand = countScanner.nextInt()
                break
            } else {
                println("Введите число")
                countScanner.next()
            }
        }
        return comand
    }

    fun <F,S>isEmpty(map: MutableMap<F, S>?):Boolean{
        if(map!!.size == 0){
            return true
        } else {
            return false
        }
    }
}