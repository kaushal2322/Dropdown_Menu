package com.example.menu

import android.content.Context
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu

class custom {
    fun CustomMenu(context:Context,view: View){
        val pop = PopupMenu(context,view)
        pop.inflate(R.menu.menuu)
        pop.setOnMenuItemClickListener {
            when(it!!.itemId){
                R.id.ChangeName -> {Toast.makeText(context,"Change Your Name",Toast.LENGTH_LONG).show()
                true}
                R.id.Status -> {Toast.makeText(context,"Status",Toast.LENGTH_LONG).show()
                    true}
                R.id.Setting -> {Toast.makeText(context,"Setting ",Toast.LENGTH_LONG).show()
                    true}
                else -> false


            }
            
        }
        try {
            val popm = PopupMenu::class.java.getDeclaredField("popi")
            popm.isAccessible=true
            val popi=popm.get(pop)
            popi.javaClass
                .getDeclaredMethod("Error",Boolean::class.java)
                .invoke(popi,true)
        }
        catch (e:Exception){

        }finally {
            pop.show()
        }
    }
}