package barreras.mario.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalle_pelicula.*


class DetallePelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        val bundle=intent.extras
        var ns = 0;
        var id = -1;
        var title ="";


        if (bundle!=null){
            title = bundle.getString("titulo")!!

            ns = bundle.getInt("numberSeats");
            iv_pelicula_imagen.setImageResource(bundle.getInt("header"))
            tv_nombre_pelicula.setText(bundle.getString("nombre"))
            tv_pelicula_desc.setText(bundle.getString("sinopsis"))
            seatLeft.setText("$ns seats avaible")
            id=bundle.getInt("pos")
        }

        if (ns==0){
            buyTickets.isEnabled=false
         }else{
             buyTickets.setOnClickListener{
                 val intent: Intent = Intent(this, SeatSelection::class.java)
                 intent.putExtra("id",id)
                 intent.putExtra("name",title)

             }

        }
    }
}