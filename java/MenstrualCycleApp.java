import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MenstrualCycleApp {

public static String menstrualCycle(String lastPeriodInput, int cycleLength, int numberOfCycles) {
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
LocalDate lastPeriodDate = LocalDate.parse(lastPeriodInput, formatter);

int minimumCycleLength = Math.max(cycleLength, 25);

StringBuilder result = new StringBuilder();
result.append("Upcoming Menstrual Cycles");

int index = 1; 

for (; index <= numberOfCycles; index++) {
LocalDate nextCycleDate = lastPeriodDate.plusDays(minimumCycleLength * index);
result.append(" My Cycle ").append(": ").append(nextCycleDate.format(formatter)).append(", ");
	}
return result.toString();
	}

}
