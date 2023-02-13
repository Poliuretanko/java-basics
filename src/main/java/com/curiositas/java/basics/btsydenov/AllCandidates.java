package com.curiositas.java.basics.btsydenov;

public enum AllCandidates {
    BILL_CLINTON, ANGELA_MERKEL, EMMANUEL_MACRON, NELSON_MANDELA, VITALY_NALIVKIN;

    public String toDisplayName() {
        String[] CandidatesCapsNames = name().split("_");
        StringBuilder candidateNormalName = new StringBuilder();
        for (String word : CandidatesCapsNames) {
            candidateNormalName.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        return candidateNormalName.toString().trim();
    }
}
