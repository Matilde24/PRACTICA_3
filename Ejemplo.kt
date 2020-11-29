open class personas{
    open fun recorrer()
    {
        println("Soy una persona")
    }
}
class Matilda:personas(){
    override fun recorrer(){
        println("Soy Matilda")
    }
}
class Alejandra:personas(){
    override fun recorrer(){
        println("Soy Alejandra")
    }
}
class Francis:personas(){
    override fun recorrer(){
        println("Soy Francis")
    }
}
fun main(){
    var lista_personas= ArrayList<personas>()
    var Matilda= Matilda()
    var Alejandra= Alejandra()
    var Francis= Francis()
    lista_personas.add(Matilda)
    lista_personas.add(Alejandra)
    lista_personas.add(Francis)
    for(per in lista_personas)
    {
            per.recorrer()
    }

}