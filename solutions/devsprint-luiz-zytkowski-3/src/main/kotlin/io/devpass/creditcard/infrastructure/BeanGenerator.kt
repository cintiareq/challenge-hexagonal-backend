package io.devpass.creditcard.infrastructure

import io.devpass.creditcard.data.CreditCardDAO
import io.devpass.creditcard.data.CreditCardOperationDAO
import io.devpass.creditcard.data.repositories.CreditCardOperationRepository
import io.devpass.creditcard.data.repositories.CreditCardRepository
import io.devpass.creditcard.dataaccess.ICreditCardDAO
import io.devpass.creditcard.dataaccess.ICreditCardOperationDAO
import io.devpass.creditcard.domain.CreditCardService
import io.devpass.creditcard.domainaccess.ICreditCardServiceAdapter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BeanGenerator {

    @Bean
    fun creditCardDAO(): ICreditCardDAO {
        return CreditCardDAO()
    }

    fun creditCardOperationDAO(creditCardOperationRepository: CreditCardOperationRepository): ICreditCardOperationDAO{
        return CreditCardOperationDAO(creditCardOperationRepository)
    }

    @Bean
    fun creditCardServiceAdapter(
        creditCardRepository: ICreditCardDAO,
    ): ICreditCardServiceAdapter {
        return CreditCardService(creditCardRepository)
    }
}
