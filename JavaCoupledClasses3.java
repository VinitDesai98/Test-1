package com.devfactory.bandcamp.teams.insights.reports.xls.extractor.meeting;

import com.devfactory.bandcamp.teams.insights.model.MeetingInsight;
import com.devfactory.bandcamp.teams.insights.reports.xls.generator.PercentageColumnGenerator;
import java.math.BigDecimal;
import java.util.Map;

public class InternalMeetingExtractorColumnGenerator extends PercentageColumnGenerator<MeetingInsight> {

    public InternalMeetingExtractorColumnGenerator(Map<Long, MeetingInsight> data) {
        super(data);
    }

    public String getHeader() {
        return "Same Company";
    }

    @Override
    protected BigDecimal getDividend(MeetingInsight entry) {
        return BigDecimal.valueOf(entry.getInternalTime());
    }

    @Override
    protected BigDecimal getDivisor(MeetingInsight entry) {
        return BigDecimal.valueOf(entry.getExternalTime() + entry.getInternalTime());
    }
}
