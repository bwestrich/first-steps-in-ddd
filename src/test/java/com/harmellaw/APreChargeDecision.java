package com.harmellaw;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class APreChargeDecision {

    private CriminalCase criminalCase;

    @BeforeEach
    public void setup() {
        List offenses = new ArrayList();
        offenses.add(new AlternativeCharge(CriminalOffence.CUTTING_AWAY_BUOYS_ETC, 10));
        criminalCase = new CriminalCase(new Suspect(CriminalOffence.FIRING_ON_REVENUE_VESSEL), offenses);
    }

    //@Disabled("So the CI build stays green.  Remove this to get coding.")
    @Test
    public void shouldRecordAlternativeOffenceAdviceAgainstSuspects() {
        assertNotNull(criminalCase);
        assertNotNull(criminalCase.alternativeCharges);
    }

}
