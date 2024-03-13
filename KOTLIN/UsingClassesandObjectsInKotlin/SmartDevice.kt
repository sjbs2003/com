
open class SmartDevice(val name: String, val category: String) {

        var deviceStatus = "online"
        open val deviceType = "unknown"
        open fun turnOn() { deviceStatus ="on" }
        open fun turnOff() { deviceStatus = "off" }
}
class SmartTvDevice(deviceName: String, deviceCategory: String):
        SmartDevice(name = deviceName, category = deviceCategory){
                override val deviceType = "Smart Tv"
                var speakerVolume = 2
                        set(value) {
                                if (value in 0..100){
                                        field = value
                                }
                        }
                var channelNumber = 1
                        set(value) {
                                if (value in 0..200){
                                        field = value
                                }
                        }

                fun increaseSpeakerVolume(){
                        speakerVolume++
                        println("Speaker Volume has been increased to $speakerVolume")
                }
                fun nextChannel(){
                        channelNumber++
                        println("Channel has been changed to $channelNumber")
                }

                override fun turnOn(){
                        super.turnOn()
                        println("$name is turned on. Speaker volume is set to $speakerVolume and channel is set to $channelNumber")
                }

                override fun turnOff() {
                        super.turnOff()
                        println("$name is turned off")
                }
        }
 class SmartLightDevice(deviceName: String, deviceCategory: String) :
         SmartDevice(name = deviceName, category = deviceCategory){

                 override val deviceType = "Smart light"
                 var brightnessLevel = 0
                         set(value) {
                                 if (value in 0..100){
                                         field = value
                                 }
                         }
                fun increaseBrightness(){
                        brightnessLevel++
                        println("Brightness has been increased to $brightnessLevel")
                }

                override fun turnOn(){
                        super.turnOn()
                        brightnessLevel = 2
                        println("$name turned on. the brightness level is $brightnessLevel.")
                }

                override fun turnOff(){
                        super.turnOff()
                        brightnessLevel = 0
                        println("Smart light turned off")
                }
         }

class SmartHome(
        val smartTvDevice: SmartTvDevice,
        val smartLightDevice: SmartLightDevice
){
        fun turnOnTv(){
                smartTvDevice.turnOn()
        }
        fun turnOffTv(){
                smartTvDevice.turnOff()
        }
        fun increaseTvVolume(){
                smartTvDevice.increaseSpeakerVolume()
        }
        fun changeTvChannel(){
                smartTvDevice.nextChannel()
        }
        fun turnOnLight(){
                smartLightDevice.turnOn()
        }
        fun turnOffLight(){
                smartLightDevice.turnOff()
        }

        fun turnOffAllDevices(){
                turnOffLight()
                turnOffTv()
        }
}

fun main(){
        var smartDevice: SmartTvDevice = SmartTvDevice("Android Tv", "Entertainment")
        smartDevice.turnOn()

        smartDevice = SmartTvDevice("light","Utility")
        smartDevice.turnOn()
}