import com.sun.jdi.connect.Connector.SelectedArgument
import java.lang.reflect.Constructor

//KOTLIN CLASS OBJECT
class Mobil {
    var Merk = ""
    var Model = ""
    var Tahun_Pembuatan = 0
}
fun Class_object() {
    var c1 = Mobil()
    c1.Merk = "Toyota"
    c1.Model = "Venturer"
    c1.Tahun_Pembuatan = 2020
    println("|Merk Mobil      = ${c1.Merk}   |")
    println("|Model kendaraan = ${c1.Model} |")
    println("|Tahun Pembuatan = ${c1.Tahun_Pembuatan}     |")


}
//-----------------------------------------------------------------------------------------
// KOTLIN CONSTRUCTOR
class Kendaraan(val Merk: String, val Model: String, val Tahun_Pembuatan: Int)

fun Constructor(){
    val c1 = Kendaraan("Ford","ranger", 2000)
    val c2 = Kendaraan("Honda", "crv", 2000)
    println(c1.Merk)

}
//-----------------------------------------------------------------------------------------
// KOTLIN CLASS FUNCTION
class Motor(var Merk: String, var Model:  String, var Mesin: Int) {
    fun Class_Functions() {
        println("semakin di depan !!!!!!!!")
    }
}
fun Finishing(){
    var C1 =  Motor  ("yamaha","vixion",150)
    println(C1.Merk+" "+C1.Model+" "+C1.Mesin+" ")
    C1.Class_Functions()
    }
//-----------------------------------------------------------------------------------------
//KOTLIN INHERITANCE
open class Mama{
    val Keluarga = "cicit"
}
class Anak_Mama : Mama(){
    fun Inhertance(){
        println(Keluarga)
    }
}
fun Object() {
    val Cucu_Mama = Anak_Mama()
    Cucu_Mama.Inhertance()
}
//-----------------------------------------------------------------------------------------
fun main(){
    println("-----Kotlin classes/object      ")
    (Class_object())
    println()
    println("-----Kotlin Constructor")
    (Constructor())
    println()
    println("-----Kotlin Class Function")
    (Finishing())
    println()
    println("-----Kotlin Inheritance")
    Object()
}


