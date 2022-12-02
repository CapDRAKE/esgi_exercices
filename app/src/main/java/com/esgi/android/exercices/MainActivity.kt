package com.esgi.android.exercices

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO Changer cette ligne en fonction des layouts
        //On utilise activity main pour le premier layout
        setContentView(R.layout.activity_main)

        //Layout 2 => Vue détail. Commenter la ligne pour voir le layout 1
        setContentView(R.layout.parking_receipt)
    }

    //public void ParkingReceipt(){

    //}
}