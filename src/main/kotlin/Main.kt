fun main() {

    println ("Digite o preço de um produto: ")
   val valor = readLine()!!.toFloat()

    println ("Qual a porcentagem do desconto que você vai receber se você comprar o produto à vista: ")
   val desconto = readLine()!!.toFloat()

    println ("Qual a porcentagem do acréscimo que você vai receber se você comprar o produto à prazo: ")
    val acrescimo = readLine()!!.toFloat()

    println("Em quantas vezes você vai parcelar o produto se for comprar à prazo: ")
    val parcela = readLine()!!.toInt()

    val vista:Float = (valor - (valor * desconto / 100))

    val prazo = (valor + (valor * acrescimo / 100))

    val total = (prazo / parcela)

   /* print("Se o produto custa ")
    print("%.2f".format(valor))
    print(" com o desconto de compra à vista, o produto vai custar ")
    println("%.2f".format(vista))
    print("E com o acréscimo de compra à prazo, o produto vai custar ")
    println("%.2f".format(prazo))
    print ("Se você comprar o produto em $parcela vezes, cada parcela vai custar ")
    println("%.2f".format(total)) */

 println("Se o produto custa %.2f com o desconto de compra à vista, o produto vai custar %.2f".format(valor, vista))
 print("E com o acréscimo de compra à prazo, o produto vai custar %.2f\n".format(prazo))
 println("Se você comprar o produto em $parcela vezes, cada parcela vai custar %.2f".format(total))


}