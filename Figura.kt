

fun main()
{
    var lista_figuras = ArrayList<Figura>()
    var cuadro = Cuadrado()
    var circulo = Circulo()
    var triangulo = Triangulo()
    lista_figuras.add(cuadro)
    lista_figuras.add(circulo)
    lista_figuras.add(triangulo)

    for(fig in lista_figuras)
    {
        fig.Dibujar()
    }
}