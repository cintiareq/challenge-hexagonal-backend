package io.devpass.creditcard.domain.objects

import java.time.LocalDateTime

data class CreditCardOperation(
    var id: String,
    var creditCard: String,
    var type: String,
    var value: Double,
    var description: String,
    var month: Int,
    var year: Int,
    var createdAt: LocalDateTime = LocalDateTime.now(),
)
