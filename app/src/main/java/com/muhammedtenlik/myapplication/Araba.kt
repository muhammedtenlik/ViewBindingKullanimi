package com.muhammedtenlik.myapplication

/*
class Araba {
    var Model=""
    var Marka=""
    var ÜretimYıl=0


}*/
class Araba(var Model:String,var Marka:String,var ÜretimYıl:Int){
    fun testFonksiyonu(){
        println("test")
    }
    private var TransitMotor=1.9
    public var ClioMotor=1.6
    fun TransitMotorDegis():Double{
        return this.TransitMotor
    }
}
