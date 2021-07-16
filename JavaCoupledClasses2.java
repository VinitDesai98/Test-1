package com.devfactory.bandcamp.timetracking.workdiaries.v2.insights.worktime;

import static org.assertj.core.api.Assertions.assertThat;

import com.devfactory.bandcamp.timetracking.workdiaries.v2.insights.common.OccurredWithinMapper;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.Test;

public class OccurredWithinMapperTest {

    private final OccurredWithinMapper mapper = new OccurredWithinMapper();

    @Test
    public void ToHourOfDay_ExpectHourReturned() {
        assertThat(mapper.toHourOfDay(dateTime("2015-06-12T04:20:55-06:00"))).isEqualTo(4);
    }

    @Test
    public void ToDayOfWeek_ExpectDateReturned() {
        assertThat(mapper.toDayOfWeek(dateTime("2011-12-03T10:15:30+01:00"))).isEqualTo(LocalDate.parse("2011-12-03"));
    }

    private ZonedDateTime dateTime(String dateTime) {
        return ZonedDateTime.parse(dateTime, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }
}

public class OccurredWithinMapper {
    public void toHourOfDay() {

    }

    public void toDayOfWeek() {
        
    }
}