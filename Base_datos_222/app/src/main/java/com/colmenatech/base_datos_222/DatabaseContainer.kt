package com.colmenatech.base_datos_222

import android.provider.BaseColumns

object DatabaseContainer {
    class PersonTable: BaseColumns{
        companion object{
            val TABLE_NAME = "Person_table"
            val NAME_COLUMN = "NAME"
            val LASTNAME_COLUMN = "LASTNAME"
            val HEIGHT_COLUMN = "HEIGHT"
            val WEIGHT_COLUMN = "WEIGHT"
        }
    }
}