package io.yupiik.kubernetes.bindings.v1_19_4.v1beta1;

import java.util.Objects;

public class EventListItemsSeries {
    private int count;
    private String lastObservedTime;

    public EventListItemsSeries() {
        // no-op
    }

    public EventListItemsSeries(final int count,
                                final String lastObservedTime) {
        // no-op
    }

    public int getCount() {
        return count;
    }

    public void setCount(final int count) {
        this.count = count;
    }

    public String getLastObservedTime() {
        return lastObservedTime;
    }

    public void setLastObservedTime(final String lastObservedTime) {
        this.lastObservedTime = lastObservedTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                count,
                lastObservedTime);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EventListItemsSeries)) {
            return false;
        }
        final EventListItemsSeries __otherCasted = (EventListItemsSeries) __other;
        return Objects.equals(count, __otherCasted.count) &&
            Objects.equals(lastObservedTime, __otherCasted.lastObservedTime);
    }
}
