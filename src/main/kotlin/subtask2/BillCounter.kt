package subtask2

class BillCounter {

    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val annBill = (bill.sum() - bill[k])/2
        return if (annBill == b) "Bon Appetit" else (b - annBill).toString()
    }
}
