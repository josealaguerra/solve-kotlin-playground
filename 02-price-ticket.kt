fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is  \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    
    if (age>=100 || age<=0){
      return -1    
    }    
    if (age<12){
      return 15
    }else if (age>=13 && age<=60){
      if(isMonday){
    	return 5
      }else{
        return 30
      }
    }else if (age>=61 && age<=100){
        return 20
    }
    return 0
}
