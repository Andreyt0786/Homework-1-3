fun main() {
    val price = 1001
    val firstDiscount = 1000
    val secondDiscount = 10_000
    val constBuyer = true
    var result = 0

    if (price < firstDiscount) {
        result = price
    } else if (price > firstDiscount && price < secondDiscount) {
        result = price - 100
    } else  {
        result = price - price * 5 / 100
    }

    if (constBuyer) {
        result = result - result * 1 / 100
    }

    println("Итоговая сумма = $result")

}
