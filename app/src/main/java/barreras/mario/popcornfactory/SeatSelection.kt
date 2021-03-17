package barreras.mario.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView

class SeatSelection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seat_selection)

        val title: TextView = findViewById(R.id.titleSeats)
        var posMovie= -1

        val bundle= intent.extras

        if(bundle!=null){
            title.setText(bundle.getString("name"))
            posMovie= bundle.getInt("id")
        }


        val confirm: Button = findViewById(R.id.confirmar)

        confirm.setOnClickListener{


            //Toast.makeText


        }

        val row1: RadioGroup= findViewById(R.id.row1)
        val row2: RadioGroup= findViewById(R.id.row2)
        val row3: RadioGroup= findViewById(R.id.row3)
        val row4: RadioGroup= findViewById(R.id.row4)

        row1.setOnCheckedChangeListener{group, checkedID ->
            if (checkedID >-1){
                row2.clearCheck()
                row3.clearCheck()
                row4.clearCheck()

                row1.check(checkedID)
            }



        }



        row2.setOnCheckedChangeListener{group, checkedID ->
            if (checkedID >-1){
                row1.clearCheck()
                row3.clearCheck()
                row4.clearCheck()

                row2.check(checkedID)
            }



        }



        row3.setOnCheckedChangeListener{group, checkedID ->
            if (checkedID >-1){
                row2.clearCheck()
                row1.clearCheck()
                row4.clearCheck()

                row3.check(checkedID)
            }



        }


        row4.setOnCheckedChangeListener{group, checkedID ->
            if (checkedID >-1){
                row2.clearCheck()
                row3.clearCheck()
                row1.clearCheck()

                row4.check(checkedID)
            }



        }

    }
}