import java.util.zip.Deflater
object SubnetCalculator {
   // Funtion to calculate usable IP addresses from a CIDR
   def calculateUsuabbleIPs(cidr: Int): Int = {
      // set totalIPs var as immutable val and use math.pow to calulate @^ -> 32 host bits
      val totalIPs = math.pow(2, 32 - cidr).toInt
      // subtracts network and broadcast addresses
      val useableIPs = totalIPs -2
      useableIPs
    }

    def main(args: Array[String]): Unit = {
      var keepRunning = true
      var checkedSubnets = 0

      println("Welcome to Subnet Calculator! Enter a CIDR value (0-32) or 'exit' to quit.")
        
      while (keepRunning) {
        println("Enter CICR value (e.g. 24) or 'exit': ")
        val input = scala.io.StdIn.readLine()
        if (input.toLowerCase == "exit") {
        keepRunning = false
        } else {
          val subnetCIDR = input.toInt
          // Using mutable var to simulayte state changes
          val useable = calculateUsuabbleIPs(subnetCIDR)
          println(s" Subnet /$subnetCIDR has $useable usable IP addresses")  
          //shows updates var checkedSubnets showing mutablitliyt with var types
          checkedSubnets = checkedSubnets +1
          println(s"Checkest $checkedSubnets subnets(s) so far")
        }
      }
    println("Thanks for using Subnet Calculator! Goodbye.")
  }
}