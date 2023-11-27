package ru.netology

fun main() {

    val buy = 12000
    val amountOfDiscount = 0.05
    val bonus = 0.01
    val regularCustomer = true
    //val regularCustomer = false

    var sum = 0.0

    if (buy <= 1000) {
        if (regularCustomer) {
            sum = buy - (buy * 0.01)
            println("Сумма к оплате с учетом скидки постоянного клиента 1%,составляет: $sum")
        } else {
            println("Скидка не предоставляется!")
        }
    } else if ((buy >= 1001) && (buy <= 10_000)) {
        if (regularCustomer) {
            sum = (buy - 100).toDouble()
            val result = sum - (sum * 0.01)
            println("Сумма к оплате с учетом скидки 5% и скидки постоянного покупателя 1% составляет: $result")
        } else {
            sum = (buy - 100).toDouble()
            println("Сумма к оплате с учетом скидки 5% составляет: $sum")
        }

    } else if (buy > 10_001) {
        if (regularCustomer) {
            sum = buy - (buy * amountOfDiscount)
            val result = sum - (sum * 0.01)
            println("Сумма к оплате с учетом скидки 5% и скидки постоянного покупателя 1% составляет: $result")

        } else {
            sum = buy - (buy * amountOfDiscount)
            println("Сумма к оплате с учетом скидки 5% составляет: $sum")
        }
    }
}