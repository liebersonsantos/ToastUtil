package br.com.liebersonsantos.toast_library_example

import android.content.Context
import android.widget.Toast

object ToasterMessage {
    fun showMessage(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}