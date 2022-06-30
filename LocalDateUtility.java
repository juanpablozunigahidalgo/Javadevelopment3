
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
// LocalDate functions are applied along with streams.
// - Method should return a List of String containing the working days
//   for the next month given today's date.
// - Saturday and Sunday should be considered non working days
// - The date returned should be in format yyyy-MM-dd

public class LocalDateUtility {
    //   Method should return a List of String containing the working days
    //   for the next month given today's date.
    public List<String> getNextMonthWorkingDays (LocalDate today) {
        LocalDate firstOfNextMonth= today.with(TemporalAdjusters.firstDayOfNextMonth());
        LocalDate endOfNextMonth=today.plusMonths(1).withDayOfMonth(1).plusMonths(1).minusDays(1);
        long limit = ChronoUnit.DAYS.between(firstOfNextMonth,endOfNextMonth);
        return IntStream.iterate(0,i->i+1).limit(limit)
                .mapToObj(firstOfNextMonth::plusDays).filter(p->!p.getDayOfWeek().toString().equals("sunday"))
                .filter(p->!p.getDayOfWeek().toString().equals("Saturday"))
                .map(String::valueOf).collect(Collectors.toList());
    }


}
