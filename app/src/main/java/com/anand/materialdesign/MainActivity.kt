package com.anand.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btmSheet = BottomSheetBehavior.from(bottomSheet)
        btmSheet.isHideable = true
        btmSheet.state = BottomSheetBehavior.STATE_HIDDEN

        var name = "gaurav bo"

        btn.setOnClickListener {

            if (btmSheet.state == BottomSheetBehavior.STATE_EXPANDED) {
                btmSheet.state = BottomSheetBehavior.STATE_HIDDEN
            } else {
                btmSheet.state = BottomSheetBehavior.STATE_EXPANDED
            }

//            MaterialAlertDialogBuilder(this)
//                .setCancelable(false)
//                .setTitle("Warning")
//                .setMessage("Are you sure you want to close the app?")
//                .setPositiveButton("Yes", { dialog, which ->
//                    Toast.makeText(this, "You are quiting", Toast.LENGTH_SHORT).show()
//                })
//                .setNegativeButton("No", null)
//                .show()

        }

        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            Log.e("MAinActoity", "Running")
            Toast.makeText(this,"its checked -> $isChecked",Toast.LENGTH_SHORT).show()
        }





    }
}
