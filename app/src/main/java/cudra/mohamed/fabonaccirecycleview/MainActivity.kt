package cudra.mohamed.fabonaccirecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cudra.mohamed.fabonaccirecycleview.databinding.ActivityMainBinding
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fabonacci()
    }
    fun fabonacci (){
        var num1=0
        var num2=1

        var numbList= mutableListOf<Int>()
        for (num in 1..100){

            numbList.add(num1)
            var sum=num1+num2
            num1=num2
            num2=sum

        }
        var numberAdapter=NumberRecyclerViewAdapter(numbList)
        binding.rvNumbers.layoutManager = LinearLayoutManager(this)
        binding.rvNumbers.adapter = numberAdapter
    }
}