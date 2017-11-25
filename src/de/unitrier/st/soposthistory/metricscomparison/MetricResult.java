package de.unitrier.st.soposthistory.metricscomparison;

public class MetricResult {
    private int postBlockVersionCount;
    private int possibleConnections;
    private int truePositives;
    private int falsePositives;
    private int trueNegatives;
    private int falseNegatives;
    private int failedPredecessorComparisons;

    MetricResult() {
        this.postBlockVersionCount = 0;
        this.possibleConnections = 0;
        this.truePositives = 0;
        this.falsePositives = 0;
        this.trueNegatives = 0;
        this.falseNegatives = 0;
        this.failedPredecessorComparisons = 0;
    }

    public int getPostBlockVersionCount() {
        return postBlockVersionCount;
    }

    public int getPossibleConnections() {
        return possibleConnections;
    }

    public int getTruePositives() {
        return truePositives;
    }

    public int getFalsePositives() {
        return falsePositives;
    }

    public int getTrueNegatives() {
        return trueNegatives;
    }

    public int getFalseNegatives() {
        return falseNegatives;
    }

    public int getFailedPredecessorComparisons() {
        return failedPredecessorComparisons;
    }

    void setPostBlockVersionCount(int postBlockVersionCount) {
        this.postBlockVersionCount = postBlockVersionCount;
    }

    void setPossibleConnections(int possibleConnections) {
        this.possibleConnections = possibleConnections;
    }

    void setTruePositives(int truePositives) {
        this.truePositives = truePositives;
    }

    void setFalsePositives(int falsePositives) {
        this.falsePositives = falsePositives;
    }

    void setTrueNegatives(int trueNegatives) {
        this.trueNegatives = trueNegatives;
    }

    void setFalseNegatives(int falseNegatives) {
        this.falseNegatives = falseNegatives;
    }

    void setFailedPredecessorComparisons(int failedPredecessorComparisons) {
        this.failedPredecessorComparisons = failedPredecessorComparisons;
    }

    void add(MetricResult result) {
        postBlockVersionCount += result.getPostBlockVersionCount();
        possibleConnections += result.getPossibleConnections();
        truePositives += result.getTruePositives();
        falsePositives += result.getFalsePositives();
        trueNegatives += result.getTrueNegatives();
        falseNegatives += result.getFalseNegatives();
        failedPredecessorComparisons += result.getFailedPredecessorComparisons();
    }
}
