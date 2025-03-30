import java.util.zip.Deflater

object SubnetCalculator {
  // Function to calculate usable IP addresses from a CIDR
  def calculateUsableIPs(cidr: Int): Int = {
    // Set totalIPs as an immutable val and use math.pow to calculate 2^(32 - host bits)
    val totalIPs = math.pow(2, 32 - cidr).toInt
    // Subtract network and broadcast addresses
    val usableIPs = totalIPs - 2
    usableIPs
  }

  def main(args: Array[String]): Unit = {
    var keepRunning = true
    var checkedSubnets = 0

    println("Welcome to Subnet Calculator! Enter a CIDR value (0-32) or 'exit' to quit.")
      
    while (keepRunning) {
      println("Enter CIDR value (e.g. 24) or 'exit': ")
      val input = scala.io.StdIn.readLine()
      if (input.toLowerCase == "exit") {
        keepRunning = false
      } else {
        val subnetCIDR = input.toInt
        // Calculate usable IPs
        val usable = calculateUsableIPs(subnetCIDR)
        println(s" Subnet /$subnetCIDR has $usable usable IP addresses")
        // Update checkedSubnets counter
        checkedSubnets += 1
        println(s"Checked $checkedSubnets subnet(s) so far")
      }
    }
    println("Thanks for using Subnet Calculator! Goodbye.")
  }
}