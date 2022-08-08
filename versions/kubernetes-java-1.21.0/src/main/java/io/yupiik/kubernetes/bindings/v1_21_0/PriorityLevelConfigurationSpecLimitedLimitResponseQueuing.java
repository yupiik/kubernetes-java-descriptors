package io.yupiik.kubernetes.bindings.v1_21_0;

import java.util.Objects;

public class PriorityLevelConfigurationSpecLimitedLimitResponseQueuing {
    private Integer handSize;
    private Integer queueLengthLimit;
    private Integer queues;

    public PriorityLevelConfigurationSpecLimitedLimitResponseQueuing() {
        // no-op
    }

    public PriorityLevelConfigurationSpecLimitedLimitResponseQueuing(final Integer handSize,
                                                                     final Integer queueLengthLimit,
                                                                     final Integer queues) {
        // no-op
    }

    public Integer getHandSize() {
        return handSize;
    }

    public void setHandSize(final Integer handSize) {
        this.handSize = handSize;
    }

    public Integer getQueueLengthLimit() {
        return queueLengthLimit;
    }

    public void setQueueLengthLimit(final Integer queueLengthLimit) {
        this.queueLengthLimit = queueLengthLimit;
    }

    public Integer getQueues() {
        return queues;
    }

    public void setQueues(final Integer queues) {
        this.queues = queues;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                handSize,
                queueLengthLimit,
                queues);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PriorityLevelConfigurationSpecLimitedLimitResponseQueuing)) {
            return false;
        }
        final PriorityLevelConfigurationSpecLimitedLimitResponseQueuing __otherCasted = (PriorityLevelConfigurationSpecLimitedLimitResponseQueuing) __other;
        return Objects.equals(handSize, __otherCasted.handSize) &&
            Objects.equals(queueLengthLimit, __otherCasted.queueLengthLimit) &&
            Objects.equals(queues, __otherCasted.queues);
    }
}
