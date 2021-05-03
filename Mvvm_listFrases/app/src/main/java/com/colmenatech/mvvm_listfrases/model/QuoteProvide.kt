package com.colmenatech.mvvm_listfrases.model

class QuoteProvide {

    companion object{

        fun random(): QuoteModel{
            val position = (0..10).random()
            return quotes[position]
        }

        private val quotes = listOf(
            QuoteModel(
                quote = "Un lenguaje de programación es para pensar en programas, no para expresar programas que ya has pensado. Debería ser un lápiz, no un bolígrafo",
                author = "Paul Graham"
            ),
            QuoteModel(
                quote = "La depuración es el doble de difícil que escribir el código en primer lugar. Por lo tanto, si escribes el código tan inteligentemente como sea posible, no eres, por definición, lo suficientemente inteligente para depurarlo",
                author = " Rajanand"
            ),
            QuoteModel(
                quote = "Medir el programa de programación por líneas de código es como medir el programa de construcción de aviones por peso",
                author = "Bill Gates"
            ),
            QuoteModel(
                quote = "El mayor enemigo del conocimiento no es la ignorancia, es la ilusión del conocimiento.",
                author = "Stephen Hawking"
            ),
            QuoteModel(
                quote = "A la gente no le importa lo que dices, le importa lo que construyes",
                author = "Mark Zuckerberg"
            ),
            QuoteModel(
                quote = "Tenemos que dejar de optimizar para los programadores y empezar a optimizar para los usuarios.",
                author = "Jeff Atwood"
            ),
            QuoteModel(
                quote = "Los malos programadores se preocupan por el código. Los buenos programadores se preocupan por las estructuras de datos y sus relaciones",
                author = "Linus Torvalds"
            ),
            QuoteModel(
                quote = "La mayoría de los buenos programadores programan no porque esperen que les paguen o que el público les adore, sino porque es divertido programar",
                author = "Rajanand"
            ),
            QuoteModel(
                quote = "Las mentes pequeñas se preocupan por lo extraordinario, las grandes por lo ordinario.",
                author = "Blaise Pascal"
            ),
            QuoteModel(
                quote = "La vida cotidiana es como la programación, supongo. Si amas algo puedes ponerle belleza. ",
                author = "Donald Knuth"
            ),
            QuoteModel(
                quote = "Todos los grandes desarrolladores que conoces llegaron allí resolviendo problemas que no estaban cualificados para resolver hasta que lo hicieron.",
                author = "Patrick McKenzie"
            )
        )
    }
}