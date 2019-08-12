package data

import java.util.*

data class People(val name: String,
                  val surname: String,
                  val birthday: Date,
                  val sex: Sex,
                  var money: Double,
                  var address: String)