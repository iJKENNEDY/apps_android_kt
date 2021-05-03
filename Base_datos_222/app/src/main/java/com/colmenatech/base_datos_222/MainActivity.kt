    package com.colmenatech.base_datos_222

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.colmenatech.base_datos_222.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    lateinit var name_edt: EditText
    lateinit var namelast_edt: EditText
    lateinit var height: EditText
    lateinit var weight: EditText
    lateinit var button2 : Button
    lateinit var buttonRead: Button
    lateinit var text_read: TextView
    lateinit var btn_eliminar_id : Button
    lateinit var edtextId : EditText
    lateinit var btn_update: Button

    lateinit var databaseHelper: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        name_edt = mainBinding.edtNombre
        namelast_edt = mainBinding.edtLastnombre
        height = mainBinding.edtEdtHeight
        weight = mainBinding.edtWeight
        button2 = mainBinding.btnInsertar
        buttonRead = mainBinding.btnLista
        text_read = mainBinding.textLista
        edtextId = mainBinding.txtIdEliminar
        btn_eliminar_id = mainBinding.btnEliminar
        btn_update = mainBinding.btnModificar

        databaseHelper = DatabaseHelper(this)

        button2.setOnClickListener {
            insertFunction()
        }

        buttonRead.setOnClickListener {
            readListar()
        }

        btn_eliminar_id.setOnClickListener {
            deleteDataFunction()
        }

        btn_update.setOnClickListener {
            updateFunction()
        }

    }

    private fun updateFunction() {
        val strId = edtextId.text.toString()
        val strName = name_edt.text.toString()
        val strlastname = namelast_edt.text.toString()
        val strHeight = height.text.toString()
        val strWeight = weight.text.toString()

        val result: Boolean = databaseHelper.updateData(strId, strName, strlastname, strHeight, strWeight)
        when{
            result -> Toast.makeText(applicationContext, "data update successfully", Toast.LENGTH_SHORT).show()
            else -> Toast.makeText(applicationContext, "failed to delete data....", Toast.LENGTH_SHORT).show()
        }
    }

    private fun deleteDataFunction() {
        val strId = edtextId.text.toString()
        val result: Boolean = databaseHelper.deleteData(strId)

        when{
            result -> Toast.makeText(applicationContext, "data deleted successfully", Toast.LENGTH_SHORT).show()
            else -> Toast.makeText(applicationContext, "failed to delete data....", Toast.LENGTH_SHORT).show()
        }
    }

    private fun readListar() {
        val data = databaseHelper.readData()
        val stringBuffer = StringBuffer()

        if (data != null && data.count > 0){
            while (data.moveToNext()){
                stringBuffer.append("ID: ${data.getString(0)}\n")
                stringBuffer.append("Name: ${data.getString(1)}\n")
                stringBuffer.append("LastName: ${data.getString(2)}\n")
                stringBuffer.append("Height: ${data.getString(3)}\n")
                stringBuffer.append("Weight: ${data.getString(4)}\n")
            }
            text_read.text = stringBuffer.toString()
            Toast.makeText(applicationContext, "Data Retrieved...",Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(applicationContext, "No data....", Toast.LENGTH_SHORT).show()
        }
    }

    private fun insertFunction() {
        val strName = name_edt.text.toString()
        val strlast_name = namelast_edt.text.toString()
        val strHeight = height.text.toString()
        val strWeight = weight.text.toString()

        val result: Boolean = databaseHelper.insertData(strName,strlast_name, strHeight, strWeight)

        when{
            result -> Toast.makeText(applicationContext, "Data insert successfully", Toast.LENGTH_SHORT).show()
            else -> Toast.makeText(applicationContext, "Failed to insert data...", Toast.LENGTH_SHORT).show()
        }
    }
}