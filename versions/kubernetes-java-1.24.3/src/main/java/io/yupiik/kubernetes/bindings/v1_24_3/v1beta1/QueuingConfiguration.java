package io.yupiik.kubernetes.bindings.v1_24_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_24_3.Validable;
import io.yupiik.kubernetes.bindings.v1_24_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class QueuingConfiguration implements Validable<QueuingConfiguration> {
    private Integer handSize;
    private Integer queueLengthLimit;
    private Integer queues;

    public QueuingConfiguration() {
        // no-op
    }

    public QueuingConfiguration(final Integer handSize,
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
        if (!(__other instanceof QueuingConfiguration)) {
            return false;
        }
        final QueuingConfiguration __otherCasted = (QueuingConfiguration) __other;
        return Objects.equals(handSize, __otherCasted.handSize) &&
            Objects.equals(queueLengthLimit, __otherCasted.queueLengthLimit) &&
            Objects.equals(queues, __otherCasted.queues);
    }

    public QueuingConfiguration handSize(final Integer handSize) {
        this.handSize = handSize;
        return this;
    }

    public QueuingConfiguration queueLengthLimit(final Integer queueLengthLimit) {
        this.queueLengthLimit = queueLengthLimit;
        return this;
    }

    public QueuingConfiguration queues(final Integer queues) {
        this.queues = queues;
        return this;
    }

    @Override
    public QueuingConfiguration validate() {
        return this;
    }
}
