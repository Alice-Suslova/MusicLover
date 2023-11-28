package ru.netology

fun main() {

    val buy = 12000
    val amountOfDiscount = 0.05
    val middleDiscount = 100
    val bonus = 0.01
    val regularCustomer = true
    //val regularCustomer = false

    var sum = 0.0

    if (buy <= 1000) {
        sum = buy - (buy * bonus)
        if (regularCustomer) {
            println("Сумма к оплате с учетом скидки постоянного клиента 1%,составляет: $sum")
        } else {
            println("Скидка не предоставляется!")
        }
    } else if ((buy >= 1001) && (buy <= 10_000)) {
        sum = (buy - middleDiscount).toDouble()
        if (regularCustomer) {
            val result = sum - (sum * bonus)
            println("Сумма к оплате с учетом скидки 5% и скидки постоянного покупателя 1% составляет: $result")
        } else {
            println("Сумма к оплате с учетом скидки 5% составляет: $sum")
        }

    } else if (buy > 10_001) {
        sum = buy - (buy * amountOfDiscount)
        if (regularCustomer) {
            val result = sum - (sum * bonus)
            println("Сумма к оплате с учетом скидки 5% и скидки постоянного покупателя 1% составляет: $result")
        } else {
            println("Сумма к оплате с учетом скидки 5% составляет: $sum")
        }
    }
}