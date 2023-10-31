package TP5

import kotlin.collections.Map
import kotlin.collections.Map as Map1

data class Module constructor(
    val initule:String ,
    val siRegional:Boolean,
    val termine:Boolean,
    val nbHeures:Int
)
//fun MutableList<Module>.sortBy(number: MutableList<Module>): Map<Int,String> {
//    var newMApf = mapOf<Int,String>()
//
//    return  newMApf.toTypedma()
//}

//fun Affichage(n:Module): Boolean = n




fun main() {
    var list = mutableListOf<Module>()
    var  M0=Module("Bases du dev Mobile ",false,false,130)
    var  M1=Module("Composant Android  ",true,false,180)
    var  M3=Module("Programmer en kotlin ",true,true,30)
    list.add(M0)
    list.add(M1)
    list.add(M3)
    println("fff")
    list.forEach{ println("Module $it") }
    println("fff")
    list.forEach{ println("Module : ${it.initule}") }
    // zip$
    var list0 = mutableListOf<String>()
    list.map {it }.forEach {
            list0.add(it .initule.toString())
    }
    println(list0)
    var moduleRegionaux:Boolean
    list.filter { it.siRegional  }.forEach {
             moduleRegionaux = it.siRegional
//          println( moduleRegionaux)
        }

    list.map { it }.forEach{
        println("Module :${ it.initule} en Reginaux ${it.siRegional}")
    }

     //m[ture] m[false]
//    var byGroup=  list.groupBy { it.siRegional}.forEach{
//        var m:Module
//
//    }
//    println(byGroup)
    //05
    var valueInitiale:Int=0
    val nbHeuresTotale = list.fold(0){nbTotale, module-> nbTotale + module.nbHeures}
    println(nbHeuresTotale)
    //06
    var  listTriee1 =list.sortWith(compareBy<Module> { it.nbHeures}.thenBy { it.initule })
    println(listTriee1)

}