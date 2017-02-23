package uk.co.craftsmanshiplimited.codility.phoneCallLog;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by Henrik on 19/02/2017.
 */
public class Solution {
    public int solution(final String S) {
        if(S == null || S.isEmpty()) {
            return 0;
        }
        final Map<String, PhoneNumberCost> entries = new HashMap<>();
        final String[] logLines = S.split(Character.toString((char)10));

        for(final String logLine : logLines) {
            final String[] phoneCallLogEntry = logLine.split(",");
            final String durationString = phoneCallLogEntry[0];

            LocalTime time = LocalTime.parse(durationString, DateTimeFormatter.ISO_TIME);
            Duration between = Duration.between(LocalTime.of(0, 0, 0), time);

            final String phoneNumber = phoneCallLogEntry[1];

            if(entries.get(phoneNumber) == null) {
                entries.put(phoneNumber, new PhoneNumberCost(phoneCallLogEntry[1]));
            }
            entries.get(phoneNumber).addEntry((int)between.getSeconds());
        }

        final Optional<PhoneNumberCost> max = entries.values().stream().max(Comparator.comparingInt(PhoneNumberCost::getDuration).thenComparing(PhoneNumberCost::getPhoneNumber).reversed());
        PhoneNumberCost phoneNumberCostMax = max.get();
        System.out.println(phoneNumberCostMax.getPhoneNumber());

        return entries.values().stream().filter(x-> !x.getPhoneNumber().equals(phoneNumberCostMax.getPhoneNumber())).mapToInt(x->x.getCosts()).sum();
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
    }
}
