
import java.lang.reflect.MalformedParametersException

fun main() {
    println(name("Mwene","Mueni"))
    age()
    patientGender()
    var x=residence("machakos")//capitalizing the county
    println(x.capitalize())
    var findPatient=patientWard("General","WingB",17,2)
    println(findPatient.wardType)
    medication()
    bill()

}
fun name(firstName:String,surname:String):String{//patient's name
    return "I am $firstName $surname.Medical attention is my right"

}
fun age(){//patient's age
    var ageGroup= arrayOf("Below 18","18-28","29-39","40-50","50-60","Over 60")
    var patientAge=ageGroup[0]
    println(patientAge)
}
fun patientGender(){ //patient's gender
    var gender=arrayOf("Male","Female","Other")
    println(gender[1].toUpperCase())

}
fun residence(home:String):String{//where the patient lives
    return "$home County"

}
class patientWard(var wardType:String,var location:String,var doorNumber:Int,var bedNumber:Int){//how to trace the patient in the hospital
fun doctorsRecommendation(){
    println("Admitted")//states that the patient is admitted
}
}
fun medication(){
    var medication="Morphine"//patients initial medication
    var finalMedication=medication.replace("Morphine","Piriton")//patient's present medication
    println(finalMedication)
}
fun bill(){//patient's bill and if he/she was able to settle the bill
    val hospitalBill=43000
    var NHIF=31000
    var cash=12600
    var total=NHIF+cash
    if (total>=hospitalBill){//if the patient was discharged or detained depending on the settlement of the bill
        println("Discharge")
    }
    else{
        println("Detain")
    }
}









