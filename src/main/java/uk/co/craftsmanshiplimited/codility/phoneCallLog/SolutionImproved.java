package uk.co.craftsmanshiplimited.codility.phoneCallLog;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Henrik on 19/02/2017.
 */
public class SolutionImproved {
    public int solution(final String S) {
        if(S == null || S.isEmpty()) {
            return 0;
        }
        final String[] logLines = S.split(Character.toString((char)10));
        final Map<String, PhoneNumberCost> uniquePhoneNumbers = Arrays.stream(logLines)
                .map(logLine -> logLine.split(";")[1])
                .map(PhoneNumberCost::new)
                .distinct()
                .collect(Collectors.toMap(PhoneNumberCost::getPhoneNumber, x->x));

        Arrays.stream(logLines).forEach(logLine-> {
            final String[] phoneCallLogEntry = logLine.split(";");
            final String durationString = phoneCallLogEntry[0];
            final LocalTime time = LocalTime.parse(durationString, DateTimeFormatter.ISO_TIME);
            uniquePhoneNumbers.get(phoneCallLogEntry[1]).addEntry(time.toSecondOfDay());
        });

        final Optional<PhoneNumberCost> max =
                uniquePhoneNumbers.values().stream()
                        .max(Comparator.comparingInt(PhoneNumberCost::getDuration)
                                .thenComparing(PhoneNumberCost::getPhoneNumber)
                                .reversed());

        final PhoneNumberCost phoneNumberCostMax = max.get();
        System.out.println(phoneNumberCostMax.getPhoneNumber());

        return uniquePhoneNumbers.values().stream().filter(x-> !x.equals(phoneNumberCostMax)).mapToInt(x->x.getCosts()).sum();
    }

    class PhoneNumberCost {
        public static final int PRICE_PER_SECOND = 3;
        public static final int PRICE_PER_MINUTE = 150;
        private final String phoneNumber;
        private int duration;
        private int costs;

        public PhoneNumberCost(final String phoneNumber) {
            this.phoneNumber = phoneNumber;
            this.duration = 0;
            this.costs = 0;
        }

        public void addEntry(int duration) {
            this.duration += duration;
            this.costs += calculateCost(duration);
        }

        private int calculateCost(int duration) {
            if(duration < 300) {
                return duration * PRICE_PER_SECOND;
            } else if (duration % 60 == 0){
                return (duration / 60)* PRICE_PER_MINUTE;
            } else {
                return ((duration / 60) + 1) * PRICE_PER_MINUTE;
            }
        }

        public int getCosts() {
            return costs;
        }

        public int getDuration() {
            return duration;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PhoneNumberCost that = (PhoneNumberCost) o;

            return phoneNumber != null ? phoneNumber.equals(that.phoneNumber) : that.phoneNumber == null;
        }

        @Override
        public int hashCode() {
            return phoneNumber != null ? phoneNumber.hashCode() : 0;
        }
    }
}
