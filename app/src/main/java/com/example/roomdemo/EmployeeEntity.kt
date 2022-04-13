package com.example.roomdemo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="employee_table")
data class EmployeeEntity(
    @PrimaryKey(autoGenerate = true)
    val id:Int=0,
    val name:String="",
    val email:String=""
)
