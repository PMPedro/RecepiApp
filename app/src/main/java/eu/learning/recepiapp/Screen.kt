package eu.learning.recepiapp

sealed class Screen (val route:String){
    object RecepiScreen: Screen("recepiscreen")
    object DetailScreen: Screen("detailscreen")

}