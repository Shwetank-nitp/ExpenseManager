package shrai.ee.expensemanager

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize expenses ArrayList and add Expenses objects
        val expenses = ArrayList<Expenses>()
        val item = arrayListOf(
            "Electricity bill",
            "Rent",
            "Car EMI",
            "Health Insurance",
            "Tax Filling",
            "Grosses",
            "Educations",
            "Medical",
        )
        val price = arrayListOf(
            1266.76f,
            20000.00f,
            5000.00f,
            500.00f,
            9438.94f,
            5000.00f,
            12398.00f,
            5000.00f
        )
        val date = arrayListOf(
            "01/15/2023",
            "03/22/2023",
            "05/07/2023",
            "07/18/2023",
            "09/29/2023",
            "11/04/2023",
            "12/19/2023",
            "08/11/2023"
        )
        var sum : Float = 0f
        for (i in 0 until item.size) {
            val expense = Expenses(item[i], price[i], date[i])
            expenses.add(expense)
            sum += price[i]
        }

        // Set up RecyclerView and adapter
        val recyclerView: RecyclerView = findViewById(R.id.recycleView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = RecycleViewAdaptor(this, expenses)
        recyclerView.adapter = adapter
        val tPayable:TextView = findViewById(R.id.amountPay)
        tPayable.text = sum.toString()
    }
}
