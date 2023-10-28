import org.junit.Test
import org.junit.Assert.*

class MainKtTest {

    @Test
    fun getMoneyComissionDefault() {
        val moneyTransfer = 5000f

        val comission = getMoneyComission(typeCard = "Vk pay", previousСash = 0f, moneyTransfer)

        assertEquals(0f, comission)
    }

    @Test
    fun getMoneyComissionVisa() {
        val moneyTransfer = 5000f
        val previousСash = 74000f
        val typeCard = "Visa"

        val comission = getMoneyComission(typeCard, previousСash, moneyTransfer)

        assertEquals(37.5f, comission)
    }

    @Test
    fun getMoneyComissionMastercadNoComission() {
        val moneyTransfer = 5000f
        val previousСash = 70000f
        val typeCard = "Mastercard"

        val comission = getMoneyComission(typeCard, previousСash, moneyTransfer)

        assertEquals(0.0f, comission)
    }

    @Test
    fun getMoneyComissionMastercadWithComission() {
        val moneyTransfer = 5000f
        val previousСash = 78000f
        val typeCard = "Mastercard"

        val comission = getMoneyComission(typeCard, previousСash, moneyTransfer)

        assertEquals(50f, comission)
    }

    @Test
    fun getMoneyComissionVkPay() {
        val moneyTransfer = 5000f
        val previousСash = 30000f
        val typeCard = "Vk pay"

        val comission = getMoneyComission(typeCard, previousСash, moneyTransfer)

        assertEquals(0.0f, comission)
    }

    @Test
    fun getMoneyComissionVisaLimit() {
        val moneyTransfer = 5000f
        val previousСash = 740000f
        val typeCard = "Visa"

        val comission = getMoneyComission(typeCard, previousСash, moneyTransfer)

        assertEquals(-1f, comission)
    }

    @Test
    fun getMoneyComissionMastercadLimit() {
        val moneyTransfer = 155000f
        val previousСash = 70000f
        val typeCard = "Mastercard"

        val comission = getMoneyComission(typeCard, previousСash, moneyTransfer)

        assertEquals(-1f, comission)
    }

    @Test
    fun getMoneyComissionVkPayLimit() {
        val moneyTransfer = 25000f
        val previousСash = 30000f
        val typeCard = "Vk pay"

        val comission = getMoneyComission(typeCard, previousСash, moneyTransfer)

        assertEquals(-1f, comission)
    }

    @Test
    fun getMoneyComissionMaestroNoComission() {
        val moneyTransfer = 5000f
        val previousСash = 70000f
        val typeCard = "Maestro"

        val comission = getMoneyComission(typeCard, previousСash, moneyTransfer)

        assertEquals(0.0f, comission)
    }

    @Test
    fun getMoneyComissionMaestroWithComission() {
        val moneyTransfer = 5000f
        val previousСash = 78000f
        val typeCard = "Maestro"

        val comission = getMoneyComission(typeCard, previousСash, moneyTransfer)

        assertEquals(50f, comission)
    }

    @Test
    fun getMoneyComissionMir() {
        val moneyTransfer = 4000f
        val previousСash = 74000f
        val typeCard = "Мир"

        val comission = getMoneyComission(typeCard, previousСash, moneyTransfer)

        assertEquals(35f, comission)
    }

    @Test
    fun getMoneyComissionMaestroLimit() {
        val moneyTransfer = 15000f
        val previousСash = 780000f
        val typeCard = "Maestro"

        val comission = getMoneyComission(typeCard, previousСash, moneyTransfer)

        assertEquals(-1f, comission)
    }

    @Test
    fun getMoneyComissionMirLimit() {
        val moneyTransfer = 185000f
        val previousСash = 740000f
        val typeCard = "Мир"

        val comission = getMoneyComission(typeCard, previousСash, moneyTransfer)

        assertEquals(-1f, comission)
    }
}