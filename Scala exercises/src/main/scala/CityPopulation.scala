object CityPopulation extends App{
    /**
     * getCityYear
     * @param p0 - original City population
     * @param percentage - yearly growth rate in percentages
     * @param delta - how many people immigrate(+)/emigrate to the city each year
     * @param targetPopulation - population we want to reach
     * @return number of years to reach , -1 if not reachable
     */

    def getCityYear(p0: Int, percentage: Double, delta: Int, targetPopulation: Int ):Int = {

      def populationNow(p0: Int, percentage: Double, delta: Int): Double = p0 + p0 * percentage / 100 + delta

      var yearCounter = -1
      var currentPopulation = p0.toDouble

      if (populationNow(p0, percentage, delta) > p0) {
        yearCounter = 0
      while (currentPopulation < targetPopulation) {
        currentPopulation = populationNow(currentPopulation.toInt, percentage, delta)
        yearCounter += 1
      }}
      yearCounter
    }
        // tests:
  println(getCityYear(1000,2,50,1200)) // should print 3
  println(getCityYear(1000,2,-50,1200)) // should print -1
  println(getCityYear(1500000,2.5,10000,2000000)) // should print 10

}
