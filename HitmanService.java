

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HitmanService {
    public Optional<Hitman> getHitman(List<Hitman> batsmen, String HitmanName, String countryCode) {

        if (batsmen == null || countryCode == null || HitmanName == null || batsmen.isEmpty()) {
            return Optional.empty();
        }
        final long count = batsmen.stream().filter(Hitman -> Hitman.getCountry().getCountryCode().equalsIgnoreCase(countryCode)).count();

        if (count == 0) {
            throw new CountryNotFoundException();
        }
        return batsmen.stream().filter(Hitman -> Hitman.getCountry().getCountryCode().equalsIgnoreCase(countryCode))
                .filter(Hitman -> Hitman.getName().equalsIgnoreCase(HitmanName))
                .findFirst();
    }

    public String getHitmanNamesForCountry(List<Hitman> batsmen, String countryCode) {
        if (batsmen == null || countryCode == null || batsmen.isEmpty()) {
            return null;
        }
        return batsmen.stream()
                .filter(Hitman -> Hitman.getCountry().getCountryCode().equalsIgnoreCase(countryCode))
                .map(Hitman::getName).sorted().collect(Collectors.joining(",", "[", "]"));
    }

    public Map<String, Integer> getPlayerNameWithTotalRuns(List<Hitman> batsmen) {
        if (batsmen == null || batsmen.isEmpty()) {
            return Collections.emptyMap();
        }
        return batsmen.stream()
                .filter(Hitman -> Hitman.getMatchesPlayed() > 50)
                .collect(Collectors.toMap(Hitman::getName, Hitman::getTotalRuns));
    }

    public Integer getHighestRunsScoredByHitman(List<Hitman> batsmen, String countryName) {
        if (batsmen == null || countryName == null || batsmen.isEmpty()) {
            return 0;
        }
        final Optional<Integer> highestScore = batsmen.stream()
                .filter(Hitman -> Hitman.getCountry().getName().equalsIgnoreCase(countryName))
                .map(Hitman::getHighestScore)
                .max(Comparator.comparingInt(Integer::valueOf));
        return highestScore.orElse(0);
    }

    public Optional <List<String>> getPLayerNamesByCountry (List <Hitman> batsmen,String countryName){
        if (batsmen == null || countryName == null || batsmen.isEmpty()){
            return Optional.empty();
        }
        final LinkedList<String> HitmanNames= batsmen.stream()
                .filter(Hitman -> Hitman.getCountry().getName().equalsIgnoreCase(countryName))
                .filter(Hitman ->Hitman.getTotalRuns()>5000)
                .map(Hitman::getName)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toCollection(LinkedList::new));
        if (!HitmanNames.isEmpty()) {
            return Optional.of(HitmanNames);
        } else {
            return Optional.empty();
        }
        }
}
