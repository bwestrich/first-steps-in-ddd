package com.harmellaw;

import java.util.List;
import java.util.Set;

public class CriminalCase {
    public PNCId pncId;
    public Set<Suspect> suspects;
    Suspect suspect;
    List<AlternativeCharge> alternativeCharges;

    public CriminalCase(Suspect suspect, List<AlternativeCharge> alternativeCharges) {
        this.suspect = suspect;
        this.alternativeCharges = alternativeCharges;
    }
}
