fun main(){
    student()
    word()
    name()
    number()
    favour("Miracle")
    favour("favour")
    text()
}
fun student(){
    val nam = "Miracle"
    val year = 2010
    val school= "akirachix"
    val country ="Uganda"
    println("my name is $nam,i was born in $year,i study from $school and am from $country")

}
fun word(){
    var text = "my name is Miracle, i study from akirachix "
    println(text.replace("akirachix","giovan"))
}
fun name(){
    var name = "Miracle"
    println(name.length)
}
fun number(){
    var weight = 50
    println("My weight is "+ weight.toString())
}
fun favour(name:String) {
    if(name == "Miracle") {
        println("That is my sister")

    }
    else{
        println("I don't know her other sister")

    }
}
fun text(){
    var x="slay queen"
    println(x.toUpperCase())
    println(x.capitalize())

}