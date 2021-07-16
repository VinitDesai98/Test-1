package com.devfactory.bandcamp.teams.assignments.history;

import com.devfactory.bandcamp.CheckedTransactional;
import com.devfactory.bandcamp.model.enums.AvatarType;
import com.devfactory.bandcamp.teams.assignments.AssignmentService;
import com.devfactory.bandcamp.teams.assignments.model.AssignmentHistory;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import javax.inject.Inject;
import org.springframework.stereotype.Service;

@Service
@CheckedTransactional
public class AssignmentHistoryProvider {

    @Inject
    private AssignmentService assignmentService;

    public List<AssignmentHistory> provide(final LocalDate from, final LocalDate to,
            long assignmentId, final AvatarType avatarType) {

        return assignmentService.get(assignmentId, avatarType)
                .getHistories(from, to, Optional.empty(), Optional.empty());
    }

}

public class AssignmentService {
    public void get() {

    }

    public void getHistories() {
        
    }
}